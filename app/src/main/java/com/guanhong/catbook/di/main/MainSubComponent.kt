package com.guanhong.catbook.di.main

import com.guanhong.catbook.ui.main.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [MainPresenterModule::class])
interface MainSubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<MainActivity>()
}