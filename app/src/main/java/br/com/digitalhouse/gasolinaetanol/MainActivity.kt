package br.com.digitalhouse.gasolinaetanol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnComparar.setOnClickListener  {
            if (edtGasolina.text.isEmpty() ){
                Toast.makeText(this, "Informe o valor da gasolina", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (edtEtanol.text.isEmpty()){
                Toast.makeText(this, "Informe o valor do etanol", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val valorGasolina = edtGasolina.text.toString().toDouble()
            val valorEtanol = edtEtanol.text.toString().toDouble()
            var resultado: Int = 0

            if (valorEtanol < valorGasolina * .7)
                resultado = R.drawable.abasteca_etanol
            else resultado = R.drawable.abasteca_gasolina

            ivResultado.setImageResource(resultado)
        }
    }
}