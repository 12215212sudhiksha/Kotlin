package com.example.portfolio

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class languages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_languages)
        val languagesButton = findViewById<Button>(R.id.button6)

        languagesButton.setOnClickListener {
            val languages = arrayOf("English", "Spanish", "French", "German", "Chinese")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Select Language")
            builder.setItems(languages) { _, which ->
                val selectedLanguage = languages[which]

                Toast.makeText(this, "$selectedLanguage selected", Toast.LENGTH_SHORT).show()
            }
            builder.create().show()
        }
    }
}


