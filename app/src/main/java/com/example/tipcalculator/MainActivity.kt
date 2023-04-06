package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val billAmount = findViewById<EditText>(R.id.billEt)
    val tipPercent = findViewById<EditText>(R.id.tipEt)
    val splitNo = findViewById<EditText>(R.id.splitBillEt)
    val calBtn = findViewById<Button>(R.id.calBtn)
    val clearBtn = findViewById<Button>(R.id.clearBtn)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calBtn.setOnClickListener {
            calculate()
            clear()
        }

    }

    private fun calculate(){

    }
    private fun clear(){

    }

}