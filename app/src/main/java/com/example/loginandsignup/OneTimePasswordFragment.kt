package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.loginandsignup.databinding.FragmentOneTimePasswordBinding

class OneTimePasswordFragment : Fragment(R.layout.fragment_one_time_password) {

    private lateinit var binding: FragmentOneTimePasswordBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentOneTimePasswordBinding.bind(view)

        binding.buttonSubmitCode.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_OneTimePasswordFragment_to_PasswordResetFragment)
        }
    }

}