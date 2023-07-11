package com.mycompany.loopexamples;

/**
 *
 * @author Farida Fatali
 */

// switch-case example
public class SwitchCaseExamples {

    public static void main(String[] args) {

// old version
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println("Today is " + dayName);

        System.out.println();

// switch case with -> for String
        int dayOfWeek1 = 3;
        String dayName1 = switch (dayOfWeek1) {
            case 1 ->
                "Monday";
            case 2 ->
                "Tuesday";
            case 3 ->
                "Wednesday";
            case 4 ->
                "Thursday";
            case 5 ->
                "Friday";
            case 6 ->
                "Saturday";
            case 7 ->
                "Sunday";
            default ->
                "Invalid day";
        };

        System.out.println("Today is " + dayName1);

        System.out.println();

// switch case with -> for integer
        int number = 5;
        int square = switch (number) {
            case 1 ->
                1;
            case 2 ->
                2;
            case 3 ->
                9;
            case 4 ->
                16;
            case 5 ->
                25;
            case 6 ->
                36;
            case 7 ->
                49;
            case 8 ->
                64;
            case 9 ->
                81;
            case 10 ->
                100;
            default ->
                0;
        };
        System.out.println(square);

        System.out.println();

// switch case with "yield"
        int day = 6;
        System.out.println(switch (day) {
            case 1, 5, 7:
                yield 6;
            case 2:
                yield 7;
            case 4, 6:
                yield 8;
            case 3:
                yield 9;
            default:
                yield -1;
        });

        System.out.println();

    }

}
