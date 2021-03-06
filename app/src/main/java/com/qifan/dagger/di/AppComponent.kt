package com.qifan.dagger.di

import com.qifan.dagger.DaggerApp
import com.qifan.dagger.DummyActivity
import com.qifan.dagger.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, ActivityModule::class])
interface AppComponent {
    fun inject(app: DaggerApp)

    fun inject(mainActivity: MainActivity)

    fun inject(dummyActivity: DummyActivity)
}