package com.qifan.dagger.di

import com.qifan.dagger.MainActivity
import dagger.Component

@Component(modules = [ActivityModule::class])
interface ActivityComponent{
    fun inject(mainActivity: MainActivity)
}