package com.example.viewpagertablayout

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagertablayout.databinding.FragmentThreeBinding
import com.example.viewpagertablayout.databinding.FragmentTwoBinding

class ThreeFragment : Fragment() {
    lateinit var binding: FragmentThreeBinding
    lateinit var mainActivity: MainActivity
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = context as MainActivity
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }
}