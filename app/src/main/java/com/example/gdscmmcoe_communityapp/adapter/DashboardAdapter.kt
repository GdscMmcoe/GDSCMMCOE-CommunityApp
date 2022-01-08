package com.example.gdscmmcoe_communityapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gdscmmcoe_communityapp.databinding.ItemPastEventsBinding
import com.example.gdscmmcoe_communityapp.models.DashboardModel

class DashboardAdapter (
    private val values: MutableList<DashboardModel>
) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DashboardAdapter.ViewHolder {

        return ViewHolder(
            ItemPastEventsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: DashboardModel = values[position]

        holder.binding.ivPastEvents.setImageResource(model.getPoster())
        holder.binding.tvEventTitle.text = model.getTitle()
        holder.binding.tvEventsDate.text = model.getDate()
    }

    override fun getItemCount(): Int = values.size


    inner class ViewHolder(val binding: ItemPastEventsBinding) : RecyclerView.ViewHolder(binding.root)

}