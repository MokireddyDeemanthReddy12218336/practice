package com.example.practice

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class toast : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast)

        val buttonToast =findViewById<Button>(R.id.buttonToast)
        buttonToast.setOnClickListener {
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_LONG).show()
        }
    }
}
