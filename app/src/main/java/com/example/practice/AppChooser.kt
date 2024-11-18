package com.example.practice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppChooser : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_chooser)
        val sharebtn=findViewById<Button>(R.id.sb)
        sharebtn.setOnClickListener {
            sharetxt("hello,share this message")
        }
    }
    fun sharetxt(message:String){
        val send: Intent =Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,message)
            type="text/plain"
        }
        val chooser1:Intent=Intent.createChooser(send,"Share via")
        startActivity(chooser1)
    }
}