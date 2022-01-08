package com.example.gdscmmcoe_communityapp.models

class ResourcesModel(
    private var image: Int,
    private var header: String,
    private var desc: String){

    fun getImage(): Int{
        return image
    }
    fun setImage(image: Int){
        this.image = image
    }

    fun getHeader(): String{
        return header
    }
    fun setHeader(header: String){
        this.header = header
    }

    fun getDesc(): String{
        return desc
    }
    fun setDesc(desc: String){
        this.desc = desc
    }

}