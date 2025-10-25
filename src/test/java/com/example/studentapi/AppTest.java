package com.example.studentapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sampleTest() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual, "2 + 3 should equal 5");
    }
}
