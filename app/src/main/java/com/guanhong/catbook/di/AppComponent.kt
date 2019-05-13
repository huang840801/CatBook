package com.guanhong.catbook.di

import com.guanhong.catbook.CatBook
import com.guanhong.catbook.di.main.MainActivityModule
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    MainActivityModule::class])
interface AppComponent {
    fun inject(application: CatBook)
}