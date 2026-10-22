package com.example.listaslazy.model

//data class serve para dados, neste caso estruturar os dados do projeto
data class Game (
    val id: Long = 0,
    val title: String = "",
    val studio: String = "",
    val releaseYear: Int = 0
)