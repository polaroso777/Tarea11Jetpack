package com.example.tarea11jetpack

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        // Referencias a mis botones
        val btnIntegrante1 = view.findViewById<Button>(R.id.btnIntegrante1)
        val btnIntegrante2 = view.findViewById<Button>(R.id.btnIntegrante2)

        // Navegar al perfil 1
        btnIntegrante1.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_perfil1)
        }

        // Navegar al perfil 2
        btnIntegrante2.setOnClickListener {
            findNavController().navigate(R.id.action_menu_to_perfil2)
        }

        return view
    }
}
