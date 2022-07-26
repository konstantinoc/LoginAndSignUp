package com.example.loginandsignup

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.loginandsignup.databinding.FragmentLoginBinding


class LoginFragment : Fragment(R.layout.fragment_login) {
    
    private lateinit var binding: FragmentLoginBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding.textViewSignUp.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_LoginFragment_to_RegisterFragment)
        }

        binding.textViewForgotPassword.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_LoginFragment_to_ForgetPasswordFragment)
        }
    }

}