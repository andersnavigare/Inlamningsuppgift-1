package inlamningsUppgiftMorseAnders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestMorse {

    @Test
    public void toLetter_WhenInputIsDotDash_ReturnsA() {
        Morse morsa = new Morse();
        String actual = String.valueOf(morsa.toLetter(".-"));
        String expected = "A";
        assertEquals(expected, actual);
    }

    @Test
    public void toMorse_WhenInputIsA_ReturnsDotDash() {
        Morse morsa = new Morse();
        String actual = morsa.toMorse('A');
        String expected = ".-";
        assertEquals(expected, actual);
    }

    @Test
    public void convertToLetter_WhenInputInMorseIs_ANDERS_Return_ANDERS() {
        Morse morsa = new Morse();
        String actual = morsa.convertToLetter(".- -. -.. . .-. ...");
        String expected = "ANDERS";
        assertEquals(expected, actual);
    }

    @Test
    public void convertToMorse_WhenInputInLettersIs_ANDERS_Return_CorrectMorse() {
        Morse morsa = new Morse();
        String actual = morsa.convertToMorse("ANDERS");
        String expected = ".- -. -.. . .-. ...";
        assertEquals(expected, actual);
    }


    @Test
    public void convertToMorse_WhenInputInLettersIs_anders_Return_CorrectMorse() {
        Morse morsa = new Morse();
        String actual = morsa.convertToMorse("anders");
        String expected = ".- -. -.. . .-. ...";
        assertEquals(expected, actual);
    }

    @Test
    public void convertToLetter_WhenInputIsInvalid_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToMorse("!#€%&");
        });
    }

    @Test
    public void convertToMorse_WhenInputIsEmpty_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToLetter("");
        });

    }

    @Test
    public void convertToLetter_WhenInputIsNumeric_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToMorse("01234");
        });

    }

    @Test
    public void convertToMorse_WhenInputIsNumeric_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToLetter("56789");
        });

    }

    @Test
    public void convertToLetter_WhenMorseContainsExtraDot_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToLetter(".- -... -.-..");
        });
    }

    @Test
    public void convertToMorse_WhenLetterContainsNumerics_Throws_Exception() {
        Morse morsa = new Morse();
        assertThrows(IllegalArgumentException.class, () -> {
            morsa.convertToMorse("ANDERS17");
        });
    }

}






