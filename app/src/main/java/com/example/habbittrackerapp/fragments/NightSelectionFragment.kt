package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentNightSelectionBinding


class NightSelectionFragment : Fragment() {
    private lateinit var binding: FragmentNightSelectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNightSelectionBinding.inflate(inflater,container,false)
       binding.btnGetStarted.setOnClickListener(){
           findNavController().navigate(R.id.action_nightSelectionFragment_to_procrastinateFragment)
       }
        return binding.root
    }

}