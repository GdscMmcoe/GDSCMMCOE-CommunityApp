package com.example.gdscmmcoe_communityapp.data

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gdscteam")
data class Team(
    @PrimaryKey val id: Int,
    @NonNull
    val Name: String,
    @NonNull
    val Role: String
)