package com.example.fragmentos

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentResultListener
import com.example.fragmentos.databinding.FragmentCabeceraBinding
import com.example.fragmentos.databinding.FragmentProductListBinding

class Cabecera : Fragment() {

    lateinit var _binding: FragmentCabeceraBinding
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val views=FragmentCabeceraBinding.inflate(inflater, container, false)

        parentFragmentManager.setFragmentResultListener("pack",this, FragmentResultListener({res:String,data:Bundle->
            Log.i("result",data.getInt("value").toString())
            views.textView.append(data.getInt("value").toString())
        }))


        return views.root

    }


}