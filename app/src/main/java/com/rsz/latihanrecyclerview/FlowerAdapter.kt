package com.rsz.latihanrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rsz.latihanrecyclerview.FlowerAdapter.*
import com.rsz.latihanrecyclerview.databinding.ActivityMainBinding
import com.rsz.latihanrecyclerview.databinding.FlowerItemBinding

class FlowerAdapter(private val flowerList : Array<String>)
    : RecyclerView.Adapter<FlowerViewHolder>() {

    class FlowerViewHolder(private val itemBinding: FlowerItemBinding) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(word : String) {
            itemBinding.flowerText.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
       val itembinding = FlowerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FlowerViewHolder(itembinding)
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        val word = flowerList[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int {
        return flowerList.size
    }
}