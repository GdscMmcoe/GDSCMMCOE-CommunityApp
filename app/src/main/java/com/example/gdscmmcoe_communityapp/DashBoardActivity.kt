package com.example.gdscmmcoe_communityapp

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import com.example.gdscmmcoe_communityapp.R
import android.content.Intent
import com.example.gdscmmcoe_communityapp.DashBoardActivity
import com.example.gdscmmcoe_communityapp.TeamPageActivity
import com.example.gdscmmcoe_communityapp.AboutGDSCActivity

class DashBoardActivity : AppCompatActivity() {
    var bottomNavigationView: BottomNavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)

        bottomNavigationView?.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{ item ->
            when(item.itemId) {
                R.id.Home -> {
                    // Respond to navigation item 1 reselection
                    startActivity(Intent(applicationContext, AboutGDSCActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Logo -> {
                    // Respond to navigation item 2 reselection
                    startActivity(Intent(applicationContext, AboutGDSCActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.Team -> {
                    // Respond to navigation item 2 reselection
                    startActivity(Intent(applicationContext, AboutGDSCActivity::class.java))
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                else -> {
                    return@OnNavigationItemSelectedListener false

                }
            }
        }


            /*
            bottomNavigationView = findViewById(R.id.bottom_navigation)
            bottomNavigationView.setSelectedItemId(R.id.Home)
            bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.Home -> return@OnNavigationItemSelectedListener true
                    R.id.Logo -> {
                        startActivity(Intent(applicationContext, AboutGDSCActivity::class.java))
                        overridePendingTransition(0, 0)
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.Team -> {
                        startActivity(Intent(applicationContext, TeamPageActivity::class.java))
                        overridePendingTransition(0, 0)
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            })
             */
    }
}