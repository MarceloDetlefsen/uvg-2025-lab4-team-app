package com.uvg.teamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uvg.teamapp.Repository.FakeTeamRepository
import com.uvg.teamapp.model.TeamMember
import com.uvg.teamapp.ui.theme.TeamAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TeamAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}


@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val repository = FakeTeamRepository()
    val members = repository.getTeamMembers()

    var selectedMember by remember { mutableStateOf<TeamMember?>(null) }

    if (selectedMember == null) {
        TeamListScreen(
            members = members,
            onMemberClick = { member ->
                selectedMember = member
            },
            modifier = modifier
        )
    } else {
        TeamDetailScreen(
            member = selectedMember!!,
            onBack = {
                selectedMember = null
            },
            modifier = modifier
        )
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TeamListScreen(
    members: List<TeamMember>,
    onMemberClick: (TeamMember) -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Miembros del Equipo") }
            )
        },
        modifier = modifier
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(members) { member ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable { onMemberClick(member) },
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = member.name, fontWeight = FontWeight.Bold)
                        Text(
                            text = member.description,
                            style = MaterialTheme.typography.bodyMedium,
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}