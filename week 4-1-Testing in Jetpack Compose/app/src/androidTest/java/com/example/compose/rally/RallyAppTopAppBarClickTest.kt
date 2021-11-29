package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertIsSelected
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test

class RallyAppTopAppBarClickTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun topAppBarTest_useAction() {
        composeTestRule.setContent {
            RallyApp()
        }

        val btn = composeTestRule.onNodeWithContentDescription(RallyScreen.Bills.name, useUnmergedTree = true)
        btn.assertIsDisplayed()
        btn.performClick()
        btn.assertIsSelected()
    }
}