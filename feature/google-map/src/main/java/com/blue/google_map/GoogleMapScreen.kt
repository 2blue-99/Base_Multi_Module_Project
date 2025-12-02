package com.blue.google_map

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun GoogleMapScreen(
    modifier: Modifier = Modifier,
    viewModel: CommonViewModel = hiltViewModel()
) {
    viewModel.insertTestData()
}