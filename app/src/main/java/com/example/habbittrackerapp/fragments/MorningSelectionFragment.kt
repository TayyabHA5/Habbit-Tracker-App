package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentMorningSelectionBinding

class MorningSelectionFragment : Fragment() {

    private lateinit var binding: FragmentMorningSelectionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMorningSelectionBinding.inflate(inflater, container, false)

        // Set the click listener for the button after the view is created
        binding.btnGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_morningSelectionFragment_to_nightSelectionFragment)
        }

        return binding.root
    }
}
