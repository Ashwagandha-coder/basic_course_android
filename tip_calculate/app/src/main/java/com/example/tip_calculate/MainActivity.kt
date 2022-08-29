package com.example.tip_calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tip_calculate.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val button = binding.btnCalculate

        button.setOnClickListener { calculateTip() }


    }

    fun calculateTip() {

        val number = binding.etNumbers.text.toString()
        val cost = number.toDouble()


        val selectedId = binding.tipOptions.checkedRadioButtonId

        val percentSelectedId = when (selectedId) {

            R.id.amazing -> 0.20
            R.id.good -> 0.18
            else -> 0.15


        }

        var tip = percentSelectedId * cost

        val roundUp = binding.switchMain.isChecked

        if (roundUp)
            tip = kotlin.math.ceil(tip)


        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)

        binding.tvResult.text = getString(R.string.tip_amount, formattedTip)



    }



}