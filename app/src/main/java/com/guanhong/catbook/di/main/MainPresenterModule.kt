package com.guanhong.catbook.di.main

import com.guanhong.catbook.ui.main.MainActivity
import com.guanhong.catbook.ui.main.MainContract
import dagger.Module
import dagger.Provides

@Module
class MainPresenterModule {

    @Provides
    fun viewProvider(activity: MainActivity): MainContract.View {
        return activity
    }
}