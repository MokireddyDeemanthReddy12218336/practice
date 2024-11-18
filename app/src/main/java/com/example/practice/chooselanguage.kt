package com.example.practice

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practice.R.id.btn1

class chooselanguage : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_chooselanguage)

        val button = findViewById<Button>(btn1)
        button.setOnClickListener {
            showLanguageDialog()
        }

    }
    private fun showLanguageDialog() {
        val languages = arrayOf("English", "Spanish", "French", "Telugu", "Hindi")
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Select Language")
        builder.setItems(languages) { dialog, which ->
            val selectedLanguage = languages[which]
            Toast.makeText(this, "Selected language: $selectedLanguage", Toast.LENGTH_SHORT).show()
        }
        builder.show()
    }

}