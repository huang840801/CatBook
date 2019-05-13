package com.guanhong.catbook.ui.main

import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v4.view.ViewPager
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import com.guanhong.catbook.*
import com.guanhong.catbook.base.BaseActivity
import com.guanhong.catbook.ui.home.HomeFragment
import com.guanhong.catbook.ui.mail.MailFragment
import com.guanhong.catbook.ui.notification.NotificationFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(),
        MainContract.View,
        BottomNavigationView.OnNavigationItemSelectedListener,
        ViewPager.OnPageChangeListener, NavigationView.OnNavigationItemSelectedListener {

    @Inject
    lateinit var presenter: MainPresenter

    private lateinit var homeFragment: HomeFragment
    private lateinit var mailFragment: MailFragment
    private lateinit var notificationFragment: NotificationFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.test()

        bottomNavigation.setOnNavigationItemSelectedListener(this)
        setupViewPager()

        toolbar.setPadding(0, getStatusBarHeight(), 0, 0)

        setSupportActionBar(toolbar)
        supportActionBar!!.title = "側邊攔"
        val actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        drawerLayout.clipToPadding = false
        drawerLayout.fitsSystemWindows = true
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.navigation_home -> {
                viewPager.currentItem = 0
            }
            R.id.navigation_mail -> {
                viewPager.currentItem = 1
            }
            R.id.navigation_notifications -> {
                viewPager.currentItem = 2
            }
        }
        return true
    }

    override fun onPageScrollStateChanged(position: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
    }

    override fun onPageSelected(position: Int) {
        bottomNavigation.menu.getItem(position).isChecked = true
    }

    private fun setupViewPager() {

        homeFragment = HomeFragment().newInstance()
        mailFragment = MailFragment().newInstance()
        notificationFragment = NotificationFragment().newInstance()

        val fragmentList = mutableListOf<Fragment>()
        fragmentList.add(homeFragment)
        fragmentList.add(mailFragment)
        fragmentList.add(notificationFragment)

        val adapter = MainViewPagerAdapter(supportFragmentManager, fragmentList)

        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = fragmentList.count() - 1
        viewPager.addOnPageChangeListener(this)
    }
}
