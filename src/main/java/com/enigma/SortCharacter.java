package com.enigma;

import java.util.Scanner;

public class SortCharacter {
    private static final char[] vowel = {'a', 'i', 'u', 'e', 'o'};

    public static boolean isVowel(char c) {
        for (char c1 : vowel) {
            if (c1 == c) {
                return true;
            }
        }
        return false;
    }

    public static String groupChar(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (str.contains(String.valueOf(chars[i])) && !sb.toString().contains(String.valueOf(chars[i]))) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] == chars[i]) {
                        sb.append(chars[j]);
                    }
                }
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    public static void sortCharacterAlgorithm() {
        System.out.println("Program for sorting character in string into vowel and consonant");
        System.out.println("Input one line of words (S) : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase().replace(" ", "");
        char[] chars = input.toCharArray();

        String vowel = "";
        String consonant = "";

        for (char c : chars) {
            if (isVowel(c)) {
                vowel += c;
            } else {
                consonant += c;
            }
        }

        System.out.println("Vowel Characters: ");
        System.out.println(groupChar(vowel));
        System.out.println("Consonant Characters: ");
        System.out.println(groupChar(consonant));
    }
}
