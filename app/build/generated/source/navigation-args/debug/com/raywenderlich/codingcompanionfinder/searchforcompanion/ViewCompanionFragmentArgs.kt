package com.raywenderlich.codingcompanionfinder.searchforcompanion

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.raywenderlich.codingcompanionfinder.models.Animal
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class ViewCompanionFragmentArgs(val animal: Animal) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
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

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ViewCompanionFragmentArgs {
            bundle.setClassLoader(ViewCompanionFragmentArgs::class.java.classLoader)
            val __animal : Animal?
            if (bundle.containsKey("animal")) {
                if (Parcelable::class.java.isAssignableFrom(Animal::class.java) ||
                        Serializable::class.java.isAssignableFrom(Animal::class.java)) {
                    __animal = bundle.get("animal") as Animal?
                } else {
                    throw UnsupportedOperationException(Animal::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__animal == null) {
                    throw IllegalArgumentException("Argument \"animal\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"animal\" is missing and does not have an android:defaultValue")
            }
            return ViewCompanionFragmentArgs(__animal)
        }
    }
}
