package com.example.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.fragmentos.databinding.FragmentProductListBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ProductList.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductList : Fragment() {

    lateinit var _binding:FragmentProductListBinding
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val views=FragmentProductListBinding.inflate(inflater, container, false)

        val myPackage=Bundle()

        views.btn1.setOnClickListener {
            myPackage.putInt("value",1)

            parentFragmentManager.setFragmentResult("pack",myPackage)
        }

        views.btn2.setOnClickListener {
            myPackage.putInt("value",2)

            parentFragmentManager.setFragmentResult("pack",myPackage)
        }

        views.btn3.setOnClickListener {
            myPackage.putInt("value",3)

            parentFragmentManager.setFragmentResult("pack",myPackage)
        }

        return views.root

    }

  }