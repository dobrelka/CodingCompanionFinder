package com.raywenderlich.codingcompanionfinder.searchforcompanion

import androidx.lifecycle.ViewModel

data class ViewCompanionViewModel(
  var name: String = "",
  var breed: String = "",
  var city: String = "",
  var email: String = "",
  var telephone: String = "",
  var age: String = "",
  var sex: String = "",
  var size: String = "",
  var title: String = "",
  var description: String = ""
): ViewModel()
