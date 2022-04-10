package com.example.assignment2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChickenFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChickenFragment : Fragment(R.layout.fragment_chicken) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val b : Button =view.findViewById(R.id.buttonAddChicken)
        val m1:MainActivity= activity as MainActivity
        b.setOnClickListener {
            Toast.makeText(context, "Fried Chicken added", Toast.LENGTH_SHORT).show()
            m1.addChickenCost()
            m1.addChickenCount()
        }
    }
}