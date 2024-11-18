package com.example.practice

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)

        val buttonSnackbar: Button = findViewById(R.id.buttonSnackbar)
        buttonSnackbar.setOnClickListener { showSnackbar(it, "Snackbar was clicked") }
    }

    private fun showSnackbar(view: View, message: String) {
        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
            .setAction("Ok") {
                Toast.makeText(this, "Ok was clicked", Toast.LENGTH_SHORT).show()
            }.show()


    }

}
