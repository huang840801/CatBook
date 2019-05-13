package com.guanhong.catbook.di

import android.content.Context
import com.guanhong.catbook.CatBook
import com.guanhong.catbook.di.main.MainSubComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [
    MainSubComponent::class])
class AppModule {

    @Provides
    fun contextProvider(application: CatBook): Context {
        return application.applicationContext
    }
}