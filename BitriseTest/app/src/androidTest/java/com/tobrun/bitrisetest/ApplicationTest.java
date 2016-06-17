package com.tobrun.bitrisetest;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import org.junit.Test;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    @Test
    public void testSanity() {
        Log.v("TAG", "Test APP");
        assert true;
    }
}