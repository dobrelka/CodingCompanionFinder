package com.raywenderlich.codingcompanionfinder.searchforcompanion

import android.view.View
import android.view.View.INVISIBLE
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.raywenderlich.codingcompanionfinder.models.Animal
import com.raywenderlich.codingcompanionfinder.retrofit.PetFinderService
import com.raywenderlich.codingcompanionfinder.testhooks.IdlingEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus

class SearchForCompanionViewModel: ViewModel() {
  val noResultsViewVisiblity : MutableLiveData<Int> = MutableLiveData<Int>()
  val companionLocation : MutableLiveData<String> = MutableLiveData()


}