package com.example.habbittrackerapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.databinding.FragmentNightSelectionBinding
import com.example.habbittrackerapp.models.ModelTime
import com.example.habbittrackerapp.viewmodels.TimeViewModel


class NightSelectionFragment : Fragment() {
    private lateinit var binding: FragmentNightSelectionBinding
    private lateinit var timeViewModel: TimeViewModel
    private var selectedTIme : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNightSelectionBinding.inflate(inflater,container,false)
        timeViewModel = ViewModelProvider(this).get(TimeViewModel::class)
        insertTime()

        return binding.root
    }



    private fun insertTime() {
        binding.timePicker.setOnTimeChangedListener(){_,hoursOfDay,minutesOfDay->
            selectedTIme = "$hoursOfDay : $minutesOfDay"
        }
        binding.btnGetStarted.setOnClickListener(){
            timeViewModel.insertTime(ModelTime(morningTime = "", eveningTime = selectedTIme))
            Toast.makeText(requireContext(), "Evening Time saved $selectedTIme", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_nightSelectionFragment_to_procrastinateFragment)
        }
    }

}