package com.example.listadinamicakotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listadinamicakotlin.R
import com.example.listadinamicakotlin.model.Aplicativo

class AdapterAplicativo(
        private val context: Context,
        private val aplicativos: MutableList<Aplicativo>
    ): RecyclerView.Adapter<AdapterAplicativo.AplicativoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AplicativoViewHolder {
        val itensLista = LayoutInflater.from(context).inflate(R.layout.item_lista, parent, false)
        val holder = AplicativoViewHolder(itensLista)
        return holder
    }

    override fun onBindViewHolder(holder: AplicativoViewHolder, position: Int) {
        holder.logo.setImageResource(aplicativos[position].logo)
        holder.nome.text = aplicativos[position].nome
        holder.descricao.text = aplicativos[position].descricao
    }

    override fun getItemCount(): Int = aplicativos.size

    inner class AplicativoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val logo = itemView.findViewById<ImageView>(R.id.img_app)
        val nome = itemView.findViewById<TextView>(R.id.txt_nome)
        val descricao = itemView.findViewById<TextView>(R.id.txt_descricao)

    }
}