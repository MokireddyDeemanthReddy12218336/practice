package com.example.practice

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class quote : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        val sendButton = findViewById<Button>(R.id.q1)

        sendButton.setOnClickListener {
            // Get the selected RadioButton text and send the message
            val selectedMessage = getSelectedRadioButtonText()
            if (selectedMessage != null) {
                shareText(selectedMessage)
            }
        }
    }

    // This method retrieves the text of the selected RadioButton
    private fun getSelectedRadioButtonText(): String? {
        val radioButtons = listOf(
            findViewById<RadioButton>(R.id.radioButton),
            findViewById<RadioButton>(R.id.radioButton2),
            findViewById<RadioButton>(R.id.radioButton5),
            findViewById<RadioButton>(R.id.radioButton6),
            findViewById<RadioButton>(R.id.radioButton7),
            findViewById<RadioButton>(R.id.radioButton8)
        )

        for (radioButton in radioButtons) {
            if (radioButton.isChecked) {
                return radioButton.text.toString()  // Return the text of the selected RadioButton
            }
        }
        return null // No radio button is selected
    }

    // Method to share the text via an external app
    private fun shareText(message: String) {
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, message)
            type = "text/plain"
        }
        val chooserIntent: Intent = Intent.createChooser(sendIntent, "Share via")
        startActivity(chooserIntent)
    }
}
