package com.example.battle

import java.io.Serializable

data class ShipsCoordinates(val playerCoordinates: ArrayList<Pair<String, Int>>) : Serializable
