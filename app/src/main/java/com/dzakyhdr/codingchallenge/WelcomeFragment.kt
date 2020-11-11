package com.dzakyhdr.codingchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.dzakyhdr.codingchallenge.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)
        val name = requireArguments().getString("input_name")
        val email= requireArguments().getString("input_email")
        binding.tvEmail.text = email
        binding.tvName.text = name

        binding.btnWelcome.setOnClickListener {
            it.findNavController().navigate(R.id.action_welcomeFragment_to_termsFragment)
        }
        return binding.root
    }

}