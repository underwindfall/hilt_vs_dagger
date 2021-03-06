package com.qifan.dagger.di

import com.qifan.dagger.DaggerApp
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: DaggerApp)
}