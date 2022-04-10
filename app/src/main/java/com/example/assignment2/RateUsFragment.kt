package com.example.assignment2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class RateUsFragment : DialogFragment(R.layout.rate_us_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val buttonCancel : Button=view.findViewById(R.id.buttonCancelCart)
        val buttonSubmit : Button=view.findViewById(R.id.buttonSubmit)
        val radioGroup=view.findViewById<RadioGroup>(R.id.radioGroup)
        buttonCancel.setOnClickListener { dismiss() }
        buttonSubmit.setOnClickListener {
            val selected : Int=radioGroup.checkedRadioButtonId
            val radioButton=view.findViewById<RadioButton>(selected)
            Toast.makeText(context, radioButton.text, Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }
}