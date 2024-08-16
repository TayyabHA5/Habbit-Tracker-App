package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentTryFreeBinding
import com.example.habbittrackerapp.room.TimeDAO
import com.example.habbittrackerapp.viewmodels.TimeViewModel


class tryFreeFragment : Fragment() {

    private lateinit var binding: FragmentTryFreeBinding
    private lateinit var timeViewModel: TimeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTryFreeBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment

        timeViewModel = ViewModelProvider(this).get(TimeViewModel::class)

        timeViewModel.getAllTime().observe(viewLifecycleOwner, {time->
            val allTimesText = StringBuilder()
            for (time in time) {
                allTimesText.append("Morning Time: ${time.morningTime}, Evening Time: ${time.eveningTime}\n")
            }
            binding.textview.text = allTimesText.toString()
        })

        return binding.root
    }

}