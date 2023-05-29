package com.example.sicantikbangsa
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.sicantikbangsa.dashboard.BottomNav



class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    override fun onBackPressed() {
        val intent = Intent(Intent.ACTION_MAIN)
        intent.addCategory(Intent.CATEGORY_HOME)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
    fun BukaDaftar(view: View) {
        val intent = Intent(this, Regis::class.java)
        startActivity(intent)
    }
    fun Loginbt(view: View) {
        val intent = Intent(this, BottomNav::class.java)
        startActivity(intent)
    }

}