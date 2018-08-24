package me.natedorman.quickq.ui.main

import androidx.lifecycle.ViewModel

class ButtonViewModel : ViewModel() {
    var counter = 0


    fun onFabPressed() {
        counter++
    }
    // TODO: Implement the ViewModel
}
