package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentChooseHabitBinding


class ChooseHabitFragment : Fragment() {
    private lateinit var binding: FragmentChooseHabitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseHabitBinding.inflate(inflater,container,false)
        binding.textView3.setOnClickListener(){
            findNavController().navigate(R.id.action_chooseHabitFragment_to_drinkingWaterFragment)
        }

        return binding.root
    }

}