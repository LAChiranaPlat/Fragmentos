package com.example.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentos.databinding.ActivityAppFragmentBinding

class AppFragment : AppCompatActivity() {

    lateinit var layout:ActivityAppFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        layout= ActivityAppFragmentBinding.inflate(layoutInflater)

        val fragmentHome=frHome()
        val fragmentContactos=frContact()
        val fragmentSetting=frSetting()

        val _package=Bundle()

        layout.btnHome.setOnClickListener {

            val managerFrag=supportFragmentManager.beginTransaction()
            managerFrag.setCustomAnimations(R.anim.intro,0,0,R.anim.exit)
            managerFrag.replace(layout.frContainer.id,fragmentHome)
            managerFrag.addToBackStack(null)
            managerFrag.commit()

        }

        layout.btnContact.setOnClickListener {

            _package.putString("user","Huarseral")

            fragmentContactos.arguments=_package

            val managerFrag=supportFragmentManager.beginTransaction()
            managerFrag.setCustomAnimations(R.anim.intro,0,0,R.anim.exit)
            managerFrag.replace(layout.frContainer.id,fragmentContactos)
            managerFrag.addToBackStack(null)
            managerFrag.commit()


        }

        layout.btnSetting.setOnClickListener {

            val managerFrag=supportFragmentManager.beginTransaction()
            managerFrag.setCustomAnimations(R.anim.intro,0,0,R.anim.exit)
            managerFrag.replace(layout.frContainer.id,fragmentSetting)
            managerFrag.addToBackStack(null)
            managerFrag.commit()

        }

        setContentView(layout.root)

    }
}