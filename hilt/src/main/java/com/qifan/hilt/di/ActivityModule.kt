package com.qifan.hilt.di

import android.util.Log
import com.qifan.hilt.MainPresenter
import com.qifan.hilt.MainPresenterImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {
    @Provides
    fun provideMainPresenter(): MainPresenter {
        Log.d("MainPresenterImpl", "==== Hilt Provide injection ====")
        return MainPresenterImpl()
    }
}