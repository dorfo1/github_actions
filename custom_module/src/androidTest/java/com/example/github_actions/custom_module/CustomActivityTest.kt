package com.example.github_actions.custom_module

import android.content.ContextWrapper
import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Test


class CustomActivityTest {

    @Test
    fun whenCustomActivityLaunchs_checkViewIsDisplayed() {

        ActivityScenario.launch<CustomActivity>(
            Intent(
                InstrumentationRegistry.getInstrumentation().targetContext,
                CustomActivity::class.java
            )
        )
        onView(ViewMatchers.withText("CUSTOM ACTIVITY"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

}