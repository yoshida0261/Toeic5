package com.stah.toeic5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.stah.toeic5.databinding.ListAudioToeic5Binding

class AudioListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    sealed class AdapterItem {
        data class SampleItem(val data: String)
    }

    class AdapterListViewHolder(val binding: ListAudioToeic5Binding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AdapterListViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_audio_toeic5, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
