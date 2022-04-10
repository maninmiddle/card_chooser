package com.example.fsp.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.fsp.R
import com.example.fsp.adapter.ViewPagerAdapter
import com.example.fsp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var backgrounds = mutableListOf<Int>(
        R.drawable.gradient_card,
        R.drawable.gradient_card1,
        R.drawable.gradient_card2,
        R.drawable.typecard1,
        R.drawable.typecard2,
        R.drawable.typecard3
    )
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.viewPager.apply {
            adapter = ViewPagerAdapter(backgrounds)
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            binding.indicator.setViewPager(binding.viewPager)
        }
    }
}