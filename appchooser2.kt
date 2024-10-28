package com.example.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class appchooser2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooser2)


                val checkBoxQuote1: CheckBox = findViewById(R.id.quote1)
                val checkBoxQuote2: CheckBox = findViewById(R.id.quote2)
                val checkBoxQuote3: CheckBox = findViewById(R.id.quote3)

                val shareButton: Button = findViewById(R.id.sharebtn)

                shareButton.setOnClickListener {
                    val selectedQuotes = mutableListOf<String>()

                    if (checkBoxQuote1.isChecked) selectedQuotes.add(checkBoxQuote1.text.toString())
                    if (checkBoxQuote2.isChecked) selectedQuotes.add(checkBoxQuote2.text.toString())
                    if (checkBoxQuote3.isChecked) selectedQuotes.add(checkBoxQuote3.text.toString())

                    if (selectedQuotes.isNotEmpty()) {
                        val quotesToShare = selectedQuotes.joinToString(separator = "\n")
                        Sharetxt(quotesToShare)
                    }
                }
            }

            private fun Sharetxt(message: String) {
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, message)
                    type = "text/plain"
                }
                val shareIntent = Intent.createChooser(sendIntent, "Share via")
                startActivity(shareIntent)
            }
        }
