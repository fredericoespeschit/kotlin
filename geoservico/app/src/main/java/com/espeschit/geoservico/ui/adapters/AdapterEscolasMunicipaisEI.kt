package com.espeschit.geoservico.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.Features
import com.espeschit.geoservico.ui.fragments.MainFragment

class AdapterEscolasMunicipaisEI(
    var context: Context,
    var list: List<Features>,
    mainFragment: MainFragment
) :
    BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_escolasmunicipaisei, null)

        var name = view.findViewById<TextView>(R.id.nome)
        name.text = list[position].properties.NOME

        var regional = view.findViewById<TextView>(R.id.regional)
        name.text = list[position].properties.REGIONAL

        var instancia = view.findViewById<TextView>(R.id.instancia)
        instancia.text = list[position].properties.INSTANCIA

        var logradouro = view.findViewById<TextView>(R.id.logradouro)
        logradouro.text = list[position].properties.LOGRADOURO

        // var numero = view.findViewById<TextView>(R.id.numero)
        // numero.text = list[position].properties.NUMERO

        var complemento = view.findViewById<TextView>(R.id.complemento)
        complemento.text = list[position].properties.COMPLEMENTO

        var bairro = view.findViewById<TextView>(R.id.bairro)
        bairro.text = list[position].properties.BAIRRO

        var tipoLogradouro = view.findViewById<TextView>(R.id.tipoLogradouro)
        tipoLogradouro.text = list[position].properties.TIPO_LOGRADOURO

       // var id_eq_ed = view.findViewById<TextView>(R.id.id_eq_ed)
       // id_eq_ed.text = list[position].properties.ID_EQ_ED

        //descricao.adapter = AdapterAtrativoTuristico(context, list[position].properties)

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