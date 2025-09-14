package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.aplicativoap1.databinding.ActivityTelaJuliaBinding

class tela_julia : AppCompatActivity() {
    private lateinit var binding: ActivityTelaJuliaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaJuliaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logoGithub.setOnClickListener {
            val url = "https://github.com/Jloren051"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.logoLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/julia-louren%C3%A7o-8065082ba/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, tela_integrantes::class.java)
            startActivity(intent)
        }
    }
}