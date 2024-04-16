package com.example.segundo

import com.example.segundoparcial_21767.PokemonAn
import com.example.segundoparcial_21767.R

class PokemonView{
    init {}

    fun getPokemonList(): ArrayList<PokemonAn> {
        var pokeList: ArrayList<PokemonAn> = ArrayList<PokemonAn>()

        pokeList.add(PokemonAn(R.drawable.pokemon01, "Sprigatito"))
        pokeList.add(PokemonAn(R.drawable.pokemon02, "Fuecoco"))
        pokeList.add(PokemonAn(R.drawable.pokemon03, "Quaxly"))

        return pokeList
    }
}

