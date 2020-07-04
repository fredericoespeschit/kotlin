package com.espeschit.geoservico.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import retrofit2.Call
import retrofit2.Response
import com.espeschit.geoservico.R
import com.espeschit.geoservico.models.AtrativoTuristico
import com.espeschit.geoservico.services.RetrofitInitializer
import com.espeschit.geoservico.ui.activities.MainActivity
import com.espeschit.geoservico.ui.adapters.AdapterAtrativoTuristico
import kotlinx.android.synthetic.main.fragment_atrativo.*

/**
 * A simple [Fragment] subclass.
 */
class AtrativoFragment : Fragment() {

    var value: Int = 0
    var name: String = ""

    companion object {
        fun newInstance(value: Int, name: String): AtrativoFragment {
            var f = AtrativoFragment()
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
        val view = inflater.inflate(R.layout.fragment_atrativo, container, false)
        getAtrativoFragment()
        return view
    }

    fun getAtrativoFragment() {

        var activity = context as MainActivity

        var s = RetrofitInitializer().serviceAtrativoTuristico()

        var call = s.getAtrativoTuristico()

        call.enqueue(object : retrofit2.Callback<AtrativoTuristico> {

            override fun onResponse(
                call: Call<AtrativoTuristico>?,
                response: Response<AtrativoTuristico>?
            ) {
                response?.let {

                    if (it.code() == 200) {

                        //Toast.makeText(activity, "Recycle View tirou a minha noite de sono", Toast.LENGTH_LONG).show()
                           //recyclerView.adapter = AdapterAtrativoTuristico(
                            //activity, it.body().features, this@AtrativoFragment
                       // )

                        recyclerView.adapter = AdapterAtrativoTuristico(activity, it.body().features,
                            this@AtrativoFragment)

                        //recyclerView.layoutManager = LinearLayoutManager(
                        //    this@AtrativoFragment,
                        //    LinearLayoutManager.HORIZONTAL, false

                        //)
                    }
                }
            }

            override fun onFailure(call: Call<AtrativoTuristico>?, t: Throwable?) {
                Toast.makeText(activity, "Ops", Toast.LENGTH_LONG).show()
            }
        })
    }

}
