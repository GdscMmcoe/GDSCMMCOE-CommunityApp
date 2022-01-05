package com.example.gdscmmcoe_communityapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.flow.Flow
import com.example.gdscmmcoe_communityapp.data.Team
import com.example.gdscmmcoe_communityapp.data.TeamDao

class TeamViewModel(private val teamDao: TeamDao) : ViewModel() {
    fun teamPage(): Flow<List<Team>> = teamDao.getAll()
}


class TeamPageViewModelFactory(
    private val teamDao: TeamDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TeamViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TeamViewModel(teamDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}