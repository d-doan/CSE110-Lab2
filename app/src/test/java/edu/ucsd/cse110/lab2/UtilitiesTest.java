package edu.ucsd.cse110.lab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayTrim() {
        assertEquals("1.234", Utilities.trimDisplayStr("1.2340"));
        assertEquals("13", Utilities.trimDisplayStr("13.0"));
    }
}
