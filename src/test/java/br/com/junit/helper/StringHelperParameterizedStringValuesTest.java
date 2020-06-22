package br.com.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterizedStringValuesTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
    StringHelper helper = new StringHelper();

    private String input;
    private String expectedOutput;

    public StringHelperParameterizedStringValuesTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<String[]> testConditions() {
        String expectedOutputs[][] = {
                {"AACD", "CD"},
                {"ACD", "CD"},
                {"CDAA", "CDAA"}
        };
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testTruncateAInFirstPositions() {
        assertEquals(expectedOutput,
                helper.truncateAInFirst2Positions(input));
    }
}