package inlamningsUppgiftAnders;

public class TextMain {

    public static void main(String[] args) {

        String text = ""; // En tom String skapas för att vi ska kunna anropa TextReader

        TextReader reader = new TextReader(text);

        System.out.println("Skriv in text och skriv ordet stop för att avsluta programmet.");

        reader.getStop();
        // Anropar metoden getStop för att köra en loop som körs fram till ordet stop skrivs

        System.out.println("Antal tecken: " + reader.getCharacters()); // Anropar
        System.out.println("Antal rader: " + reader.getLines()); // Anropar
        System.out.println("Antal ord: " + reader.getWords()); // Anropar
        System.out.println("Det längsta ordet är: " + reader.getLongestWord()); // Anropar
    }
}