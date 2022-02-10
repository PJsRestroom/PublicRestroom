package com.example.publicrestroom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.publicrestroom.databinding.FragmentFirstTitleBinding

class FirstTitleFragment : Fragment() {

    private var mBinding: FragmentFirstTitleBinding? = null

    private val binding get() = mBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentFirstTitleBinding.inflate(inflater, container, false)



        return binding.root
    }
}