package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val billAmount = findViewById<EditText>(R.id.billEt)
    private val tipPercent = findViewById<EditText>(R.id.tipEt)
    private val splitNo = findViewById<EditText>(R.id.splitBillEt)
    private val calBtn = findViewById<Button>(R.id.calBtn)
    private val clearBtn = findViewById<Button>(R.id.clearBtn)
    private val displayResult = findViewById<TextView>(R.id.displayTv)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calBtn.setOnClickListener {
            calculate()
        }
        clearBtn.setOnClickListener {
            clear()
        }

    }

    private fun calculate(){
        val stringInput = billAmount.text.toString()
        val cost = stringInput.toDouble()

        val stringInput2 = tipPercent.text.toString()
        val tipPercen = stringInput2.toInt()

        val tipResult = cost * tipPercen
        displayResult.text = tipResult.toString()


    }
    private fun clear(){

    }

}