package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText,
            binding.boxFourText, binding.boxFiveText, binding.constraintLayout)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light))
            R.id.box_four_text ->  view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_dark))
            R.id.box_five_text -> view.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light))
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}