package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.adapters.AdapterChooseHabits
import com.example.habbittrackerapp.databinding.FragmentChooseHabitBinding
import com.example.habbittrackerapp.models.ModelChooseHabit


class ChooseHabitFragment : Fragment() {
    private lateinit var binding: FragmentChooseHabitBinding
    private lateinit var adapterChooseHabits: AdapterChooseHabits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChooseHabitBinding.inflate(inflater,container,false)
        inItRecyclerView()
        binding.textView3.setOnClickListener(){

        }

        return binding.root
    }

    private fun inItRecyclerView() {
        binding.rvChooseHabits.layoutManager = GridLayoutManager(requireContext(),2)
        val chooseHabitsList = listOf(
            ModelChooseHabit(R.drawable.exercise,"Morning exercise"),
            ModelChooseHabit(R.drawable.drinkwater,"Drinking Water"),
            ModelChooseHabit(R.drawable.breakfast,"Healthy breakfast"),
            ModelChooseHabit(R.drawable.reading,"Reading"),
            ModelChooseHabit(R.drawable.idea,"Plan your productive day"),
            ModelChooseHabit(R.drawable.sleep,"Make a sleep schedule"),
        )
        adapterChooseHabits = AdapterChooseHabits(chooseHabitsList)
        binding.rvChooseHabits.adapter = adapterChooseHabits
    }

}