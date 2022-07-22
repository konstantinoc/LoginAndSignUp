package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_forget_password.view.*
import kotlinx.android.synthetic.main.fragment_login.view.*

class ForgetPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_forget_password, container, false)

        view.buttonGetRecoveryCode.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_forgetPasswordFragment_to_oneTimePasswordFragment)
        }

        return view
    }
}