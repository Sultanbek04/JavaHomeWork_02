package com.google.lesson_02;

import java.util.Random;

public class HomeWork02 {
    public static void main(String[] args) {
        PrintNumbers(4);

        AvailabilityOfPlaces(4, 4, 2);

    }

    public static void PrintNumbers(int n) {
        int[][] matrix = new int[n][n];
        int incr = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 1) {
                incr = (incr) + n;
            }
            if (i % 2 == 0 && i != 0) {
                incr = incr + n;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 1) {
                    matrix[i][j] = incr;
                    System.out.print(matrix[i][j] + " ");
                    --incr;

                }
                if (i % 2 == 0) {
                    ++incr;
                    matrix[i][j] = incr;
                    System.out.print(matrix[i][j] + " ");

                }


            }
            System.out.println();
        }
    }

    public static void AvailabilityOfPlaces(int m, int n, int k) {
        Random random = new Random();
        int[][] seats = new int[m][n];
        int counter = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = random.nextInt(2);
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < seats.length; i++) {
            counter = 0;
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    ++counter;
                }
                if (seats[i][j] != 0 || j == seats[i].length - 1) {
                    if (k <= counter) {
                        int temp = counter;
                        counter = j + 1;
                        System.out.printf("We have a place row is: %d ", i + 1);
                        System.out.println();

                        for (int l = 0; l < temp; l++) {
                            System.out.println("Column: " + counter);
                            --counter;
                        }

                    }
                    counter = 0;
                }

            }
        }
    }

}

