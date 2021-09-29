package com.example.tasktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var edName : EditText
    lateinit var names : ArrayList<String>
    lateinit var rv: RecyclerView
    lateinit var bt : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rv = findViewById(R.id.textView1)
        edName = findViewById(R.id.ed)
        bt = findViewById(R.id.button)
           names = ArrayList()
        names.add("ameera")
        names.add("abduallah")
        names.add("here")
        names.add("task 3")

        rv.adapter = adapterMessage(names)
        rv.layoutManager=LinearLayoutManager(this)

        bt.setOnClickListener {
            val name = edName.text.toString()
            names.add(name)
            edName.text.clear()
            edName.clearFocus()
            rv.adapter?.notifyDataSetChanged()
        }
    }
}