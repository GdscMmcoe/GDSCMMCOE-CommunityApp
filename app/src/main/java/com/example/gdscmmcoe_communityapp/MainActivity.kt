package com.example.gdscmmcoe_communityapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.gdscmmcoe_communityapp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfigurationDrawer: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    //private lateinit var listener: NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setting navHost for fragment navigation
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment
        navController = navHostFragment.navController
        setupActionBarWithNavController(navController)

        //Creating bottomNavigation
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        bottomNavigationView.setupWithNavController(navController)

//        val appBarConfigurationHeader = AppBarConfiguration(setOf(R.id.homeFragment, R.id.aboutFragment, R.id.teamFragment))
//        setupActionBarWithNavController(navController, appBarConfigurationHeader)
        //Creating Nav Drawer
        drawerLayout = findViewById(R.id.drawerLayout)
        binding.navigationMenu.setupWithNavController(navController)

        appBarConfigurationDrawer = AppBarConfiguration(setOf(R.id.homeFragment, R.id.aboutFragment, R.id.teamFragment), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfigurationDrawer)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfigurationDrawer) || super.onSupportNavigateUp()
    }

}