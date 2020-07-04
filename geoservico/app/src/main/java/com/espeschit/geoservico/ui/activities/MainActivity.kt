package com.espeschit.geoservico.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.EscolasMunicipaisEI
import com.espeschit.geoservico.services.RetrofitInitializer
import com.espeschit.geoservico.ui.adapters.AdapterAtrativoTuristico
import com.espeschit.geoservico.ui.adapters.AdapterEscolasMunicipaisEI
import com.espeschit.geoservico.ui.fragments.AtrativoFragment
import com.espeschit.geoservico.ui.fragments.MainFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setFragment(MainFragment.newInstance(0, "Main Fragment"), "Main Frangment")
        //setFragment(AtrativoFragment.newInstance(0, "Atrativo Fragment"), "Atrativo Frangment")

        escolas.setOnClickListener {
            setFragment(MainFragment(), "Main Frangment")
        }

        atrativo.setOnClickListener {
            //setFragment(AtrativoFragment(), "Atrativo Frangment")
            setFragment(AtrativoFragment.newInstance(0, "Atrativo Fragment"), "Atrativo Frangment")
        }
    }


    fun setFragment(f: Fragment, name: String) {
        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.fragment, f, name)
        ft.commit()
    }
}
