package com.voxeldev.summerpractice2022.ui.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.voxeldev.summerpractice2022.R
import com.voxeldev.summerpractice2022.databinding.FragmentHomeBinding
import com.voxeldev.summerpractice2022.ui.fragments.BaseFragment

class HomeFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = (binding as FragmentHomeBinding).textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        val resultButton = (binding as FragmentHomeBinding).buttonResult
        resultButton.setOnClickListener {
            findNavController().navigate(
                R.id.action_navigation_home_to_navigation_result,
                bundleOf("result" to this::class.simpleName)
            )
        }

        return root
    }
}