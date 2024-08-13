package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.adapters.AdapterHabits
import com.example.habbittrackerapp.databinding.FragmentHomeBinding
import com.example.habbittrackerapp.models.ModelHabits


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapterHabits: AdapterHabits

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        inItRecyclerView()
        return binding.root
    }

    private fun inItRecyclerView() {
        binding.rvHome.layoutManager = GridLayoutManager(requireContext(),2)
        val habitList = listOf(
            ModelHabits(R.drawable.glass, "Habit 1", "Progress 1"),
            ModelHabits(R.drawable.glass, "Habit 2", "Progress 2"),
            ModelHabits(R.drawable.glass, "Habit 2", "Progress 2"),
            ModelHabits(R.drawable.glass, "Habit 2", "Progress 2"),
            // Add more items as needed
        )
        adapterHabits = AdapterHabits(habitList)
        binding.rvHome.adapter = adapterHabits
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.tryfree_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}