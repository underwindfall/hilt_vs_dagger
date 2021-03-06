package com.qifan.dagger

import android.app.Application
import com.qifan.dagger.di.AppComponent
import com.qifan.dagger.di.DaggerAppComponent

class DaggerApp : Application() {
    internal lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .create()
        appComponent.inject(this)
    }
}