package com.example.a30daysofrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofrecipes.data.Recipe
import com.example.a30daysofrecipes.data.recipes
import com.example.a30daysofrecipes.ui.theme._30DaysOfRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysOfRecipesTheme {

            }
        }
    }
}

@Composable
fun RecipeCard(recipe: Recipe){
    Card {
        Row{
            Image(
                painter = painterResource(id = recipe.imageRes),
                contentDescription = stringResource(id = recipe.titleRes),
                modifier = Modifier.size(width = 70.dp, height = 70.dp)
            )
            Text(text = stringResource(id = recipe.titleRes))
        }
    }
}

@Composable
@Preview(showBackground = false)
fun RecipeCardPreview() {
    _30DaysOfRecipesTheme() {
        RecipeCard(recipe = recipes[0])
    }
}
