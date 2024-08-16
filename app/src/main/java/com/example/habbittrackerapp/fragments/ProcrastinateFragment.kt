package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentProcrastinateBinding


class ProcrastinateFragment : Fragment() {
    private lateinit var binding: FragmentProcrastinateBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  FragmentProcrastinateBinding.inflate(inflater,container,false)
        navigateToNextFragment()
        binding.cardView1.setOnClickListener(){
            findNavController().navigate(R.id.action_procrastinateFragment_to_productiveFragment)
        }
        return binding.root
    }

    private fun navigateToNextFragment() {
        binding.cardView1.setOnClickListener(){
            findNavController().navigate(R.id.action_procrastinateFragment_to_productiveFragment)
        }
        binding.cardView2.setOnClickListener(){
            findNavController().navigate(R.id.action_procrastinateFragment_to_productiveFragment)
        }
        binding.cardView3.setOnClickListener(){
            findNavController().navigate(R.id.action_procrastinateFragment_to_productiveFragment)
        }
    }


}