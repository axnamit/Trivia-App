package com.example.triviaapp.utils

import com.example.triviaapp.data.uimodel.Model

class SingletonClass {

    var nameText = ""
        private set

    var cricketerName = ""
        private set

    var list: MutableList<String> = arrayListOf()
        private set
    var data: MutableList<Model> = arrayListOf()
        private set

    fun setName(nameText: String) {
        this.nameText = nameText
    }

    fun setCricketerName(cricketerName: String) {
        this.cricketerName = cricketerName
    }

    fun setFlagList(list: MutableList<String>) {
        this.list = list
    }

    fun setData(j: MutableList<Model>) {
        this.data = j
    }


    companion object {
        private var single_instance: SingletonClass? = null
        val instance: SingletonClass?
            get() {
                if (single_instance == null) single_instance = SingletonClass()
                return single_instance
            }
    }
}