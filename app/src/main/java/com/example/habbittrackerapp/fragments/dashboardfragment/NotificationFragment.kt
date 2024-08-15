package com.example.habbittrackerapp.fragments.dashboardfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.adapters.AdapterNotifications
import com.example.habbittrackerapp.databinding.FragmentNotificationBinding
import com.example.habbittrackerapp.models.ModelNotification


class NotificationFragment : Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    private lateinit var adapterNotifications: AdapterNotifications

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNotificationBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        binding.rvNotifications.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        val notificationList = listOf(
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
            ModelNotification(R.drawable.calender__2_,"Take time for a lunch","about 5 minutes ago"),
        )
        adapterNotifications = AdapterNotifications(notificationList)
        binding.rvNotifications.adapter = adapterNotifications
    }


}