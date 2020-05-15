package com.espeschit.tecnico.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.espeschit.tecnico.R
import com.espeschit.tecnico.models.tecnico


class tecnicoAdapter (var context: Context, var list: List<tecnico>) : BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_tecnico, null)

        var namao = view.findViewById<TextView>(R.id.nome)
        namao.text = list[position].nome

        var timao = view.findViewById<TextView>(R.id.time)
        timao.text = list[position].time

        var image = view.findViewById<ImageView>(R.id.foto)

        Glide
            .with(context)
            .load(list[position].foto)
            .into(image)

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