package com.example.utsintegrasiactivitykotlin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.utsintegrasiactivitykotlin.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        with(binding) {
            btnLogin.setOnClickListener {
                // Cek apakah username dan password sudah diisi
                if (etFullname.text.toString().isEmpty() || etPassword.text.toString().isEmpty()) {
                    // Jika belum diisi, tampilkan pesan
                    // menggunakan Toast
                    Toast.makeText(
                        this@LoginActivity,
                        "Mohon isi email dan password",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

    }
}