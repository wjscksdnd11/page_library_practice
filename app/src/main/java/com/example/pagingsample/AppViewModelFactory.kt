package com.example.pagingsample

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class AppViewModelFactory(val app: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CheeseViewModel(app) as T
    }
}