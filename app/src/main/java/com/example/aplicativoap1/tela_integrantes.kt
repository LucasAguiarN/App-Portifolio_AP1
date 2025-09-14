package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativoap1.databinding.ActivityTelaIntegrantesBinding

class tela_integrantes : AppCompatActivity() {
    private lateinit var binding: ActivityTelaIntegrantesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaIntegrantesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnErick.setOnClickListener {
            val intent = Intent(this, tela_erick::class.java)
            startActivity(intent)
        }

        binding.btnJulia.setOnClickListener {
            val intent = Intent(this, tela_julia::class.java)
            startActivity(intent)
        }

        binding.btnLucas.setOnClickListener {
            val intent = Intent(this, tela_lucas::class.java)
            startActivity(intent)
        }

        binding.btnMurillo.setOnClickListener {
            val intent = Intent(this, tela_murillo::class.java)
            startActivity(intent)
        }

        binding.btnVinicius.setOnClickListener {
            val intent = Intent(this, tela_vinicius::class.java)
            startActivity(intent)
        }

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}