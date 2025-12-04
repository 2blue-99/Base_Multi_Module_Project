package com.blue.base_multi_module_project.util

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class HiltApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        initTimber()
    }
    private fun initTimber(){
        Timber.Forest.plant(LogDebugTree("Lotto_App"))
    }
}