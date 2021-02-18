package com.stah.toeic5

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AudioListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    sealed class AdapterItem {
        data class SampleItem(val data: String)
    }

    //class SampleItemViewHolder(val binding: ListItemSampleBinding) :
    //        RecyclerView.ViewHolder(binding.root)
    //class AdapterListViewHolder(val binding: )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
