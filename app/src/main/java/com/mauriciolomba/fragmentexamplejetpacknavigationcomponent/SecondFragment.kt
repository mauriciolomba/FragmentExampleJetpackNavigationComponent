package com.mauriciolomba.fragmentexamplejetpacknavigationcomponent

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {

    private val args : SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("SecondFragment", "OnCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.textview_info)
        textView.text = args.text

        val button = view.findViewById<Button>(R.id.button_previous)
        button.setOnClickListener{
            //val action = SecondFragmentDirections.actionSecondFragmentToFirstFragment()
            //view.findNavController().navigate(action)
            view.findNavController().popBackStack()
        }
    }

}