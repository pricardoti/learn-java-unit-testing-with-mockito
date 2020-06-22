package br.com.junit.suites;

import br.com.junit.helper.StringHelperParameterizedBooleanValuesTest;
import br.com.junit.helper.StringHelperParameterizedStringValuesTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    StringHelperParameterizedStringValuesTest.class,
    StringHelperParameterizedBooleanValuesTest.class
})
public class AllParameterizedTest {
}
