package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity3 : AppCompatActivity() {
    lateinit var mainlayout3: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        Toast.makeText(this,"Activity3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onCreate:")

        val bactivity1 = findViewById<Button>(R.id.bactivity1)
        mainlayout3 = findViewById(R.id.mainlayout3)

        bactivity1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Activity 3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onStart: ")

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume Activity 3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause Activity 3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onResume Activity 3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy Activity 3", Toast.LENGTH_LONG).show()
        Log.d("Activity3", "onDestroy: ")
    }
}