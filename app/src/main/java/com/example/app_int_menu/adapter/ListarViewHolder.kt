package com.example.app_int_menu.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_int_menu.Listar
import com.example.app_int_menu.R

class ListarViewHolder (view: View):RecyclerView.ViewHolder(view) {

    val text1 = view.findViewById<TextView>(R.id.textView)
    val text2 = view.findViewById<TextView>(R.id.textView2)
    val text3 = view.findViewById<TextView>(R.id.textView3)
    val foto  = view.findViewById<ImageView>(R.id.imageView3)
    fun render(listarmodel:Listar){
        text1.text = listarmodel.nombre
        text2.text = listarmodel.contenido
        text3.text = listarmodel.contenidodos


    }
}