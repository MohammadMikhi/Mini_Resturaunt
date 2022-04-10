package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.DialogFragment

class CartFragment : DialogFragment(R.layout.cart_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val buttonCancel: Button = view.findViewById(R.id.buttonCancelCart)
        val buttonSubmit: Button = view.findViewById(R.id.buttonCheckOutCart)
        val textBurger : TextView=view.findViewById(R.id.textViewBurger)
        val textSteak : TextView=view.findViewById(R.id.textViewSteak)
        val textChicken : TextView=view.findViewById(R.id.textViewChicken)
        val textTotal : TextView=view.findViewById(R.id.textViewTotal)
        val m1 : MainActivity=activity as MainActivity
        textBurger.text=textBurger.text.toString()+m1.getBurger()
        textChicken.text=textChicken.text.toString()+m1.getChicken()
        textSteak.text=textSteak.text.toString()+m1.getSteak()
        textTotal.text=textTotal.text.toString()+m1.getTotalCost().toString()+"$"
        buttonCancel.setOnClickListener { dismiss() }
        buttonSubmit.setOnClickListener {
            Toast.makeText(context, "Transaction Complete!", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }

}