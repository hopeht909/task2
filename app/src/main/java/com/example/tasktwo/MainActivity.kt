package com.example.tasktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edName : EditText
    lateinit var edNum : EditText
    lateinit var bt : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName = findViewById(R.id.editTextTextPersonName2)
        edNum = findViewById(R.id.editTextTextPersonName)
        bt = findViewById(R.id.button)

        bt.setOnClickListener {
            Toast.makeText(this, "${edName.text} ${edNum.text}", Toast.LENGTH_LONG).show()
        }
    }
}