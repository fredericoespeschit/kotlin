package com.espeschit.jogadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class ListaDeJogadoresAdapter (var context: Context, var list: List<String>) : BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_lista_de_jogadores, null)
        var item_lista_de_jogadores = view.findViewById<TextView>(R.id.item_lista_de_jogadores)
        item_lista_de_jogadores.text = list[position]
        return view
    }

    override fun getItem(position: Int): Any {
        return ""
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return list.size
    }
}