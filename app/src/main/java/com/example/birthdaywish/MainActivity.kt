package com.example.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var displayMessage1= ""     //This is a string
    private var displayMessage2 : String? = null  // This is nullable
    private lateinit var displayMessage3 : String



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myGreeting = findViewById<TextView>(R.id.myGreeting)
        val humanData = HumanData()

        Log.i("InfoTag", "Starting" )
        displayMessage3 ="Good bye!"

        Handler().postDelayed({
            myGreeting.text = displayMessage1

        },2000)

        Handler().postDelayed({
            myGreeting.text = displayMessage2

        },2000)
        Handler().postDelayed({
            myGreeting.text = displayMessage3

        },2000)
        Handler().postDelayed({
            var displays : String? = null

            if(myGreeting.text == null)
            {
                displays=""
            }

            myGreeting.text = displays?.let{
                it
            }?: kotlin.run {
                "HelloWorld"
            }

        },2000)
        Handler().postDelayed({

            // in apply only take input  (best practice)
            humanData.apply{
                name = "hiba"
                age = 23
            }

            myGreeting.text = "Greetings "+ humanData.name;

            humanData.also{
                it.isMale= false
            }
        },2000)
        Handler().postDelayed({
            // when we have to make changes and to also read it
            with(humanData) {
                name =  "Hiba Rana"
                myGreeting.text= name
            }
        }, 2000)


    }
}