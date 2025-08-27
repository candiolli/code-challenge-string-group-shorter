package com.candiolli.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testFirstScenario() {
        String firstScenario = Main.shorter("5F3Z-2e-9-w", 4);
        Assertions.assertEquals("5F3Z-2E9W", firstScenario);
    }

    @Test
    public void testSecondScenario() {
        String secondScenario = Main.shorter("2-5g-3-J", 2);
        Assertions.assertEquals("2-5G-3J", secondScenario);
    }

    @Test
    public void testThirdScenario() {
        String thirdScenario = Main.shorter("--a-a-a-a--", 2);
        Assertions.assertEquals("AA-AA", thirdScenario);
    }

    @Test
    public void testFortyScenario() {
        String testFortyScenario = Main.shorter("--", 3);
        Assertions.assertEquals("", testFortyScenario);
    }
}