package com.voxeldev.summerpractice2022.ui.fragments.photo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.voxeldev.summerpractice2022.databinding.FragmentPhotoBinding
import com.voxeldev.summerpractice2022.ui.fragments.BaseFragment

class PhotoFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[PhotoViewModel::class.java]

        _binding = FragmentPhotoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = (binding as FragmentPhotoBinding).textPhoto
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}