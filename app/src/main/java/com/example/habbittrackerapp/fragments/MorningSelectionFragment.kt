package com.example.habbittrackerapp.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.activities.MainActivity
import com.example.habbittrackerapp.databinding.FragmentMorningSelectionBinding
import com.example.habbittrackerapp.models.ModelTime
import com.example.habbittrackerapp.viewmodels.TimeViewModel

class MorningSelectionFragment : Fragment() {

    private lateinit var binding: FragmentMorningSelectionBinding
    private lateinit var timeViewModel: TimeViewModel
    private var selectedTime :String = ""

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMorningSelectionBinding.inflate(inflater, container, false)
        // Hide toolbar
        (activity as MainActivity).getToolbar().visibility = View.GONE
        timeViewModel = ViewModelProvider(this).get(TimeViewModel::class.java)

        binding.timePicker.setOnTimeChangedListener { _, hourOfDay, minutes ->
            selectedTime = "$hourOfDay : $minutes"

            binding.btnGetStarted.setOnClickListener {
              val time = timeViewModel.insertTime(ModelTime(morningTime = selectedTime, eveningTime = null.toString()))
                findNavController().navigate(R.id.action_morningSelectionFragment_to_nightSelectionFragment)
                Toast.makeText(requireContext(), "Morning Time saved $selectedTime", Toast.LENGTH_SHORT).show()
            }
        }



        return binding.root
    }
}
