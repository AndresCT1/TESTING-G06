package main;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GHappyTest {
    @Test
    public void testTwoHappyGsInMiddle() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("xxggxx"));
    }

    @Test
    public void testSingleGIsUnhappy() {
        GHappy g = new GHappy();
        assertFalse(g.gHappy("xxgxx"));
    }

    @Test
    public void testLastGIsUnhappy() {
        GHappy g = new GHappy();
        assertFalse(g.gHappy("xxggyygxx"));
    }

    @Test
    public void testAllHappyGs() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("gggg"));
    }

    @Test
    public void testNoGs() {
        GHappy g = new GHappy();
        assertTrue(g.gHappy("abcdef"));
    }
}