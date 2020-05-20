package com.espeschit.standings.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.espeschit.standings.R
import com.espeschit.standings.models.table
import com.espeschit.standings.models.team

class adapter(var context: Context, var table: List<team>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.item_team, null)

        var name = view.findViewById<TextView>(R.id.time)
        name.text = table[position].name

        return view
    }

    override fun getItem(position: Int): Any {
        return ""
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return table.size
    }
}