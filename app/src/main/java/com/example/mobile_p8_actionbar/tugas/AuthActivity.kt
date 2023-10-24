package com.example.mobile_p8_actionbar.tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.mobile_p8_actionbar.R
import com.example.mobile_p8_actionbar.TabAdapter
import com.example.mobile_p8_actionbar.databinding.ActivityAuthBinding
import com.example.mobile_p8_actionbar.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class AuthActivity : AppCompatActivity() {

    lateinit var mediator: TabLayoutMediator
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityAuthBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        title = "Dashboard"
        setContentView(binding.root)
        supportActionBar?.hide()
        with(binding){
            viewPager2 = authViewPager
            authViewPager.adapter = AuthTabAdapter(supportFragmentManager, this@AuthActivity.lifecycle)
            mediator = TabLayoutMediator(authTabLayout, authViewPager)
            {tab,position ->
                when(position){
                    0->tab.text = "Register"
                    1->tab.text = "Log In"
                }
            }
            mediator.attach()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_option, menu)
        return super.onCreateOptionsMenu(menu)
    }


}