package com.example.github_actions

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test


class MainActivityTest {


    @Test
    fun whenMainActivityLaunchs_checkViewIsDisplayed() {
        ActivityScenario.launch<MainActivity>(
            Intent(
                InstrumentationRegistry.getInstrumentation().targetContext,
                MainActivity::class.java
            )
        )
        onView(withId(R.id.buttonCustomActivity)).check(matches(isDisplayed()))
    }


    @Test
    fun whenClickCustomActivityButton_checkCustomActivityIsDisplayed() {
        ActivityScenario.launch<MainActivity>(
            Intent(
                InstrumentationRegistry.getInstrumentation().targetContext,
                MainActivity::class.java
            )
        )
        onView(withId(R.id.buttonCustomActivity)).perform(click())


        onView(withText("CUSTOM ACTIVITY")).check(matches(isDisplayed()))
    }

}