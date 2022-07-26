package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.loginandsignup.databinding.FragmentForgetPasswordBinding

class ForgetPasswordFragment : Fragment(R.layout.fragment_forget_password) {

    private lateinit var binding: FragmentForgetPasswordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentForgetPasswordBinding.bind(view)

        binding.buttonGetRecoveryCode.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_ForgetPasswordFragment_to_OneTimePasswordFragment)
        }
    }
}