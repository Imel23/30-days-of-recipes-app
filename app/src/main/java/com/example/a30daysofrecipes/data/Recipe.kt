package com.example.a30daysofrecipes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysofrecipes.R

data class Recipe(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val ingredientRes: Int
)

val recipes = listOf<Recipe>(
    Recipe(R.drawable.day1,R.string.day1_title,R.string.day1_ingredients),
    Recipe(R.drawable.day2,R.string.day2_title,R.string.day2_ingredients),
    Recipe(R.drawable.day3,R.string.day3_title,R.string.day3_ingredients),
    Recipe(R.drawable.day4,R.string.day4_title,R.string.day4_ingredients),
    Recipe(R.drawable.day5,R.string.day5_title,R.string.day5_ingredients),
    Recipe(R.drawable.day6,R.string.day6_title,R.string.day6_ingredients),
    Recipe(R.drawable.day7,R.string.day7_title,R.string.day7_ingredients),
    Recipe(R.drawable.day8,R.string.day8_title,R.string.day8_ingredients),
    Recipe(R.drawable.day9,R.string.day9_title,R.string.day9_ingredients),
    Recipe(R.drawable.day10,R.string.day10_title,R.string.day10_ingredients),
    Recipe(R.drawable.day11,R.string.day11_title,R.string.day11_ingredients),
    Recipe(R.drawable.day12,R.string.day12_title,R.string.day12_ingredients),
    Recipe(R.drawable.day13,R.string.day13_title,R.string.day13_ingredients),
    Recipe(R.drawable.day14,R.string.day14_title,R.string.day14_ingredients),
    Recipe(R.drawable.day15,R.string.day15_title,R.string.day15_ingredients),
    Recipe(R.drawable.day16,R.string.day16_title,R.string.day16_ingredients),
    Recipe(R.drawable.day17,R.string.day17_title,R.string.day17_ingredients),
    Recipe(R.drawable.day18,R.string.day18_title,R.string.day18_ingredients),
    Recipe(R.drawable.day19,R.string.day19_title,R.string.day19_ingredients),
    Recipe(R.drawable.day20,R.string.day20_title,R.string.day20_ingredients),
    Recipe(R.drawable.day21,R.string.day21_title,R.string.day21_ingredients),
    Recipe(R.drawable.day22,R.string.day22_title,R.string.day22_ingredients),
    Recipe(R.drawable.day23,R.string.day23_title,R.string.day23_ingredients),
    Recipe(R.drawable.day24,R.string.day24_title,R.string.day24_ingredients),
    Recipe(R.drawable.day25,R.string.day25_title,R.string.day25_ingredients),
    Recipe(R.drawable.day26,R.string.day26_title,R.string.day26_ingredients),
    Recipe(R.drawable.day27,R.string.day27_title,R.string.day27_ingredients),
    Recipe(R.drawable.day28,R.string.day28_title,R.string.day28_ingredients),
    Recipe(R.drawable.day29,R.string.day29_title,R.string.day29_ingredients),
    Recipe(R.drawable.day30,R.string.day30_title,R.string.day30_ingredients)
)