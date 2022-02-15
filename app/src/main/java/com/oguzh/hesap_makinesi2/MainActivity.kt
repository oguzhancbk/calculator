package com.oguzh.hesap_makinesi2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.oguzh.hesap_makinesi2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
    fun butonTik (view : View){
        if(yenioperator){
            binding.textview.text=""
        }
        yenioperator=false
        binding.button0
        binding.button1
        binding.button2
        binding.button3
        binding.button4
        binding.button5
        binding.button6
        binding.button7
        binding.button8
        binding.button9
        var butonsec = view as Button
        var butondeger:String = binding.textview.text.toString()

        when(butonsec.id){
            binding.button0.id->{
                butondeger="0"
            }
            binding.button1.id->{
                butondeger+="1"
            }
            binding.button2.id->{
                butondeger+="2"
            }
            binding.button3.id->{
                butondeger+="3"
            }
            binding.button4.id->{
                butondeger+="4"
            }
            binding.button5.id->{
                butondeger+="5"
            }
            binding.button6.id->{
                butondeger+="6"
            }
            binding.button7.id->{
                butondeger+="7"
            }
            binding.button8.id->{
                butondeger+="8"
            }
            binding.button9.id->{
                butondeger+="9"
            }
        }
    binding.textview.setText(butondeger)
    }
    var operator = "*"
    var eskisayi = ""
    var yenioperator = true
    fun islem (view : View){
        binding.bolu
        binding.cikarma
        binding.carpi
        binding.toplama
        var butonsec2 = view as Button

        when (butonsec2.id){
            binding.bolu.id->{
                operator="/"
            }
            binding.cikarma.id->{
                operator="-"
            }
            binding.toplama.id->{
                operator="+"
            }
            binding.carpi.id->{
                operator="*"
            }

        }
        eskisayi=binding.textview.text.toString()
        yenioperator=true


    }
    fun hesapla (view : View){
        var yenisayi=binding.textview.text.toString()
        var sonuc:Double? = null
        when(operator){
            "/"->{
                sonuc = eskisayi.toDouble() / yenisayi.toDouble()
            }
            "*"->{
                sonuc = eskisayi.toDouble() * yenisayi.toDouble()
            }
            "-"->{
                sonuc = eskisayi.toDouble() - yenisayi.toDouble()
            }
            "+"->{
                sonuc = eskisayi.toDouble() + yenisayi.toDouble()
            }

        }
        binding.textview.setText(sonuc.toString())
        yenioperator=true

    }

    fun ac (view : View){
        binding.textview.setText("")
        yenioperator=true

    }




}