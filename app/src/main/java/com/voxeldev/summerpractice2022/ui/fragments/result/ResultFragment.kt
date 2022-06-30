package com.voxeldev.summerpractice2022.ui.fragments.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.voxeldev.summerpractice2022.databinding.FragmentResultBinding
import com.voxeldev.summerpractice2022.ui.fragments.BaseFragment

class ResultFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        val root = binding.root

        val result = arguments?.getString("result")

        if (result != null)
            Snackbar.make(
                (binding as FragmentResultBinding).containerResult,
                result,
                Snackbar.LENGTH_LONG
            ).show()

        return root
    }
}