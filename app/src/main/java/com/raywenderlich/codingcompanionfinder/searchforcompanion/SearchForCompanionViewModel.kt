package com.raywenderlich.codingcompanionfinder.searchforcompanion

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchForCompanionViewModel: ViewModel() {
  val noResultsViewVisiblity : MutableLiveData<Int> = MutableLiveData<Int>()
  val companionLocation : MutableLiveData<String> = MutableLiveData()  
}