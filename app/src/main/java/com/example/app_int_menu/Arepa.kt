package com.example.app_int_menu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_int_menu.adapter.Listaradapter

class Arepa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.arepa)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        initRecyclerView()
    }
    fun initRecyclerView(){

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_arepa)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=Listaradapter(ListarecyclerviewProvider.lista)


    }
}