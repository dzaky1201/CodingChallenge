package com.dzakyhdr.codingchallenge

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.dzakyhdr.codingchallenge.databinding.FragmentNameBinding

class NameFragment : Fragment() {
    private lateinit var binding: FragmentNameBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNameBinding.inflate(inflater, container, false)
        binding.btnName.setOnClickListener {
            if (!TextUtils.isEmpty(binding.edtName.text.toString())){
                val bundle = bundleOf("input_text" to binding.edtName.text.toString())
                it.findNavController().navigate(R.id.action_nameFragment_to_emailFragment, bundle)
            }else{
                Toast.makeText(requireContext(), "you must enter name in field", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        return binding.root
    }

}