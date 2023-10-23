package com.example.birthdaywish

import kotlin.math.PI
import kotlin.math.pow

class Circle(override val name: String, var radius:Double ) : Shape(){

    override fun calculateArea() :Double {
        var area :Double = PI* radius.pow(2)
        return area

    }
}