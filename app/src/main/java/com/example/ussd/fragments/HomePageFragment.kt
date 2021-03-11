package com.example.ussd.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ussd.R
import com.example.ussd.adapter.ViewPageAdapter
import com.example.ussd.databinding.FragmentHomePageBinding
import com.example.ussd.model.Ad

class HomePageFragment : Fragment() {

    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentHomePageBinding.inflate(inflater,container,false)

        val list :ArrayList<Ad> = arrayListOf()

        for (i in 0 until 6){
            var ad = Ad(R.drawable.vector1
            ,R.drawable.vector2
            ,R.drawable.vector3
            ,R.drawable.prosto10
            ,R.drawable.min
            ,R.drawable.mb
            ,R.drawable.sms
            ,R.drawable.mln10)

            list.add(ad)
        }

        binding.viewPager.adapter = ViewPageAdapter(list)

        binding.indicator.setViewPager(binding.viewPager)

        //binding.indicator.setViewPager(binding.viewPager)

        binding.internet.setOnClickListener {
            findNavController().navigate(R.id.internetPaketFragment)
        }

        return binding.root
    }



}

