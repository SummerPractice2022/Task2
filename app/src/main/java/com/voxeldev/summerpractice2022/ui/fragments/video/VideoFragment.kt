package com.voxeldev.summerpractice2022.ui.fragments.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.voxeldev.summerpractice2022.databinding.FragmentVideoBinding
import com.voxeldev.summerpractice2022.ui.fragments.BaseFragment

class VideoFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val videoViewModel =
            ViewModelProvider(this)[VideoViewModel::class.java]

        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = (binding as FragmentVideoBinding).textVideo
        videoViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}