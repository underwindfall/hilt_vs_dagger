package com.qifan.dagger.di

import dagger.Component

@PerActivity
@Component(modules = [ActivityModule::class])
interface ActivityComponent