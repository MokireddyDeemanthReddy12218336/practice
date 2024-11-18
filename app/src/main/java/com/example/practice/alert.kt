package com.example.practice

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class alert : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert)
        var btndialog=findViewById<Button>(R.id.abutton)
        btndialog.setOnClickListener {
            var b=AlertDialog.Builder(this)
            b.setCancelable(false)
            b.setTitle("Exit")
            b.setMessage("Do you really want to exit ?")
            b.setPositiveButton("Yes"){dialog,_ -> finish()}
            b.setNegativeButton("No"){dialog,_ -> dialog.dismiss()}
            b.setNeutralButton("May Be later"){dialog,_ -> Toast.makeText(this,"Done",Toast.LENGTH_SHORT).show()}
            b.create()
            b.show()
        }
    }
}