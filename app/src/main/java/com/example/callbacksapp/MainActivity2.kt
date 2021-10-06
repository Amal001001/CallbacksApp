package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    lateinit var mainlayout2: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Toast.makeText(this,"Activity2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onCreate:")

        val bactivity3 = findViewById<Button>(R.id.bactivity3)
        mainlayout2 = findViewById(R.id.mainlayout2)

        bactivity3.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Activity 2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onResume Activity 2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity 2", Toast.LENGTH_LONG).show()
        Log.d("Activity2", "onDestroy: ")
    }

}