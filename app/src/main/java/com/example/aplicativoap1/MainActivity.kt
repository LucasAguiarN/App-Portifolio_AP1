package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativoap1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIntegrantes.setOnClickListener {
            val intent = Intent(this, tela_integrantes::class.java)
            startActivity(intent)
        }

        binding.btnCigarro.setOnClickListener {
            val intent = Intent(this, exercicio_cigarro::class.java)
            startActivity(intent)
        }
    }
}