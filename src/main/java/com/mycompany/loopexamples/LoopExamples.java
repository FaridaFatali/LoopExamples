package com.mycompany.loopexamples;

/**
 *
 * @author Farida Fatali
 */
// simple examples for "for", "break", "continue", "labeled break", "labeled continue"
public class LoopExamples {

    public static void main(String[] args) {

// break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        System.out.println();

// continue
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println();

// labeled break using int
        outerLoop:
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    break outerLoop;
                }
                System.out.println(i + "-" + j);
            }
        }

        System.out.println();

// labeled break using char
        outerLoop:
        for (int i = 0; i <= 5; i++) {
            for (char j = 'a'; j <= 'f'; j++) {
                if (i == 3 && j == 'd') {
                    break outerLoop;
                }
                System.out.println(i + "-" + j);
            }
        }

        System.out.println();

// labeled continue
        outerLoop:
        for (int i = 1; i <= 4; i++) {
            for (char j = 'a'; j <= 'e'; j++) {
                if (i == 2 && j == 'd') {
                    continue outerLoop;
                }
                System.out.println(i + "-" + j);
            }
        }

        System.out.println();

// labeled continue using array
        int[][] arrayOfInts = {{32, 87, 3, 589},
        {12, 1076, 2000, 12},
        {622, 127, 12, 12}};
        int searchfor = 12;

        int i = 0;
        int j = 0;
        boolean foundIt = false;

        here:
        for (; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    System.out.println("Found " + searchfor + " at " + i + ", " + j);
                    continue;
                }
            }
        }

    }

}
