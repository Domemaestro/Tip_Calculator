package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.NumberFormat
import java.util.*

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
        val cost = stringInput.toDouble() //Converting Input String to Double

        val stringInput2 = tipPercent.text.toString()
        val tipPercen = stringInput2.toDouble() //Converting Input String to Double

        val stringInput3 = splitNo.text.toString()
        val noOfPeople = stringInput3.toDouble() //Converting Input String to Double


        val tipResult = cost * (tipPercen/100) //Formula to Calculate Tip
        val amountSplit = cost / noOfPeople //Splitting per Person
        val finalAmount = cost + tipResult //Final Display Amount
        val finalSplit = amountSplit + tipResult //Final Split Amount

        //formatting to local currency
        val formatTip = NumberFormat.getCurrencyInstance().format(tipResult)
        val formatCost = NumberFormat.getCurrencyInstance().format(cost)
        val formatFinal = NumberFormat.getCurrencyInstance().format(finalAmount)
        val formatSplit = NumberFormat.getCurrencyInstance().format(finalSplit)
        displayResult.text = "Answer:\n\n" + "   " + "Bill Amount + Tip %: "+ formatCost.toString() + " + " + formatTip.toString() + " = " + formatFinal.toString() + "\n\n" + "   " + "Split Amount Per Person: " + formatSplit.toString()



    }
    private fun clear(){
        billAmount.text.clear()
        tipPercent.text.clear()

    }

}