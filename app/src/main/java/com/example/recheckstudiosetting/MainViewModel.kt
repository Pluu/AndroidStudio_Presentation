package com.example.recheckstudiosetting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val _sampleData = MutableLiveData<Boolean>()
    val sampleData: LiveData<Boolean> get() = _sampleData

    fun load() {
        viewModelScope.launch {
            delay(1_000)
            _sampleData.value = true
        }
    }
}