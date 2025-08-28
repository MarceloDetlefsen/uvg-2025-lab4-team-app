package com.uvg.teamapp.Repository
import com.uvg.teamapp.model.TeamMember

/*
Universidad del Valle de Guatemala
Programación de Plataformas Móviles
Julián Divas - 24687
 */

class FakeTeamRepository {
    fun getTeamMembers(): List<TeamMember>{
        return listOf(
            TeamMember(
                name = "Alejandro Jerez",
                description = "Desarrollador Frontend"
            ),
            TeamMember(
              name = "Marcelo Detlegsen",
              description = "Desarrollador Backend"
            ),
            TeamMember(
                name = "Julián Divas",
                description = "Data Analyst"
            )
        )
    }
}