package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.loginandsignup.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment(R.layout.fragment_register) {

    private lateinit var binding: FragmentRegisterBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentRegisterBinding.bind(view)

        binding.textViewLogin.setOnClickListener{
            Navigation.findNavController(view).popBackStack()
        }

        binding.buttonSignUp.setOnClickListener {

        }
    }
}