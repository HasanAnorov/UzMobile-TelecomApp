package com.example.ussd.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ussd.R
import com.example.ussd.model.Ad
import kotlinx.android.synthetic.main.view_page_item_view.view.*

class ViewPageAdapter( val ads:List<Ad>) : RecyclerView.Adapter<ViewPageAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun onBind(ad:Ad){
            itemView.tarif_header.setImageResource(ad.tarif)
            itemView.tarif_summa.setImageResource(ad.tarifSumma)
            itemView.min_iv.setImageResource(ad.min)
            itemView.sms_iv.setImageResource(ad.sms)
            itemView.mb_iv.setImageResource(ad.mb)
            itemView.min_tv.setImageResource(ad.minTv)
            itemView.mb_tv.setImageResource(ad.mbTv)
            itemView.sms_tv.setImageResource(ad.smsTv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_page_item_view,parent,false)
    return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.onBind(ads[position])
    }

    override fun getItemCount(): Int  = ads.size
}