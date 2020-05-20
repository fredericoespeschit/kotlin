package com.espeschit.standings.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.espeschit.standings.R
import com.espeschit.standings.models.standings
import com.espeschit.standings.models.table
import com.espeschit.standings.services.RetrofitInitializer
import com.espeschit.standings.ui.adapters.adapter
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStandings()
    }

    fun getStandings() {
        var r = RetrofitInitializer().serviceRetrofit()
        var call = r.getStandings()

        call.enqueue(object : retrofit2.Callback<table> {

            override fun onFailure(call: Call<table>?, t: Throwable?) {
                Toast.makeText(this@MainActivity, "Ops", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<table>?,
                response: Response<table>?
            ) {
                response?.let {
                    if (it.code() == 200) {
                        //team.adapter = adapter(this@MainActivity, it.body().table)
                        mteam.adapter = adapter(this@MainActivity, it.body().table)
                        Toast.makeText(this@MainActivity, "Ok", Toast.LENGTH_LONG).show()
                    }
                }
            }
        })
    }
}
