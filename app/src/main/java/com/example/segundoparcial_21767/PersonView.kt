package com.example.segundoparcial_21767

import com.example.segundoparcial_21767.R
import com.example.segundoparcial_21767.Persona

class PersonView {
    init {}

    fun getPersonList(): ArrayList<Persona> {
        var peopleList: ArrayList<Persona> = ArrayList<Persona>()

        peopleList.add(Persona(R.drawable.female01, "Estudiante", "Chica", 12))
        peopleList.add(Persona(R.drawable.male01, "Estudiante", "Chico", 10))
        peopleList.add(Persona(R.drawable.female02, "Youtuber", "Chica", 14))
        peopleList.add(Persona(R.drawable.male02, "Profesor", "Chico", 35))
        peopleList.add(Persona(R.drawable.female03, "Enfermera", "Chica", 22))
        peopleList.add(Persona(R.drawable.male03, "Pescador", "Chico", 65))
        peopleList.add(Persona(R.drawable.female04, "Mecanica", "Chica", 21))
        peopleList.add(Persona(R.drawable.male04, "Cocinero", "Chico", 32))

        return peopleList
    }
}