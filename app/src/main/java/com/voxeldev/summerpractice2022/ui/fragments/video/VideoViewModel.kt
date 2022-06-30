package com.voxeldev.summerpractice2022.ui.fragments.video

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VideoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Тут должны быть видео"
    }
    val text: LiveData<String> = _text
}