package com.example.sicantikbangsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class Splashscreen : AppCompatActivity() {private val SPLASH_TIME_OUT = 3000L // Waktu tunggu dalam milidetik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        // Handler untuk menunggu beberapa saat sebelum mengarahkan ke halaman login
        Handler().postDelayed({
            startActivity(Intent(this, Onboard::class.java))
            finish() // Mengakhiri SplashActivity

        }, SPLASH_TIME_OUT)
    }
}