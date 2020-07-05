package com.example.exampletestui

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Test
    fun appLaunchSuccesfully() {
        ActivityScenario.launch(MainActivity::class.java)
        /*
        Note: If you’re not using the helpers, replace ActivityScenario.launch()
        with the following anytime you need to launch the activity:
        activityRule.launchActivity(null)

        */
    }
    @Test
    fun checkItemDisplayOnView(){
        ActivityScenario.launch(MainActivity::class.java)
//        onView(withText("Hello World!"))
        onView(withId(R.id.text2))
            .check(matches(isDisplayed()))
    }
}