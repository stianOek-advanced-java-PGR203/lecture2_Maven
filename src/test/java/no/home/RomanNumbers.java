package no.home;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumbers {

    @Test
    void shouldConvert1ToI() {
        assertEquals("I", new toRoman().convert(1));
    }

    @Test
    void shouldConvert2ToII() {
        assertEquals("II", new toRoman().convert(2));
    }

    @Test
    void shouldConvert2ToIII() {
        assertEquals("III", new toRoman().convert(3));
    }
}


