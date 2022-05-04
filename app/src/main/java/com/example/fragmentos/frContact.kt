package com.example.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentos.databinding.FragmentFrContactBinding

class frContact : Fragment() {

lateinit var layout:FragmentFrContactBinding
private val vinculacion get()=layout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

      }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        layout= FragmentFrContactBinding.inflate(inflater, container, false)

        return layout.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val d=requireArguments().getString("user")
        layout.textView3.append(d.toString())

    }
}