package com.example.odev5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev5.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    var toplam=0
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonEsittir.setOnClickListener{
            val sayi= binding.sayi.text.toString()
            toplam=0
            val str = sayi.split("+")

            for (parca in str){
                toplam+=parca.toIntOrNull()?:0
            }
            binding.textViewSonuc.text = toplam.toString()
        }

        binding.buttonSifirla.setOnClickListener{
            toplam=0
            binding.textViewSonuc.text="0"
            binding.sayi.setText("0")

        }


        return binding.root
    }
    }
