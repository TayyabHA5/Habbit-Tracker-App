package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelNotification

class AdapterNotifications(private var arrNotificationList : List<ModelNotification>) : RecyclerView.Adapter<AdapterNotifications.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val notificationImg = itemView.findViewById<ImageView>(R.id.ivNotification)
        val notificationTitle = itemView.findViewById<TextView>(R.id.tvNotificationTitle)
        val notificationTime = itemView.findViewById<TextView>(R.id.tvNotificationTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNotifications.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_notification_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterNotifications.ViewHolder, position: Int) {
        val currentPostion = arrNotificationList[position]
        holder.notificationImg.setImageResource(currentPostion.img)
        holder.notificationTitle.text = currentPostion.title
        holder.notificationTime.text = currentPostion.time
    }

    override fun getItemCount(): Int {
        return arrNotificationList.size
    }
}