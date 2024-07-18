package com.example.zhazira_lesson_5_2_cw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.zhazira_lesson_5_2_cw.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClickListeners()
    }

    private fun initClickListeners() = with(binding) {
        btnCalculate.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            val fname = etFname.text.toString().trim()
            val sname = etSname.text.toString().trim()

            if (fname.isEmpty()) {
                etFname.error = "Enter first name"
            }
            if (sname.isEmpty()) {
                etSname.error = "Enter second name"
            }


        }
    }
}