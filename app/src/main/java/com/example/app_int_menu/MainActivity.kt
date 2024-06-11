package com.example.app_int_menu

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.app_int_menu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imagenbutton1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        binding.imagenbutton2.setOnClickListener{
            val intent = Intent(this,hamburguesa::class.java)
            startActivity(intent)
        }

        binding.imagenbutton6.setOnClickListener{
            val intent = Intent(this,cafe::class.java)
            startActivity(intent)
        }

        binding.imagenbutton11.setOnClickListener{
            val intent = Intent(this,helado::class.java)
            startActivity(intent)
        }

        }
    }
