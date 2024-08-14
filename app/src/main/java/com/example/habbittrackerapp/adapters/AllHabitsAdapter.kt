package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelAllhabits
import com.example.habbittrackerapp.models.ModelChallenge
import com.google.android.material.card.MaterialCardView

class AllHabitsAdapter(private var arrAllHabits: List<ModelAllhabits>) : RecyclerView.Adapter<AllHabitsAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var habitImg = itemView.findViewById<ImageView>(R.id.ivAllHabitsRv)
        val habitName = itemView.findViewById<TextView>(R.id.tvallHabitNameRv)
        val habitProgress = itemView.findViewById<TextView>(R.id.tvallHabitProgressRv)
        val rvLayout = itemView.findViewById<RelativeLayout>(R.id.allHabitsrelativeLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllHabitsAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_allhabits_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AllHabitsAdapter.ViewHolder, position: Int) {
        val currentPosition = arrAllHabits[position]
        holder.habitImg.setImageResource(currentPosition.img)
        holder.habitName.text = currentPosition.habbitName
        holder.habitProgress.text = currentPosition.habbitProgress
    }

    override fun getItemCount(): Int {
      return arrAllHabits.size
    }
}