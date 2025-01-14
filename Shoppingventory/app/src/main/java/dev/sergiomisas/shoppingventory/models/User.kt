package dev.sergiomisas.shoppingventory.models

data class User(
    val email: String,
    val name: String,
    val picture: String,
    val households: List<String> = emptyList()
)