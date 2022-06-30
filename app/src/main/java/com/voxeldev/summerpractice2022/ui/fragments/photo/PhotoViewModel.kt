package com.voxeldev.summerpractice2022.ui.fragments.photo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PhotoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Здесь должны быть фото"
    }
    val text: LiveData<String> = _text
}