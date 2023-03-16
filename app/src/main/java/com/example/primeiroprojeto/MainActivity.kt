package com.example.primeiroprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeiroprojeto.ui.theme.PrimeiroProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimeiroProjetoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        Saudacoes("Aluno!")
                        TituloDoApp()
                        Text(text = "Primeira Atividade.")
                    }

                }
            }
        }
    }
}

@Composable
fun Saudacoes(name: String) {
    Text(text = "Olá $name!")
}

@Composable
fun TituloDoApp(){
    Text(text = "Aula Mobile I")

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PrimeiroProjetoTheme {
        Column() {
            TituloDoApp()
            Saudacoes("Aluno!")
            Text(text = "Primeira Atividade.")
        }

    }
}