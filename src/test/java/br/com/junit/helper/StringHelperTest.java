package br.com.junit.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    // 1. First Successful JUnit. Green Bar and assertEquals
    //
    // Examples:
    // 1. AACD => CD;
    // 2. ACD => CD;
    // 3. CDEF => CDEF;
    // 4. CDAA => CDAA;
    //
    // Parameters: expected, actual
    // assertEquals(expected, actual);

    private StringHelper stringHelper;

    @Before
    public void before() {
        this.stringHelper = new StringHelper();
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPositions() {
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
    }

    // 2. Second JUnit Example assertTrue and assertFalse
    //
    // ABCD => false;
    // ABAB => true;
    // AB => true;
    // A = false;

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        // Condition fail.
        // assertFalse("The condition failed.", true);
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
}
