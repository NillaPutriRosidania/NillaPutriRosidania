package com.nilla.batikpedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class akun : AppCompatActivity() {

    private lateinit var bottomNavView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akun)

        val textViewIconChangePhoto: TextView = findViewById(R.id.textViewIconChangePhoto)
        val textViewIconChangeName: TextView = findViewById(R.id.textViewIconChangeName)
        val textViewIconChangeEmail: TextView = findViewById(R.id.textViewIconChangeEmail)
        val textViewIconChangePassword: TextView = findViewById(R.id.textViewIconChangePassword)
        val textViewIconAboutUs: TextView = findViewById(R.id.textViewIconAboutUs)

        textViewIconChangePhoto.setOnClickListener {
            val intent = Intent(this, UbahFoto::class.java)
            startActivity(intent)
        }

        textViewIconChangeName.setOnClickListener {
            val intent = Intent(this, UbahNama::class.java)
            startActivity(intent)
        }

        textViewIconChangeEmail.setOnClickListener {
            val intent = Intent(this, UbahEmail::class.java)
            startActivity(intent)
        }

        textViewIconChangePassword.setOnClickListener {
            val intent = Intent(this, UbahPassword::class.java)
            startActivity(intent)
        }

        textViewIconAboutUs.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        bottomNavView = findViewById(R.id.bottomNavigationView)
        bottomNavView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_beranda -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.menu_forum -> {
                    startActivity(Intent(this, Forum::class.java))
                    true
                }
                R.id.menu_akun -> {
                    startActivity(Intent(this, akun::class.java))
                    true
                }
                else -> false
            }
        }
    }
    }