package com.example.practice

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class subscribe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_subscribe)
        var b=findViewById<Button>(R.id.sub)
        b.setOnClickListener {
            var d=LayoutInflater.from(this).inflate(R.layout.customdialog,null)
            var g=AlertDialog.Builder(this).setView(d)
            g.setPositiveButton("Subscribe"){dialog, _ ->
                val e = d.findViewById<EditText>(R.id.et)
                val email = e.text.toString()
                if (email.isNotBlank()) {
                    Toast.makeText(this, "subscribed with $email", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "enter valid email", Toast.LENGTH_LONG).show()
                }
                dialog.dismiss()
            }
            g.setNegativeButton("cancel") { dialog, _ -> dialog.dismiss() }
            g.create().show()
        }
    }
}