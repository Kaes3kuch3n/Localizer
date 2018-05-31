package de.kaes3kuch3n.localizer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LanguageTest {

    @Test
    public void toStringTest() {
        assertEquals("en", Language.EN.toString());
        assertEquals("de", Language.DE.toString());
        assertEquals("fr", Language.FR.toString());
    }
}