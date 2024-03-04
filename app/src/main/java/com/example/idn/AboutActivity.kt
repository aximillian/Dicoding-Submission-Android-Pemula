package com.example.idn

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.widget.ImageView


class AboutActivity : AppCompatActivity() {
    private lateinit var instagram: ImageView
    private lateinit var linkedin: ImageView
    private lateinit var github: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        instagram = findViewById(R.id.instagram)
        linkedin = findViewById(R.id.linkedin)
        github = findViewById((R.id.github))

        instagram.setOnClickListener {
            openInstagram()
        }

        linkedin.setOnClickListener {
            openLinkedIn()
        }

        github.setOnClickListener {
            openGitHub()
        }
    }

    private fun openInstagram() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bryanmaximilliann"))
        startActivity(intent)
    }

    private fun openLinkedIn() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/bryan-maximillian"))
        startActivity(intent)
    }

    private fun openGitHub() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/aximillian"))
        startActivity(intent)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}