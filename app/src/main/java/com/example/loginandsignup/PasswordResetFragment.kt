package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_one_time_password.view.*
import kotlinx.android.synthetic.main.fragment_password_reset.view.*


class PasswordResetFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_password_reset, container, false)

        view.buttonResetPassword.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_passwordResetFragment_to_loginFragment)
        }

        return view;
    }

}