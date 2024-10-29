package com.enigma;

import java.util.Scanner;

public class MinimumBus {

    public static class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    public static void minimumBusNeed() throws CustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program to determine how many minimum buses are required");
        System.out.println("Input the number of families : ");
        int numFams = scanner.nextInt();
        System.out.println("Input the number of members in the family (separated by a space) :");
        scanner.nextLine();
        String member = scanner.nextLine();

        String[] stringNumbers = member.split(" ");

        if (stringNumbers.length != numFams) {
            System.out.println("Input must be equal with count of family");
            throw new CustomException("Input must be equal with count of family");
        }

        int[] numMembers = new int[numFams];
        double sum = 0;
        int minimumBus = 0;
        for (int i = 0; i < numFams; i++) {
            numMembers[i] = Integer.parseInt(stringNumbers[i]);
            sum += numMembers[i];
        }

        if (((int) sum == numFams) && sum > 2.0) {
            minimumBus = (int) Math.ceil(sum / 4.0) + 1;
        } else {
            minimumBus = (int) Math.ceil(sum / 4.0);
        }

        System.out.println("Minimum bus required is : " + minimumBus);
    }
}
