package com.example.movie_popular.model


data class Character (
    var id: String? = null,
    var name: String? = null,
    var status: String? = null,
    var species: String? = null,
    var type: String? = null,
    var gender: String? = null,
    var image: String? = null,
    var episode: List<String>? = null,
    var url: String? = null,
    var created: String? = null

)