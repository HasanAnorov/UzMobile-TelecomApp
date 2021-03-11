package com.example.ussd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussd.R
import com.example.ussd.model.Tarif
import kotlinx.android.synthetic.main.item_view.view.*

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    var list :List<Tarif> = listOf()
        set(value){
            field=value
            notifyDataSetChanged()
        }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun onBind(tarif:Tarif){
            itemView.tarif_header.text = tarif.tarifHeader
            itemView.tarif_icon.setImageResource(tarif.tarifIcon)
            itemView.tarif_description.text = tarif.tarif_description
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size



}
