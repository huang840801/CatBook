package com.guanhong.catbook.di.home

import com.guanhong.catbook.repository.HomeRepository
import com.guanhong.catbook.ui.home.HomeContract
import com.guanhong.catbook.ui.home.HomeFragment
import com.guanhong.catbook.ui.main.MainActivity
import dagger.Module
import dagger.Provides

@Module
class HomePresenterModule {

    @Provides
    fun viewProvider(fragment: HomeFragment): HomeContract.View{
        return fragment
    }

    @Provides
    fun repositoryProvider(): HomeRepository{
        return HomeRepository()
    }
}