package com.example.fsp.adapter

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fsp.databinding.ItemPageBinding

class ViewPagerAdapter(private var background: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPageBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(
            ItemPageBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )

    override fun getItemCount() = background.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val back = background[position]
        holder.binding.editBackground.setBackgroundResource(back)
    }

}