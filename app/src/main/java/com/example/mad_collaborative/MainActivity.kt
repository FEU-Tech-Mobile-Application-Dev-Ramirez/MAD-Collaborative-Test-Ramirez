package com.example.mad_collaborative

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main)

        val nameBtn = findViewById<Button>(R.id.nameBtn)
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val output = findViewById<TextView>(R.id.output)

        nameBtn.setOnClickListener {
            output.text = "Hello, ${nameInput.text}!"
        }



    }
}