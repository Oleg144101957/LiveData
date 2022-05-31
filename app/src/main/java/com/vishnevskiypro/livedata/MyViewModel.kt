package com.vishnevskiypro.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private var liveData = MutableLiveData<String>()
    val _liveData = liveData

    fun setShitText(shitText: String){
        _liveData.value = shitText
    }
}