package br.com.junit.suites;

import br.com.junit.helper.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    ArrayCompareTest.class,
    QuickBeforeAfterTest.class,
    StringHelperTest.class
})
public class AllSimpleTest {
}
