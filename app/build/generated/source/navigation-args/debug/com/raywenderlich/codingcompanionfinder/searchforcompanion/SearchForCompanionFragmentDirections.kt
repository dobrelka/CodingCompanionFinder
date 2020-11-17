package com.raywenderlich.codingcompanionfinder.searchforcompanion

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.raywenderlich.codingcompanionfinder.R
import com.raywenderlich.codingcompanionfinder.models.Animal
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class SearchForCompanionFragmentDirections private constructor() {
    private data class ActionSearchForCompanionFragmentToViewCompanion(val animal: Animal) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_searchForCompanionFragment_to_viewCompanion

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(Animal::class.java)) {
                result.putParcelable("animal", this.animal as Parcelable)
            } else if (Serializable::class.java.isAssignableFrom(Animal::class.java)) {
                result.putSerializable("animal", this.animal as Serializable)
            } else {
                throw UnsupportedOperationException(Animal::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionSearchForCompanionFragmentToViewCompanion(animal: Animal): NavDirections =
                ActionSearchForCompanionFragmentToViewCompanion(animal)
    }
}
