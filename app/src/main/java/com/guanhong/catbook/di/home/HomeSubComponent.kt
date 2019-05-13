package com.guanhong.catbook.di.home

import com.guanhong.catbook.ui.home.HomeFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [HomePresenterModule::class])
interface HomeSubComponent :AndroidInjector<HomeFragment>{
    @Subcomponent.Builder
abstract class Builder: AndroidInjector.Builder<HomeFragment>()
}