package br.com.espeschit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnC.setOnClickListener(this)
        btnMaisMenos.setOnClickListener(this)
        btnPercent.setOnClickListener(this)
        btnDiv.setOnClickListener(this)

        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnMult.setOnClickListener(this)

        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btnAdd.setOnClickListener(this)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btnSub.setOnClickListener(this)

        btn0.setOnClickListener(this)
        btnPonto.setOnClickListener(this)
        btnIgual.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var b = v as Button

        result.text = b.text.toString()

    }
}


