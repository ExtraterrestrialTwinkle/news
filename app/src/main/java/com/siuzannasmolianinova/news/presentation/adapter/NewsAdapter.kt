package com.siuzannasmolianinova.news.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.siuzannasmolianinova.news.R
import com.siuzannasmolianinova.news.data.db.Article
import com.siuzannasmolianinova.news.databinding.ItemNewsBinding

class NewsAdapter : ListAdapter<Article, RecyclerView.ViewHolder>(DiffCallback()) {

    fun loadList(movies: List<Article>) {
        submitList(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NewsViewHolder).bind(currentList[position])
    }

    inner class NewsViewHolder(
        private val binding: ItemNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(article: Article) {
            binding.run {
                titleTextView.text = article.title
                descriptionTextView.text = article.description

                Glide.with(imageView)
                    .load(article.imageLink)
                    .placeholder(R.drawable.ic_image)
                    .error(R.drawable.ic_error)
                    .into(imageView)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
            return newItem.id == oldItem.id
        }

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
            return newItem.title == oldItem.title && newItem.description == oldItem.description
        }
    }
}
