package com.mauriciolomba.fragmentexamplejetpacknavigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args : SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textview_info)
        textView.text = args.text

        val button = view.findViewById<Button>(R.id.button_previous)
        button.setOnClickListener{
            //val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            //view.findNavController().navigate(action)
            parentFragmentManager.popBackStack()
        }
    }

}