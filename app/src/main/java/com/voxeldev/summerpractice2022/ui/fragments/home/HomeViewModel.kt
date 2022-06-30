package com.voxeldev.summerpractice2022.ui.fragments.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Главный фрагмент"
    }
    val text: LiveData<String> = _text
}