package com.stah.toeic5

import androidx.lifecycle.ViewModel
import androidx.databinding.ObservableArrayList

class AudioListViewModel : ViewModel() {

    val audioList = ObservableArrayList<AudioListAdapter.AdapterItem>()

    // test
}
