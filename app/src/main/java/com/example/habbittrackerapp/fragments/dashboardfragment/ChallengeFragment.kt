package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habbittrackerapp.adapters.ChallengeAdapter
import com.example.habbittrackerapp.databinding.FragmentChallengeBinding
import com.example.habbittrackerapp.models.ModelChallenge


class ChallengeFragment : Fragment() {


    private lateinit var binding: FragmentChallengeBinding
    private lateinit var adapter: ChallengeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChallengeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        inItRecyclerView()
        return binding.root
    }

    private fun inItRecyclerView() {
        binding.rvChallenge.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        val allHabitLists = listOf(
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now"),
            ModelChallenge("Happy Morning Challenge", "7 Day challenge","join now")
        )
        adapter = ChallengeAdapter(allHabitLists)
        binding.rvChallenge.adapter = adapter
    }

}