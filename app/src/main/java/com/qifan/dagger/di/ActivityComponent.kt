package com.qifan.dagger.di

import com.qifan.dagger.MainActivity
import dagger.Component

//@PerActivity
@Component(modules = [ActivityModule::class])
interface ActivityComponent{
    fun inject(mainActivity: MainActivity)
}