package com.example.jetpackcomposetutorial.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackcomposetutorial.databinding.FragmentFavoriteDishesBinding
import com.example.jetpackcomposetutorial.databinding.FragmentRandomDishBinding
import com.example.jetpackcomposetutorial.viewmodel.DashboardViewModel

class FavoriteDishesFragment : Fragment() {

    private var _binding: FragmentFavoriteDishesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentFavoriteDishesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}