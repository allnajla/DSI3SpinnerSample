package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.core.view.size

class MainActivity : AppCompatActivity() ,AdapterView.OnItemSelectedListener{
    lateinit var txtselected :TextView
    lateinit var spinner:Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtselected= findViewById(R.id.textview)
        spinner = findViewById(R.id.sp)

       var arrayAdapter=ArrayAdapter.createFromResource(
            this,
            R.array.governorates,
            android.R.layout.simple_spinner_dropdown_item) //use R.layout.customspinner for customising
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener=this
    }


    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

        txtselected.text = parent?.getItemAtPosition(position).toString() + " is selected"
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }
}