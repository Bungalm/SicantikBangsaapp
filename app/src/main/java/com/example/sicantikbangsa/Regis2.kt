package com.example.sicantikbangsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Regis2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis2)
    }
    fun Daftar(view: View) {
        val intent = Intent(this, Dashboard::class.java)
        startActivity(intent)
    }
}