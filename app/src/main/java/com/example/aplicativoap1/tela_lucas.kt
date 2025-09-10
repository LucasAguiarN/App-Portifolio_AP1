package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.aplicativoap1.databinding.ActivityTelaLucasBinding

class tela_lucas : AppCompatActivity() {
    private lateinit var binding: ActivityTelaLucasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaLucasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logoGithub.setOnClickListener {
            val url = "https://github.com/Lucas-Aguiar-Nunes"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.logoLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/lucas-aguiar-nunes/"
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