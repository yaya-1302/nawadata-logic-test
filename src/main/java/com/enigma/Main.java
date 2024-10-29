package com.enigma;

public class Main {
    public static void main(String[] args) throws MinimumBus.CustomException {
        SortCharacter.sortCharacterAlgorithm();
        System.out.println("-".repeat(30));
        MinimumBus.minimumBusNeed();
    }
}