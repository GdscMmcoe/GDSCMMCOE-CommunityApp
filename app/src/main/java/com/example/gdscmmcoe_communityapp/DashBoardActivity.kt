package com.example.gdscmmcoe_communityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gdscmmcoe_communityapp.databinding.ActivityDashBoardBinding

class DashBoardActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfigurationDrawer: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDashBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        drawerLayout = findViewById(R.id.drawerLayout)
        binding.navigationMenu.setupWithNavController(navController)

        appBarConfigurationDrawer = AppBarConfiguration(setOf(R.id.homeFragment, R.id.aboutFragment, R.id.teamFragment), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfigurationDrawer)
    }
}