package com.example.lib

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mylibrary.library

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        library.s(this,"hehe")
    }
}