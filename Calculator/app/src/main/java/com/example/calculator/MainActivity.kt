package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

    fun plus(view : View){

        var number1 = binding.Number1.text.toString().toDouble()
        var number2 = binding.Number2.text.toString().toDouble()
        var result : Double
        if(number1!= null && number2!= null){
            result = (number1 + number2).toDouble()
            binding.textView.setText("$result")
        }
        else{
            binding.textView.setText("Check number")
        }
    }

    fun minus(view : View){
        var number1 = binding.Number1.text.toString().toDouble()
        var number2 = binding.Number2.text.toString().toDouble()
        var result : Double
        if(number1!= null && number2!= null){
            result = (number1 - number2).toDouble()
            binding.textView.setText("$result")
        }
        else{
            binding.textView.setText("Check number")
        }
    }

    fun carp(view: View){
        var number1 = binding.Number1.text.toString().toDouble()
        var number2 = binding.Number2.text.toString().toDouble()
        var result : Double
        if(number1!= null && number2!= null){
            result = (number1 * number2).toDouble()
            binding.textView.setText("$result")
        }
        else{
            binding.textView.setText("Check number")
        }
    }

    fun bol(view: View){
        var number1 = binding.Number1.text.toString().toDouble()
        var number2 = binding.Number2.text.toString().toDouble()
        var result : Double
        if(number1!= null && number2!= null && number2 !=0.0){
            result = (number1 / number2).toDouble()
            binding.textView.setText("$result")
        }
        else{
            binding.textView.setText("Check number")
        }
    }
}