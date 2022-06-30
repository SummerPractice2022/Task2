package com.voxeldev.summerpractice2022.ui.fragments.music

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.voxeldev.summerpractice2022.databinding.FragmentMusicBinding
import com.voxeldev.summerpractice2022.ui.fragments.BaseFragment

class MusicFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val musicViewModel =
            ViewModelProvider(this)[MusicViewModel::class.java]

        _binding = FragmentMusicBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = (binding as FragmentMusicBinding).textMusic
        musicViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}