package com.example.sicantikbangsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView

class MainActivity : AppCompatActivity() {override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splashscreen)

    val logo = findViewById<ImageView>(R.id.logo)
    val animFadeUp = AnimationUtils.loadAnimation(this, R.anim.fade_up)
    logo.startAnimation(animFadeUp)

    Handler(Looper.getMainLooper()).postDelayed({
        val intent = Intent(this@MainActivity, Login::class.java)
        startActivity(intent)
        finish()
    }, 1500)
}
    }
