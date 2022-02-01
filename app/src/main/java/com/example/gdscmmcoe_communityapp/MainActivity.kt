package com.example.gdscmmcoe_communityapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
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

        //Turning off dark mode
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

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

        //Navigation Drawer Browser Intents

        binding.navigationMenu.menu.getItem(1).intent =
            openIntent("https://gdsc.community.dev/marathwada-mitra-mandals-college-of-engineering-pune/")

        binding.navigationMenu.menu.getItem(4).intent =
            openIntent("https://github.com/GdscMmcoe/GDSCMMCOE-CommunityApp")

        binding.navigationMenu.menu.findItem(R.id.Instagram).intent =
            openIntent("https://instagram.com/gdsc_mmcoe?utm_medium=copy_link")

        binding.navigationMenu.menu.findItem(R.id.Linkedin).intent =
            openIntent("https://www.linkedin.com/in/gdsc-mmcoe-b1065b21b")

        binding.navigationMenu.menu.findItem(R.id.Youtube).intent =
            openIntent("https://youtube.com/channel/UCLwzfI-P_ommZ_QMDGECmYQ")

        binding.navigationMenu.menu.findItem(R.id.Github).intent =
            openIntent("https://github.com/GdscMmcoe/GDSCMMCOE-CommunityApp")

        binding.navigationMenu.menu.findItem(R.id.Discord).intent =
            openIntent("https://discord.com/invite/eJnJdXw6sa")


    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfigurationDrawer) || super.onSupportNavigateUp()
    }

    private fun openIntent(uri: String): Intent {
        return Intent(
            Intent.ACTION_VIEW,
            Uri.parse(uri)
        )
    }

}