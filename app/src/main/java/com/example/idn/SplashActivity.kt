package com.example.idn

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Tahan SS selama 2 detik
        Handler(Looper.getMainLooper()).postDelayed({
            // Masuk ke MainActivity setelah 2 detik
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Tutup SplashActivity Permanen
        }, 2000)
    }
}