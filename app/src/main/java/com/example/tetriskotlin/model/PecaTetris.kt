package com.example.tetriskotlin.model

import androidx.compose.ui.graphics.Color
import com.example.tetriskotlin.ui.theme.PurpleGrey80

data class PecaTetris(
    val tipoDePeca: TipoDePeca,
    var x: Int,
    var y: Int,
    var indexRotacao: Int = 0
)

enum class TipoDePeca(
    val shapes: Array<Array<IntArray>>,
    val cor: Color
){
    I(arrayOf(
        arrayOf(intArrayOf(1,1,1,1)), //Horizontal
        arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1), intArrayOf(1))// Vertical

    ),PurpleGrey80),

    J(arrayOf(
        arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1 ,1)),
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0 ,0)),
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0 ,1),
            intArrayOf(1 ,1))
        ), PurpleGrey80),

    L(arrayOf(
        arrayOf(
            intArrayOf(1, 0, 0),
            intArrayOf(1, 1 ,1)),
        arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 0),
            intArrayOf(1, 0)),
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(0 ,0 ,1)),
        arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 0),
            intArrayOf(1, 1))
    ), PurpleGrey80),

    O(arrayOf(
        arrayOf(
            intArrayOf(1, 1), intArrayOf(1, 1))
    ), PurpleGrey80),

    S(arrayOf(
        arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 1 ,0)),
        arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 1),
            intArrayOf(0, 1))
    ), PurpleGrey80),

    T(arrayOf(
            arrayOf(
                intArrayOf(0, 1, 0),
                intArrayOf(1, 1, 1)),
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 1),
                intArrayOf(0, 1))
    ), PurpleGrey80),

    Z(arrayOf(
        arrayOf(
                intArrayOf(1, 1, 0),
                intArrayOf(0, 1 ,1)),
            arrayOf(
                intArrayOf(0, 1),
                intArrayOf(1, 1),
                intArrayOf(1, 0))
    ), PurpleGrey80)

}