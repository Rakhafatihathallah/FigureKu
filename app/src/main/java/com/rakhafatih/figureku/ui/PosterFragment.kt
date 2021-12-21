package com.rakhafatih.figureku.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.rakhafatih.figureku.R
import com.rakhafatih.figureku.adapter.FigureAdapter
import com.rakhafatih.figureku.data.Figures
import com.rakhafatih.figureku.databinding.FragmentPosterBinding


class PosterFragment : Fragment() {

    private var _binding: FragmentPosterBinding? = null
    private val binding get() = _binding!!

    private val listPoster: ArrayList<Figures> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPosterBinding.inflate(inflater, container, false)

        initData()
        return binding.root
    }

    private fun initData() {
        resources.apply {
            val name = getStringArray(R.array.name_poster)
            val category = getStringArray(R.array.category_poster)
            val description = getStringArray(R.array.description_poster)
            val photo = getStringArray(R.array.photo_poster)
            val price = getStringArray(R.array.price_poster)

            for (data in name.indices) {
                val poster = Figures(
                    name[data],
                    category[data],
                    description[data],
                    photo[data],
                    price[data]
                )
                listPoster.add(poster)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvPoster.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(activity, 2)
            adapter = FigureAdapter(listPoster)

        }
    }

}