package com.example.musicplayer.fragment.tabfragment

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.musicplayer.R
import com.example.musicplayer.databinding.FragmentListenBinding
import com.example.musicplayer.utils.setChipWithEvent
import com.example.musicplayer.utils.setFirstRecyclerView
import com.example.musicplayer.viewmodel.ListenViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File


class ListenFragment : Fragment() {
    private lateinit var binding: FragmentListenBinding
    private val model: ListenViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListenBinding.inflate(layoutInflater, container, false)
        setChipWithEvent(requireActivity(), binding.chipGroup, binding)

        setFirstRecyclerView(requireActivity(), binding)






        return binding.root
    }


}