package com.example.gdscmmcoe_communityapp.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gdscmmcoe_communityapp.data.Team
import com.example.gdscmmcoe_communityapp.databinding.ItemTeampageBinding

class TeamAdapter: RecyclerView.Adapter<TeamAdapter.TeamViewHolder>() {

    private var oldData = emptyList<Team>()

    class TeamViewHolder(val binding: ItemTeampageBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(
            ItemTeampageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.binding.tvName.text = oldData[position].Name
        holder.binding.tvRole.text = oldData[position].Role

        for(i in 0..oldData.size step 5){
            when (position) {
                i -> {
                    holder.binding.tvName.setTextColor(Color.parseColor("#4483F3"))
                }
                i + 1 -> {
                    holder.binding.tvName.setTextColor(Color.parseColor("#FBBB04"))
                }
                i + 2 -> {
                    holder.binding.tvName.setTextColor(Color.parseColor("#0C9C5B"))
                }
                i + 3 -> {
                    holder.binding.tvName.setTextColor(Color.parseColor("#EB4434"))
                }
                i + 4 -> {
                    holder.binding.tvName.setTextColor(Color.parseColor("#141115"))
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return oldData.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newData: List<Team>){
        oldData = newData
        notifyDataSetChanged()
    }

}