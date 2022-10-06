package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var list=arrayListOf<String>("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("DinnerDecider");
    }

    fun decideFunction(view: View) {
        val rand= Random.nextInt(0 , list.size)
        var textview = findViewById<TextView>(R.id.selectedFood)
        textview.text=list.get(rand)
    }

    fun addNewFood(view: View) {
        val newFood = findViewById<EditText>(R.id.enterFood).text
        if(!newFood.trim().equals("")){
            list.add(newFood.toString())
            findViewById<EditText>(R.id.enterFood).setText("")
        }

    }
}