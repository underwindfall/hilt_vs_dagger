package com.qifan.dagger.di

import android.util.Log
import com.qifan.dagger.MainPresenter
import com.qifan.dagger.MainPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class ActivityModule {
    @Provides
//    @PerActivity
    fun providePresenter(): MainPresenter {
        Log.d("MainPresenterImpl", "==== Dagger Provide injection ====")
        return MainPresenterImpl()
    }
}