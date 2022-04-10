package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   private var steakCost : Double= 0.0
    private var steakCount : Int=0
    private var burgerCost : Double=0.0
   private var burgerCount : Int=0
    private var chickenCost : Double=0.0
    private var chickenCount : Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val steakFragment= SteakFragment()
        val chickenFragment= ChickenFragment()
        val burgerFragment= BurgerFragment()
        val steakButton : Button= findViewById(R.id.buttonSteak)
        val chickenButton : Button= findViewById(R.id.buttonChicken)
        val burgerButton : Button=findViewById(R.id.buttonBurger)
        val checkOut : Button=findViewById(R.id.buttonCheckOut)

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.frameLayout, steakFragment)
            commit()
        }
        steakButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, steakFragment)
                commit()
            }
        }
        burgerButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, burgerFragment)
                commit()
            }
        }
        chickenButton.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, chickenFragment)
                commit()
            }
        }
        checkOut.setOnClickListener {
            var cart= CartFragment()
            cart.show(supportFragmentManager, "Cart")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater= menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var rateVar=RateUsFragment()
        var cartVar=CartFragment()
        when(item.itemId){
            R.id.menuRate-> rateVar.show(supportFragmentManager, "Rate Us")
            R.id.menuCart-> cartVar.show(supportFragmentManager, "Cart")
        }
        return super.onOptionsItemSelected(item)
    }
    fun addBurgerCost() {
        burgerCost+=19.99
    }
    fun addSteakCost(){
        steakCost+=39.99
    }
    fun addChickenCost(){
        chickenCost+=9.99
    }


    fun addBurgerCount(){
        burgerCount++
    }
    fun addSteakCount() {
        steakCount++
    }
    fun addChickenCount() {
        chickenCount++
    }


    fun getBurger(): String {
        return burgerCost.toString() + "$ " + "\nAmount: "+burgerCount
    }
    fun getSteak(): String {
        return steakCost.toString() + "$ " + "\nAmount: "+steakCount
    }
    fun getChicken(): String {
        return chickenCost.toString() + "$ " + "\nAmount: "+chickenCount
    }


    fun getTotalCost() : Double {
        return burgerCost+steakCost+chickenCost
    }

}

