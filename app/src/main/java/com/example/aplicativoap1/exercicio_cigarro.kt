package com.example.aplicativoap1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aplicativoap1.databinding.ActivityExercicioCigarroBinding

class exercicio_cigarro : AppCompatActivity() {
    private lateinit var binding: ActivityExercicioCigarroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExercicioCigarroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnCalcular.setOnClickListener {
            val cigarros = binding.textCigarros.text.toString()
            val anos = binding.textAnos.text.toString()

            if (cigarros.isEmpty() || anos.isEmpty()){
                binding.textResultado.setText("Preencha todos os Campos!")
                binding.textResultado.setTextColor(getColor(R.color.white))
            }
            else{
                calcular_cigarros(cigarros.toInt(), anos.toInt())
            }
        }
    }
    fun calcular_cigarros(qtd_cigarros: Int, qtd_anos: Int){
        val total_cigarros: Int = qtd_cigarros * qtd_anos * 365
        val total_minutos_perdidos: Int = total_cigarros * 10
        val dias_perdidos: Int = total_minutos_perdidos / 1440
        binding.textResultado.setText("Você Perdeu $dias_perdidos Dias de Vida devido ao Cigarro")
        binding.textResultado.setTextColor(getColor(R.color.white))
    }
}