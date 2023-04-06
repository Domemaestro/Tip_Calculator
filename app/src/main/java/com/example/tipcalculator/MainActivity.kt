package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var billAmount : EditText
    private lateinit var tipPercent : EditText
    private lateinit var splitNo : EditText
    private lateinit var calBtn : Button
    private lateinit var clearBtn : Button
    private lateinit var displayResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        billAmount = findViewById(R.id.billEt)
        tipPercent = findViewById(R.id.tipEt)
        splitNo = findViewById(R.id.splitBillEt)
        calBtn = findViewById(R.id.calBtn)
        clearBtn = findViewById(R.id.clearBtn)
        displayResult = findViewById(R.id.displayTv)

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
        val tipPercen = stringInput2.toDouble()

        val tipResult = cost * (tipPercen/100)
        displayResult.text = tipResult.toString()



    }
    private fun clear(){

    }

}