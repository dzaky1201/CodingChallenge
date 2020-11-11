package com.dzakyhdr.codingchallenge

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.dzakyhdr.codingchallenge.databinding.FragmentEmailBinding

class EmailFragment : Fragment() {
    private lateinit var binding: FragmentEmailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEmailBinding.inflate(inflater,  container, false)
        val name = requireArguments().getString("input_text")
        binding.btnSubmit.setOnClickListener {
            if (!TextUtils.isEmpty(binding.edtEmail.text.toString())) {
                val bundle = bundleOf(
                    "input_email" to binding.edtEmail.text.toString(),
                    "input_name" to name
                )
                it.findNavController().navigate(R.id.action_emailFragment_to_welcomeFragment, bundle)
            } else {

            }
        }
        return binding.root
    }

}