package com.guanhong.catbook.di

import android.content.Context
import com.guanhong.catbook.CatBook
import com.guanhong.catbook.di.home.HomeSubComponent
import com.guanhong.catbook.di.main.MainSubComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [
    MainSubComponent::class,
    HomeSubComponent::class])
class AppModule {

    @Provides
    fun contextProvider(application: CatBook): Context {
        return application.applicationContext
    }
}