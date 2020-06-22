package br.com.junit.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class StringHelperParameterizedBooleanValuesTest {

    // AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA
    StringHelper helper = new StringHelper();

    private String input;
    private boolean expectedOutput;

    public StringHelperParameterizedBooleanValuesTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {"ABCD", false},
                {"ABAB", true}
        });
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame() {
        assertEquals(expectedOutput,
                helper.areFirstAndLastTwoCharactersTheSame(input));
    }
}