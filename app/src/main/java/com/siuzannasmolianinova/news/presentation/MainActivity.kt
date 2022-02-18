package com.siuzannasmolianinova.news.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.siuzannasmolianinova.news.R
import com.siuzannasmolianinova.news.data.db.Category
import com.siuzannasmolianinova.news.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.Flow

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var category: Flow<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val bottomNavigation = binding.bottomNavigation
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        bottomNavigation.setupWithNavController(navController)
    }
}
