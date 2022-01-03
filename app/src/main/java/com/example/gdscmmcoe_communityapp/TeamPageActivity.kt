package com.example.gdscmmcoe_communityapp

import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import android.os.Bundle
import com.example.gdscmmcoe_communityapp.R
import android.content.Intent
import com.example.gdscmmcoe_communityapp.DashBoardActivity
import com.example.gdscmmcoe_communityapp.TeamPageActivity
import com.example.gdscmmcoe_communityapp.AboutGDSCActivity

class TeamPageActivity : AppCompatActivity() {
    var bottomNavigationView: BottomNavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_page)
        bottomNavigationView?.setOnNavigationItemSelectedListener OnNavigationItemSelectedListener@{ item ->
            when (item.itemId) {
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
    }
}