package com.example.hw6_7m.presentation.ui.fragment.second

import android.os.Bundle
import androidx.navigation.fragment.findNavController
import com.example.core_ui.core.BaseFragment
import com.example.hw6_7m.R
import com.example.hw6_7m.databinding.FragmentSecondBinding

class SecondFragment : BaseFragment<FragmentSecondBinding>(FragmentSecondBinding::inflate){

    override fun setupUI() {

        binding().btnSave.setOnClickListener {
            val edTitle = binding().edTitle.text.toString()
            val edDesc = binding().edDesc.text.toString()

            val bundle = Bundle()
            bundle.putString("edTitle", edTitle)
            bundle.putString("edDesc", edDesc)

            findNavController().navigate(R.id.mainFragment, bundle)
        }

    }

}