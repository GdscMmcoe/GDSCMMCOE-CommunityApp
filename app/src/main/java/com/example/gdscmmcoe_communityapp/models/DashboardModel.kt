package com.example.gdscmmcoe_communityapp.models

class DashboardModel (
    private var poster: Int,
    private var title: String,
    private var date: String){

        fun getPoster(): Int{
            return poster
        }

        fun getTitle(): String{
            return title
        }

        fun getDate(): String{
            return date
        }

}
