package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void nameIsValid() {
        Boolean b = Main.NameIsValid("Herbert Wells");
        b = b && Main.NameIsValid("H. Wells");
        b = b && Main.NameIsValid("H. G. Wells");
        b = b && Main.NameIsValid("Herbert G. Wells");
        b = b && Main.NameIsValid("Herbert George Wells");
        Assertions.assertTrue(b);

        Boolean c = Main.NameIsValid("Herbert");
        c = c || Main.NameIsValid("Wells");
        c = c || Main.NameIsValid("H Wells");
        c = c || Main.NameIsValid("H. G Wells");
        c = c || Main.NameIsValid("h. Wells");
        c = c || Main.NameIsValid("H. wells");
        c = c || Main.NameIsValid("h. g. Wells");
        c = c || Main.NameIsValid("H. George Wells");
        c = c || Main.NameIsValid("H. G. W.");
        c = c || Main.NameIsValid("Herb. G. Wells");
        Assertions.assertFalse(c);
    }
}