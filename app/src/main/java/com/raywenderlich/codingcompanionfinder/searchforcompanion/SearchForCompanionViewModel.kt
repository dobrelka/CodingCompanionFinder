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

  val animals: MutableLiveData<ArrayList<Animal>> = MutableLiveData<ArrayList<Animal>>()
  lateinit var accessToken: String
  lateinit var petFinderService: PetFinderService

  fun searchForCompanions() {

    GlobalScope.launch {
      EventBus.getDefault().post(IdlingEntity(1))

      val getAnimalRequest = petFinderService.getAnimals(accessToken, location = companionLocation.value)

      val searchForPetResponse = getAnimalRequest.await()

      GlobalScope.launch(Dispatchers.Main) {
        if (searchForPetResponse.isSuccessful) {
          searchForPetResponse.body()?.let {

            animals.postValue(it.animals)
            if (it.animals.size > 0) {

              noResultsViewVisiblity.postValue(INVISIBLE)
            } else {

              noResultsViewVisiblity.postValue(View.VISIBLE)
            }
          }
        } else {
          noResultsViewVisiblity.postValue(View.VISIBLE)
        }
      }
      EventBus.getDefault().post(IdlingEntity(-1))
    }
  }
}