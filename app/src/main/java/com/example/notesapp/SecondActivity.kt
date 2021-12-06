package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar

class SecondActivity : AppCompatActivity() {

    lateinit var toolbar1:androidx.appcompat.widget.Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        toolbar1 = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar1)

        supportActionBar?. apply {
            title = "back"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
    }
}