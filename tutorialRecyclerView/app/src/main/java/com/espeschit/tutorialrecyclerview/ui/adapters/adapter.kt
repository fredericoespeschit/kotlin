package com.espeschit.tutorialrecyclerview.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.espeschit.tutorialrecyclerview.R
import com.espeschit.tutorialrecyclerview.model.tutorial
import java.util.ArrayList

class adapter(var context: Context, var list: ArrayList<tutorial>) :
    RecyclerView.Adapter<adapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_tutorial, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(context, list[position])
    }

    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(context: Context, tutorial: tutorial) {

            var image = itemView.findViewById<ImageView>(R.id.imagem)
            image.setImageDrawable(context.resources.getDrawable(tutorial.imagem, null))
            var title = itemView.findViewById<TextView>(R.id.titulo)
            title.text = tutorial.titulo
            var subtitle = itemView.findViewById<TextView>(R.id.subtitulo)
            subtitle.text = tutorial.subtitulo

        }
    }
}