package com.d.four.f.example

import android.app.Application
import com.d.four.f.example.di.modulesArr
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            androidLogger()
            modules(modulesArr)
        }
    }
}