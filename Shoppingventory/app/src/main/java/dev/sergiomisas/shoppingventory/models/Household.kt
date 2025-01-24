package dev.sergiomisas.shoppingventory.models

data class Household (
    val id: String,
    val name: String,
    val creator: User,
    val admins: MutableList<User> = mutableListOf<User>(),
    val members: MutableList<User> = mutableListOf<User>(),
    val items: MutableList<Item> = mutableListOf<Item>(),
    val householdInventory: MutableList<Item> = mutableListOf<Item>(),
    val shoppingList : MutableList<Item> = mutableListOf<Item>()
)