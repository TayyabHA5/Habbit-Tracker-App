package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentProductiveBinding


class ProductiveFragment : Fragment() {

    private lateinit var binding : FragmentProductiveBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductiveBinding.inflate(inflater,container,false)
        navigateToNextFragment()

        return binding.root
    }

    private fun navigateToNextFragment() {
        binding.cardView1.setOnClickListener(){
            findNavController().navigate(R.id.action_productiveFragment_to_chooseHabitFragment)
        }
        binding.cardView2.setOnClickListener(){
            findNavController().navigate(R.id.action_productiveFragment_to_chooseHabitFragment)
        }
        binding.cardView3.setOnClickListener(){
            findNavController().navigate(R.id.action_productiveFragment_to_chooseHabitFragment)
        }
    }

}