package com.company.tictacapp.common.models

import android.graphics.Color

class ImageColor(var red: Int = 0, var green: Int = 0, var blue: Int = 0, var alpha: Int = 0) {

    fun withPixel(pixel: Int) : ImageColor {
        red = Color.red(pixel)
        green = Color.green(pixel)
        blue = Color.blue(pixel)
        alpha = Color.alpha(pixel)
        return this
    }

    fun compareColor(red: Int, green: Int, blue: Int, alpha:Int = 0) : Boolean {
        return this.red == red  && this.green == green && this.blue == blue && this.alpha == alpha
    }

    fun isBlue() : Boolean = compareColor(red = 0, green = 15, blue = 255, alpha = 255)
    fun isRed() : Boolean = compareColor(red = 255, green = 0, blue = 0, alpha = 255)
}