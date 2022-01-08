package com.example.gdscmmcoe_communityapp.utils

import com.example.gdscmmcoe_communityapp.R
import com.example.gdscmmcoe_communityapp.models.DashboardModel

class dashboard_constants {

    companion object{
        fun defaultDashboardList(): ArrayList<DashboardModel> {
            val dashboardList = ArrayList<DashboardModel>()

            val androidCampaign =
                DashboardModel(R.drawable.android_campaign,"Android Study Jams: Intro to Kotlin","29 Nov 2021")
            dashboardList.add(androidCampaign)

            val cloudCampaign =
                DashboardModel(R.drawable.google_cloud_campaign,"30 Days of Google Cloud","27 Sept 2021")
            dashboardList.add(cloudCampaign)

            val openSource =
                DashboardModel(R.drawable.jina_ai,"Open Source Workshop with Jina AI","18 Sept 2021")
            dashboardList.add(openSource)

            val pro =
                DashboardModel(R.drawable.interview_roadmp,"NodeJs Programming","4 Sept 2021")
            dashboardList.add(pro)


            return dashboardList
        }
    }
}