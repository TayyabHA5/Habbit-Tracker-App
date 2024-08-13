package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habbittrackerapp.adapters.AllHabitsAdapter
import com.example.habbittrackerapp.databinding.FragmentAllHabittsBinding
import com.example.habbittrackerapp.models.ModelRvAllHabits


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
        // Inflate the layout for this fragment
        inItRecyclerView()
        return binding.root
    }

    private fun inItRecyclerView() {
        binding.rvAllHabits.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        val allHabitLists = listOf(
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelRvAllHabits("Happy Morning Challenge", "7 Day challenge","join now")
        )
        adapter = AllHabitsAdapter(allHabitLists)
        binding.rvAllHabits.adapter = adapter
    }

}