package com.espeschit.tecnico.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.espeschit.tecnico.R
import com.espeschit.tecnico.models.listaDeTecnicos
import com.espeschit.tecnico.services.RetrofitInitializer
import com.espeschit.tecnico.ui.adapters.tecnicoAdapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getTecnico()

    }

    fun getTecnico() {
        var s = RetrofitInitializer().serviceTecnico()
        var call = s.getTecnicos()

        call.enqueue(object : retrofit2.Callback<listaDeTecnicos>{
            override fun onFailure(call: Call<listaDeTecnicos>?, t: Throwable?) {
                Toast.makeText(this@MainActivity, "Ops", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<listaDeTecnicos>?,
                response: Response<listaDeTecnicos>?
            ) {
                response?.let {
                    if (it.code()==200) {
                        listTecnicos.adapter = tecnicoAdapter(this@MainActivity, it.body().lista)
                    }
                }
            }
        })

    }
}


