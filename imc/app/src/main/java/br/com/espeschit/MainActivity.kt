package br.com.espeschit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalcular.setOnClickListener {
            val p: Double = editTextPeso.getText().toString().toDouble()
            val a: Double = editTextAltura.getText().toString().toDouble()

            val result = p / (a * a)

            textViewImc.text = String.format("%.2f", result);

            if (result < 16) {
                textViewMensagem.text = resources.getText(R.string.menor16);
            } else if (result < 17) {
                textViewMensagem.text = resources.getText(R.string.menor17);
            }
            else if (result < 18.5) {
                textViewMensagem.text = resources.getText(R.string.menor185);
            } else if (result < 25) {
                textViewMensagem.text = resources.getText(R.string.menor25);
            } else if (result < 30) {
                textViewMensagem.text = resources.getText(R.string.menor30);
            } else if (result < 35) {
                textViewMensagem.text = resources.getText(R.string.menor35);
            } else if (result < 40) {
                textViewMensagem.text = resources.getText(R.string.menor40);
            } else {
                textViewMensagem.text = resources.getText(R.string.maiorigual40);
            }
        }
    }
}

