package com.example.testcorektxissue

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario.launch
import androidx.test.core.app.launchActivity
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertTrue

import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun withLaunch() {
        with(launch(MainActivity::class.java)) {
            onActivity {
                assertTrue(it.lifecycle == Lifecycle.State.RESUMED)
            }
        }
    }

    @Test
    fun withLaunchActivity() {
        with(launchActivity<MainActivity>()) {
            onActivity {
                assertTrue(it.lifecycle == Lifecycle.State.RESUMED)
            }
        }
    }
}
