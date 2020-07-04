package com.espeschit.geoservico.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.AtrativoTuristico
import com.espeschit.geoservico.services.RetrofitInitializer
import com.espeschit.geoservico.ui.adapters.AdapterAtrativoTuristico
import com.espeschit.geoservico.ui.fragments.AtrativoFragment
import kotlinx.android.synthetic.main.activity_atrativo.*
import kotlinx.android.synthetic.main.fragment_atrativo.*
import retrofit2.Call
import retrofit2.Response

class AtrativoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atrativo)



    }

}