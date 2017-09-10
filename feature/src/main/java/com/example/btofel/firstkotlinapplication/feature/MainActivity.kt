package com.example.btofel.firstkotlinapplication.feature

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val a: String = "init value"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
