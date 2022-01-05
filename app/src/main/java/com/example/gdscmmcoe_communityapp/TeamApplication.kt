package com.example.gdscmmcoe_communityapp

import android.app.Application
import com.example.gdscmmcoe_communityapp.data.TeamDatabase

class TeamApplication : Application(){
    val database: TeamDatabase by lazy { TeamDatabase.getDatabase(this) }
}