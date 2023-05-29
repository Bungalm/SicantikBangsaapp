package com.example.sicantikbangsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sicantikbangsa.R

class Regis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regis)
    }
    fun LanjutDaftar(view: View) {
        val intent = Intent(this, Regis2::class.java)
        startActivity(intent)
    }
}