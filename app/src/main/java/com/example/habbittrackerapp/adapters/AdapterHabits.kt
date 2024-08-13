package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelHabits
import com.google.android.material.card.MaterialCardView

class AdapterHabits(private var arrHabit : List<ModelHabits>) : RecyclerView.Adapter<AdapterHabits.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var habitImg = itemView.findViewById<ImageView>(R.id.ivHabitRv)
        val habitName = itemView.findViewById<TextView>(R.id.tvHabitNameRv)
        val habitProgress = itemView.findViewById<TextView>(R.id.tvHabitProgressRv)
        val rvLayout = itemView.findViewById<MaterialCardView>(R.id.rvItemLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterHabits.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_home_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterHabits.ViewHolder, position: Int) {
        val currentPosition = arrHabit[position]
        holder.habitImg.setImageResource(currentPosition.img)
        holder.habitName.text = currentPosition.habbitName
        holder.habitProgress.text = currentPosition.habbitProgress

        holder.rvLayout.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment2_to_habitsDetailsFragment)
        }
    }

    override fun getItemCount(): Int {
        return arrHabit.size
    }
}