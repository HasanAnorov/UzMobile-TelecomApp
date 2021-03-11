package com.example.ussd.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ussd.R
import com.example.ussd.adapter.ExpandableListAdapter
import com.example.ussd.adapter.RecyclerAdapter
import com.example.ussd.databinding.FragmentInternetPaketBinding
import com.example.ussd.model.Tarif

class InternetPaketFragment : Fragment() {

    private lateinit var binding: FragmentInternetPaketBinding
    private lateinit var adapter: RecyclerAdapter
    val list = listOf<Tarif>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInternetPaketBinding.inflate(inflater,container,false)

//        val group = ArrayList<ArrayList<String>>()
//
//        val child1 = ArrayList<String>()
//        child1.add("Child 1")
//
//
//        val child2 = ArrayList<String>()
//        child2.add("Child 1")
//
//        group.add(child1)
//        group.add(child2)

        val list :ArrayList<Tarif> = arrayListOf()

        for (i in 0 until  12){
            var tarif = Tarif(R.drawable.ming,"Menga qo'ng'iroq qiling","Agar abonentda ADSL texnologiyasidan foydalangan holda IPTV xizmati mavjud bo\'lsa, tarif rejasida ko\'rsatilgan tezlikni ta\'minlash uchun texnik imkoniyat UZTELECOM savdo idorasiga yozma ariza bilan belgilanadi")
            list.add(tarif)
        }

        adapter = RecyclerAdapter()
        adapter.list = list
        binding.recyclerView.adapter = adapter

        return binding.root
    }

}