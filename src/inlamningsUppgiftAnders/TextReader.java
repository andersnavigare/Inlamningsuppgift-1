package inlamningsUppgiftAnders;

import java.util.Scanner;

public class TextReader {

    Scanner scan = new Scanner(System.in);

    private String text;

    public TextReader(String text) { // Konstruktor
        this.text = text;
    }

    public int getCharacters() { // Räknar och returnerar alla tecken inklusive whitespace
        return text.length();
    }

    public String getStop() { // Om input är stop oberoende av stor eller liten bokstav så avslutas programmet

        while (true) { // While loopen körs fram till stop skrivs
            String line = scan.nextLine();
            if (line.toLowerCase().contains("stop")) {
                System.out.println("Du skrev STOP så programmet avslutas här");
                break;
            }
            text = text + line + "\n"; // Villkor till return som skall returnera input med text inklusive radbyte
        }
        return text;
    }

    public int getLines() { // Returnerar hur många rader som används i texten
        if (text.isEmpty()) { // Villkoret att inget skall returneras om texten är tom
            return 0;
        }
        return text.split("\n").length; // Har använt metoden split och satt in "\n" som regex för att kontrollera radbyten
    }

    public int getWords() {
        if (text.isEmpty()) return 0;
        return text.trim().split("\\s+").length; // Split och length delar och räknar orden och "\\s+" tar bort all whitespace
    }                                                   // Trim tar bort whitespace i början och slutet av texten

    public String getLongestWord() {
        if (text.isEmpty()) return "";
        String[] words = text.split("\\s+"); // Skapar en array av ord i texten som genom split delas av mellanslag, radbyte etc.
        String longestWord = ""; // Tom String deklareras

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i].toLowerCase(); // Forloopen och if-satsen har gått igenom varje ord i index och hittat det längsta
            }
        }
        return longestWord;
    }
}



