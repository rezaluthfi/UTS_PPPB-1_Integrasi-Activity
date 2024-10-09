package com.example.utsintegrasiactivitykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsintegrasiactivitykotlin.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityProfileBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        // Ambil data dari MainActivity
        val fullname = intent.getStringExtra("fullname")

        with(binding) {
            // Tampilkan data di TextView
            tvUsername.text = fullname

            btnKeluar.setOnClickListener {
                // Intent untuk kembali ke LoginActivity
                val intent = Intent(this@ProfileActivity, LoginActivity::class.java)
                startActivity(intent)
                Toast.makeText(
                    this@ProfileActivity,
                    "You have successfully logged out",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
        }

    }
}