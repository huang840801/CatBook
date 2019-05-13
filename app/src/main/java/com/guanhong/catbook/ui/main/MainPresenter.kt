package com.guanhong.catbook.ui.main

import android.util.Log
import javax.inject.Inject

class MainPresenter @Inject constructor(private val view: MainContract.View):MainContract.Presenter {
    override fun test() {

        Log.d("Huang", " AAAAAAAAAAAAAAAAAAA")
    }
}