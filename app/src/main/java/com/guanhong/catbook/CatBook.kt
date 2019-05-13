package com.guanhong.catbook

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Application
import android.content.Context
import android.support.v4.app.Fragment
import com.guanhong.catbook.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class CatBook : Application(), HasActivityInjector, HasSupportFragmentInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    companion object {

        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
    }
    override fun activityInjector(): AndroidInjector<Activity> {
        return dispatchingActivityInjector
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return dispatchingFragmentInjector
    }

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.create().inject(this)

        context = this
    }
}