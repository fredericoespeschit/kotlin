package com.espeschit.geoservico.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.EscolasMunicipaisEI
import com.espeschit.geoservico.services.RetrofitInitializer
import com.espeschit.geoservico.ui.activities.MainActivity
import com.espeschit.geoservico.ui.adapters.AdapterEscolasMunicipaisEI
import kotlinx.android.synthetic.main.fragment_main.*
import retrofit2.Call
import retrofit2.Response

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    var value: Int = 0
    var name: String = ""

    companion object {
        fun newInstance(value: Int, name: String): MainFragment {
            var f = MainFragment()
            f.value = value
            f.name = name
            return f
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        getEscolasMunicipaisEI()
        return view
    }

    fun getEscolasMunicipaisEI() {

        var activity = context as MainActivity

        var s = RetrofitInitializer().serviceEscolasMunicipaisEI()

        var call = s.getEscolasMunicipaisEI()

        call.enqueue(object : retrofit2.Callback<EscolasMunicipaisEI> {

            override fun onResponse(
                call: Call<EscolasMunicipaisEI>?,
                response: Response<EscolasMunicipaisEI>?
            ) {
                response?.let {

                    if (it.code() == 200) {

                        // listFragment.adapter = AdapterEscolasMunicipaisEI(activity, it.body().features, this@MainActitivies)
                        listFragment.adapter = AdapterEscolasMunicipaisEI(
                            activity,
                            it.body().features,
                            this@MainFragment
                        )
                    }
                }
            }

            override fun onFailure(call: Call<EscolasMunicipaisEI>?, t: Throwable?) {
                Toast.makeText(activity, "Ops", Toast.LENGTH_LONG).show()
            }
        })
    }

}
