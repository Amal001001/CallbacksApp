package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var mainlayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainlayout = findViewById(R.id.mainlayout)
        val bactivity2 = findViewById<Button>(R.id.bactivity2)

        Toast.makeText(this,"Activity1",Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onCreate:")

        bactivity2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Activity 1", Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 1",Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 1",Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onResume Activity 1",Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity 1",Toast.LENGTH_LONG).show()
        Log.d("Activity1", "onDestroy: ")
    }

}