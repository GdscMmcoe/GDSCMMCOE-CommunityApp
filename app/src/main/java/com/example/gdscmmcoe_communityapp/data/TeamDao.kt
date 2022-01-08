package com.example.gdscmmcoe_communityapp.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TeamDao {

    @Query("SELECT * FROM gdscteam")
    fun getAll(): Flow<List<Team>>

//    @Query("SELECT * FROM gdscteam WHERE name LIKE :searchQuery")
//    fun searchDatabase(searchQuery: String): Flow<List<Team>>

}