package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.loginandsignup.databinding.FragmentPasswordResetBinding


class PasswordResetFragment : Fragment(R.layout.fragment_password_reset) {

    private lateinit var binding: FragmentPasswordResetBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentPasswordResetBinding.bind(view)

        binding.buttonResetPassword.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_PasswordResetFragment_to_LoginFragment)
        }
    }

}