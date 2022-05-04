package com.example.fragmentos

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentos.databinding.FragmentFootBinding
import com.example.fragmentos.databinding.FragmentProductListBinding

class Foot : Fragment() {

    lateinit var _binding: FragmentFootBinding
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val content= FragmentFootBinding.inflate(inflater, container, false)


        content.btnLaunch.setOnClickListener {
            startActivity(  Intent( requireActivity() ,AppFragment::class.java)   )
        }
        return content.root
    }

}