package com.raywenderlich.codingcompanionfinder

import android.app.Application
import org.koin.android.ext.android.startKoin

class CodingCompanionFinder: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(appModule, urlsModule))
    }
}