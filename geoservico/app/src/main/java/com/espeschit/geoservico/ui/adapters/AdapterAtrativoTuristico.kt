package com.espeschit.geoservico.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.Features
import com.espeschit.geoservico.ui.fragments.AtrativoFragment



class AdapterAtrativoTuristico(var context: Context,
                               var features: List<Features>,
                               atrativoFragment: AtrativoFragment) :
    RecyclerView.Adapter<AdapterAtrativoTuristico.ViewAtrativoTuristico>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewAtrativoTuristico {
        val view = LayoutInflater.from(context).inflate(R.layout.item_atrativoturistico, parent, false)

       var descricao = view.findViewById<RecyclerView>(R.id.descricao)
      descricao.adapter = AdapterAtrativoTuristico(context, features, AtrativoFragment())
       descricao.layoutManager = LinearLayoutManager(context,
          LinearLayoutManager.HORIZONTAL, false)

        return ViewAtrativoTuristico(view)
    }

    override fun getItemCount(): Int {
        return features.size
    }

    override fun onBindViewHolder(holder: ViewAtrativoTuristico, position: Int) {
        holder.bind(context, features[position])
    }

    class ViewAtrativoTuristico(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(context: Context, feat: Features){

            var descricao = itemView.findViewById<TextView>(R.id.descricao)
            descricao.text = feat.properties.DESCRICAO

            var link_site_rede_social = itemView.findViewById<TextView>(R.id.link_site_rede_social)
            link_site_rede_social.text = feat.properties.LINK_SITE_REDE_SOCIAL

            var ref_localizacao = itemView.findViewById<TextView>(R.id.ref_localizacao)
            ref_localizacao.text = feat.properties.REF_LOCALIZACAO

            //var id_atrativo_turistico = itemView.findViewById<TextView>(R.id.id_atrativo_turistico)
           //id_atrativo_turistico.text = feat.properties.ID_ATRATIVO_TURISTICO

            var endereco = itemView.findViewById<TextView>(R.id.endereco)
            endereco.text = feat.properties.ENDERECO

            var categoria = itemView.findViewById<TextView>(R.id.categoria)
            categoria.text = feat.properties.CATEGORIA

        }
    }

 }