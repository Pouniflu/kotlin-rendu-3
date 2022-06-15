package com.example.calculatricev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOperator = true
    var operator = "+"
    var initialNumber = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {
        if (isNewOperator) textView.setText("")
        isNewOperator = false
        var number: String = textView.text.toString()
        if (view.id == button_number_1.id) {
            number += "1"
        } else if (view.id === button_number_2.id){
            number += "2"
        } else if (view.id === button_number_3.id){
            number += "3"
        } else if (view.id === button_number_4.id){
            number += "5"
        } else if (view.id === button_number_5.id){
            number += "5"
        } else if (view.id === button_number_6.id){
            number += "6"
        } else if (view.id === button_number_7.id){
            number += "7"
        } else if (view.id === button_number_8.id){
            number += "8"
        } else if (view.id === button_number_9.id){
            number += "9"
        } else if (view.id === button_number_0.id){
            number += "0"
        }
        textView.setText(number)
    }

    fun operatorEvent(view: View) {
        isNewOperator = true
        initialNumber = textView.text.toString()
        if(view.id === button_multiply.id) {
            operator = "*"
        } else if (view.getId() === button_substract.id) {
            operator = "-"
        } else if (view.getId() === button_divide.id) {
            operator = "/"
        } else if (view.getId() === button_add.id) {
            operator = "+"
        }
    }

    fun equalEvent(view: View?) {
        val newNumber: String = textView.text.toString()
        var output = 0.0
        if(operator == "+") output = initialNumber.toDouble() + newNumber.toDouble()
        if(operator == "-") output = initialNumber.toDouble() - newNumber.toDouble()
        if(operator == "*") output = initialNumber.toDouble() * newNumber.toDouble()
        if(operator == "/") output = initialNumber.toDouble() / newNumber.toDouble()
        textView.setText(output.toString() + "")
    }

    fun clearEvent(view: View?) {
        textView.setText("0")
        isNewOperator = true
    }

    fun percentEvent(view: View) {
        val number: String = textView.text.toString()
        var output = 0.00
        if(isNewOperator) output = number.toDouble()
        textView.setText(output.toString() + "")
    }

}