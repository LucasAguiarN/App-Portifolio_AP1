package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.aplicativoap1.databinding.ActivityTelaMurilloBinding

class tela_murillo : AppCompatActivity() {
    private lateinit var binding: ActivityTelaMurilloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaMurilloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logoGithub.setOnClickListener {
            val url = "https://github.com/murilloluiz21"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.logoLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/murilloinaciosouza/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}