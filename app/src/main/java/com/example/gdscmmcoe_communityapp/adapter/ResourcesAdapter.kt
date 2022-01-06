package com.example.gdscmmcoe_communityapp.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.gdscmmcoe_communityapp.databinding.ItemResourcesBinding
import com.example.gdscmmcoe_communityapp.models.ResourcesModel

class ResourcesAdapter(
    private val values: MutableList<ResourcesModel>
) : RecyclerView.Adapter<ResourcesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            ItemResourcesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: ResourcesModel = values[position]

        holder.binding.ivRes.setImageResource(model.getImage())
        holder.binding.tvHeader.text = model.getHeader()
        holder.binding.tvDesc.text = model.getDesc()
    }

    override fun getItemCount(): Int = values.size


    inner class ViewHolder(val binding: ItemResourcesBinding) : RecyclerView.ViewHolder(binding.root)


}