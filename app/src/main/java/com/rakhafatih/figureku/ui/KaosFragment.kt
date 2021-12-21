package com.rakhafatih.figureku.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.rakhafatih.figureku.R
import com.rakhafatih.figureku.adapter.FigureAdapter
import com.rakhafatih.figureku.data.DataFigure
import com.rakhafatih.figureku.databinding.FragmentDashboardBinding

class KaosFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentDashboardBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvKaos.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(activity, 2)
            adapter = FigureAdapter(DataFigure.listKaos)

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}