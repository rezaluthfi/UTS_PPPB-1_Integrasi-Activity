package com.example.utsintegrasiactivitykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsintegrasiactivitykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding) {
            btnSubmit.setOnClickListener { 
                if (etFullname.text.toString().isEmpty()) {
                    Toast.makeText(this@MainActivity, "Enter your name first", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    val intent = Intent(this@MainActivity, ProfileActivity::class.java).apply {
                        putExtra("fullname", etFullname.text.toString())
                    }
                    startActivity(intent)
                }
            }
        }

    }
}