package com.guanhong.catbook.ui.home

import com.guanhong.catbook.repository.HomeRepository
import javax.inject.Inject

class HomePresenter @Inject constructor(private val view: HomeContract.View,
                                        private val repository: HomeRepository) : HomeContract.Presenter{
    override fun test() {
    }
}