package com.example.application


import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.make


class snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        val sid = findViewById<Button>(R.id.button)

        sid.setOnClickListener { view ->
            Snackbar.make(view, "this is a snackbar", Snackbar.LENGTH_LONG).setAction("delete") {

                Toast.makeText(this, "delete was clicked", Toast.LENGTH_LONG).show()

            }.show()
        }
    }
}


