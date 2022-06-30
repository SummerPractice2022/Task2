package com.voxeldev.summerpractice2022.ui.fragments.settings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Здесь должны быть настройки"
    }
    val text: LiveData<String> = _text
}