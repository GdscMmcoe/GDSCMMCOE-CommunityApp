package com.example.gdscmmcoe_communityapp.utils

import com.example.gdscmmcoe_communityapp.R
import com.example.gdscmmcoe_communityapp.models.ResourcesModel

class resources_constants {

    companion object{
        fun defaultResourcesList(): ArrayList<ResourcesModel> {
            val resourcesList = ArrayList<ResourcesModel>()

            val cpp =
                ResourcesModel(R.drawable.cpp,"C++ Programming","Programming Language")
            resourcesList.add(cpp)

            val cp =
                ResourcesModel(R.drawable.cp,"C Programming","Programming Language")
            resourcesList.add(cp)

            val java =
                ResourcesModel(R.drawable.java,"Java Programming","Programming Language")
            resourcesList.add(java)

            val nodejs =
                ResourcesModel(R.drawable.nodejs,"NodeJs Programming","Programming Language")
            resourcesList.add(nodejs)

            val angular =
                ResourcesModel(R.drawable.angular,"Angular Programming","Programming Language")
            resourcesList.add(angular)

            val python =
                ResourcesModel(R.drawable.python,"Python Programming","Programming Language")
            resourcesList.add(python)

            val magento =
                ResourcesModel(R.drawable.magento,"Magento Programming","Programming Language")
            resourcesList.add(magento)

            val shopify =
                ResourcesModel(R.drawable.shopify,"Shopify Programming","Programming Language")
            resourcesList.add(shopify)

            val wordpress =
                ResourcesModel(R.drawable.wordpress,"Wordpress Programming","Programming Language")
            resourcesList.add(wordpress)

            val dotnet =
                ResourcesModel(R.drawable.dotnet,"Dotnet Programming","Programming Language")
            resourcesList.add(dotnet)

            return resourcesList
        }
    }
}