package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.adapters.AllHabitsAdapter
import com.example.habbittrackerapp.adapters.ChallengeAdapter
import com.example.habbittrackerapp.databinding.FragmentAllHabittsBinding
import com.example.habbittrackerapp.models.ModelAllhabits
import com.example.habbittrackerapp.models.ModelChallenge


class AllHabittsFragment : Fragment() {

    private lateinit var binding: FragmentAllHabittsBinding
    private lateinit var adapter: AllHabitsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAllHabittsBinding.inflate(inflater,container,false)

        inItRecyclerView()
        return binding.root
    }

    private fun inItRecyclerView() {
        binding.rvAllHabits.layoutManager = GridLayoutManager(requireContext(),2)
        val allHabitLists = listOf(
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),
            ModelAllhabits(R.drawable.glass,"water drinking","75%"),

        )
        adapter = AllHabitsAdapter(allHabitLists)
        binding.rvAllHabits.adapter = adapter
    }

}