package com.example.taller5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_fourth.view.*


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class fourth : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        view.btn_fourth.setOnClickListener {
            findNavController().navigate(R.id.action_fourth_to_first_frag)
        }

        return view
    }


}