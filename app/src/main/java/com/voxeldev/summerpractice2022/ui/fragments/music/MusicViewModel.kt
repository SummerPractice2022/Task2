package com.voxeldev.summerpractice2022.ui.fragments.music

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Тут должна быть музыка"
    }
    val text: LiveData<String> = _text
}