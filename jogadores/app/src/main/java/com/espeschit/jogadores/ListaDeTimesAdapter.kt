package com.espeschit.jogadores

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListaDeTimesAdapter (var context: Context, var list: List<String>) :BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_lista_de_times, null)
        var item_lista_de_times = view.findViewById<TextView>(R.id.item_lista_de_times)
        item_lista_de_times.text = list[position]
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