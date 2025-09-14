package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativoap1.databinding.ActivityTelaErickBinding
import androidx.core.net.toUri

class tela_erick : AppCompatActivity() {
    private lateinit var binding: ActivityTelaErickBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaErickBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logoGithub.setOnClickListener {
            val url = "https://github.com/ErickXr"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = url.toUri()
            startActivity(intent)
        }

        binding.logoLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/in/erick-xavier-0a0b572a9/"
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