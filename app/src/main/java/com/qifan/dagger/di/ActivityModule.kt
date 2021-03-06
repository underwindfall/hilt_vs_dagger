package com.qifan.dagger.di

import com.qifan.dagger.MainPresenter
import com.qifan.dagger.MainPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
    fun providePresenter(): MainPresenter = MainPresenterImpl()
}