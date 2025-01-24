package dev.sergiomisas.shoppingventory.models

data class Item(
    val name: String,
    val price: Double,
    val supermarket: Supermarket,
    val quantity: Int = 0,
    val picture: String
)
