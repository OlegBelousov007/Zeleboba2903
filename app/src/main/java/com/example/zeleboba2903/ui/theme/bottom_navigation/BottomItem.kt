package com.example.zeleboba2903.ui.theme.bottom_navigation

import android.icu.text.CaseMap.Title
import com.example.zeleboba2903.R

sealed class BottomItem(val title: String, val iconId: Int, val route: String){
    object Screen1: BottomItem("Home", R.drawable.iconehome, "screen_1")
    object Screen2: BottomItem("List product", R.drawable.iconlist, "screen_2")
    object Screen3: BottomItem("Favorites", R.drawable.iconeizbrannoe, "screen_3")
    object Screen4: BottomItem("Profile", R.drawable.iconeprofile, "screen_4")

}
