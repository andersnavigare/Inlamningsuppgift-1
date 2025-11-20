package inlamningsUppgiftAnders;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextTest {

    @Test
    public void testOfUsingBigAndSmallCharacters() {
        TextReader reader = new TextReader("This Is Text");
        assertEquals(12, reader.getCharacters());
    }

    @Test
    public void testOfUsingSpecialCharactersAndDigits() {
        TextReader reader = new TextReader("th1s.1s@t3xt.c0m");
        assertEquals(16, reader.getCharacters());
    }

    @Test
    public void testOfUsingNoCharacters() {
        TextReader reader = new TextReader("");
        assertEquals(0, reader.getCharacters());
    }

    @Test
    public void testOfCountingWords() {
        TextReader reader = new TextReader("This should be five words");
        assertEquals(5, reader.getWords());
    }

    @Test
    public void testOfCountingWordsWithoutWhitespace() {
        TextReader reader = new TextReader("This' 'should' 'actually' 'be' 'six' 'words \n");
        assertEquals(6, reader.getWords());
    }

    @Test
    public void testOfUsing1Line() {
        TextReader reader = new TextReader("Text With 1 Line");
        assertEquals(1, reader.getLines());
    }

    @Test
    public void testOfUsing2Lines() {
        TextReader reader = new TextReader("Text With 2 \n Lines");
        assertEquals(2, reader.getLines());
    }

    @Test
    public void testOfLongestWord() {
        TextReader reader = new TextReader("Longevity is the longest word");
        assertEquals("longevity", reader.getLongestWord());

    }
}