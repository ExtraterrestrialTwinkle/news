package com.siuzannasmolianinova.news.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.siuzannasmolianinova.news.databinding.FragmentBlankBinding
import com.siuzannasmolianinova.news.presentation.adapter.NewsAdapter
import com.siuzannasmolianinova.news.presentation.view_model.ScienceNewsViewModel

class ScienceNewsFragment : Fragment() {
    private var _binding: FragmentBlankBinding? = null
    private val binding: FragmentBlankBinding get() = _binding!!
    private val viewModel: ScienceNewsViewModel by viewModels()
    private lateinit var newsAdapter: NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.text.text = "Science News"
    }
}
