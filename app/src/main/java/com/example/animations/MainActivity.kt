package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Refer the ImageView like this
        val imageView = findViewById<ImageView>(R.id.logo_one)

        // Load the animation like this
        val animSlide = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_left_to_right_in
        )
        val animFade = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.fade_in
        )
        // Start the animation like this
        // imageView.startAnimation(animSlide)

        val s = AnimationSet(false)//false means don't share interpolators
        s.addAnimation(animSlide)
        s.addAnimation(animFade)
        s.setAnimationListener(object: Animation.AnimationListener {
            override fun onAnimationRepeat(animation: Animation?) {}
            override fun onAnimationStart(animation: Animation?) {}
            override fun onAnimationEnd(animation:Animation) {

            }
        })
        imageView.startAnimation(s)
    }

}
