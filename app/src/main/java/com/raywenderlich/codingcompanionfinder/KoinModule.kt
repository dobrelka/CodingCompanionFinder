package com.raywenderlich.codingcompanionfinder

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.raywenderlich.codingcompanionfinder.retrofit.AuthorizationInterceptor
import com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService
import com.raywenderlich.codingcompanionfinder.searchforcompanion.SearchForCompanionViewModel
import com.raywenderlich.codingcompanionfinder.searchforcompanion.ViewCompanionViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val PETFINDER_URL = "PETFINDER_URL"

val urlsModule = module {
    single(name = PETFINDER_URL) {MainActivity.DEFAULT_PETFINDER_URL}
}
val appModule = module {
    single<PetFinderService> {
        val logger = HttpLoggingInterceptor()
        val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .connectTimeout(60L, TimeUnit.SECONDS)
                .readTimeout(60L, TimeUnit.SECONDS)
                .addInterceptor(AuthorizationInterceptor())
                .build()
        Retrofit.Builder()
                .baseUrl(get(PETFINDER_URL) as String)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .client(client)
                .build().create(PetFinderService::class.java)
    }
    viewModel { ViewCompanionViewModel() }
    viewModel { SearchForCompanionViewModel(get()) }
}