package com.example.listadinamicakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listadinamicakotlin.adapter.AdapterAplicativo
import com.example.listadinamicakotlin.model.Aplicativo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Configuração do Recycler View
        val recyclerView = findViewById<RecyclerView>(R.id.rv_lista_dinamica)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        //Configuração do Adapter
        val listaAplicativos: MutableList<Aplicativo> = mutableListOf()
        val adapterAplicativo = AdapterAplicativo(this, listaAplicativos)
        recyclerView.adapter = adapterAplicativo

        //Configuração dos Itens
        val app1 = Aplicativo(
            R.drawable.adaway_logo,
            "AdAway",
            "org.adaway"
        )
        listaAplicativos.add(app1)

        val app2 = Aplicativo(
            R.drawable.dois_zero_quatro_oito,
            "2048",
            "com.gabrielecirulli.app2048"
        )
        listaAplicativos.add(app2)

        val app3 = Aplicativo(
            R.drawable.instagram_logo,
            "Instagram",
            "com.instagram"
        )
        listaAplicativos.add(app3)

        val app4 = Aplicativo(
            R.drawable.weather,
            "1Weather",
            "com.handmark.expressweather"
        )
        listaAplicativos.add(app4)
    }
}