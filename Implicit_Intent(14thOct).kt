package com.example.application

import android.content.Intent
import android.graphics.Camera
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent)

        val url = findViewById<Button>(R.id.url)
        val dial = findViewById<Button>(R.id.dial)
        val call = findViewById<Button>(R.id.call)
        val camera = findViewById<Button>(R.id.camera)
        val contacts = findViewById<Button>(R.id.contacts)
        val gallery = findViewById<Button>(R.id.gallery)

        url.setOnClickListener {
            val int = Intent(Intent.ACTION_VIEW)
            int.data = Uri.parse("https://www.google.com/")
            startActivity(int)

        }
        dial.setOnClickListener {
            val int = Intent(Intent.ACTION_DIAL)
            int.data = Uri.parse("tel:123456789")
            startActivity(int)
        }
        call.setOnClickListener {
            val int = Intent(Intent.ACTION_CALL)
            int.data = Uri.parse("tel:123456789")
            startActivity(int)
        }
        camera.setOnClickListener {
            val i1 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i1)
        }

        contacts.setOnClickListener {
            val int = Intent(Intent.ACTION_PICK)
            int.data = Uri.parse("content://contacts/people/")
            startActivity(int)
        }
        gallery.setOnClickListener {
            val int = Intent()
            int.action = Intent.ACTION_VIEW
            int.type = "image/*"
            startActivity(int)

            }


        }
}

