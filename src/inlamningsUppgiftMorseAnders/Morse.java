package inlamningsUppgiftMorseAnders;

import java.util.HashMap;
import java.util.Scanner;

public class Morse {

    private String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String morse = ".- -... -.-. -.. . ..-. --. .... .. .--- -.- .-.. -- -. --- .--. --.- .-. ... - ..- ...- .-- -..- -.-- --..";

    HashMap<Character, String> charToMorse = new HashMap<>();
    HashMap<String, Character> morseToChar = new HashMap<>();


    public Morse() {
        String[] morseArray = morse.split("\\s+");
        for (int i = 0; i < alfabet.length(); i++) {

            char letter = alfabet.charAt(i);
            String code = morseArray[i];
            charToMorse.put(letter, code);
            morseToChar.put(code, letter);
        }
    }

    public String toMorse(char letter) {
        return charToMorse.get(letter);

    }

    public Character toLetter(String code) {
        return morseToChar.get(code);

    }

    public String convertToMorse(String text) {
        String result = "";

        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Please type letters");
        }
        for (int i = 0; i < text.length(); i++) {
            char letter = Character.toUpperCase(text.charAt(i));

            if (!charToMorse.containsKey(letter)) {
                throw new IllegalArgumentException("Invalid input");

            }
            result += toMorse(letter) + " ";

        }
        return result.trim();
    }

    public String convertToLetter(String morseCode) {
        String result = "";

        if (morseCode == null || morseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Please, type morse-code");
        }

        String[] codes = morseCode.split("\\s+");
        for (int i = 0; i < codes.length; i++) {

            if (!morseToChar.containsKey(codes[i])) {
                throw new IllegalArgumentException("Invalid morse-code");

            }

            result += toLetter(codes[i]);
        }

        return result;
    }

    public void processChoice(int choice, Scanner scan) {
        String result;
        switch (choice) {
            case 1:
                try {
                    System.out.println("Type letters and convert to morse");
                    String input = scan.nextLine();
                    result = convertToMorse(input);
                    System.out.println(result);

                } catch (Exception e) {
                    System.out.println(e.getMessage() + ", try again");
                }
                break;

            case 2:

                try {
                    System.out.println("Type morse-code and convert to letters");
                    String input = scan.nextLine();
                    result = convertToLetter(input);
                    System.out.println(result);

                } catch (Exception e) {
                    System.out.println(e.getMessage() + ", try again");
                }
                break;

            default:
                System.out.println("Wrong number");
        }

    }

}

