package br.com.junit.helper;

import org.junit.*;

public class QuickBeforeAfterTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println(":: Before Class ::");
    }

    @Before
    public void setup() {
        // "Before" is executed before every test.
        System.out.println(":: Before test ::");
    }

    @Test
    public void testOne() {
        System.out.println("testOne executed.");
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo executed.");
    }

    @After
    public void tearDown() {
        // "After" is executed after every test.
        System.out.println(":: After test ::");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println(":: After Class ::");
    }
}
