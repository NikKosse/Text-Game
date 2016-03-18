package com.kosse.nikolas.textAdventure.Controllers.Locations;

import android.content.Context;
import android.test.AndroidTestCase;

import com.kosse.nikolas.textAdventure.ContextSource;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for the Forest controller
 */
public class ForestTest {

    private Forest _forest;

    @Before
    public void setUp() throws Exception {
        _forest = new Forest();
    }

    @Test
    public void testGetActionText_returnsString() throws Exception {
        String expectedText = "You explore the forest, not encountering any animals, and enjoy the peaceful sounds.";

        String actualText = _forest.getActionText();

        Assert.assertEquals(expectedText, actualText);
    }
}