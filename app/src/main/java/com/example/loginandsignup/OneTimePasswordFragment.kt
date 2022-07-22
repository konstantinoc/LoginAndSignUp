package com.example.loginandsignup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_one_time_password.view.*

class OneTimePasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one_time_password, container, false)

        view.buttonSubmitCode.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_oneTimePasswordFragment_to_passwordResetFragment)
        }

        return view
    }

}