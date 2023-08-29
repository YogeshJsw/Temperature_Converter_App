package com.yogeshj.temperatureconverter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yogeshj.temperatureconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private var temperature:Double=0.0
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonC.setOnClickListener {
            temperature=binding.editText.text.toString().toDouble()
            val celsius=(temperature-32)*1.8
            binding.result.text = "$celsius°C"
        }

        binding.buttonF.setOnClickListener {
            temperature=binding.editText.text.toString().toDouble()
            val fahrenheit=(temperature*1.8)+32
            binding.result.text="$fahrenheit°F"
        }

    }
}