package algoEX03.utils;

import algoEX03.values.Strings;

import java.util.Scanner;

/**
 * Utils class for static operations
 */
public class Utils {

    public static int getStackChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Strings.CHOOSE);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int parseOperationChoiceFromUser(int choice) {
        switch (choice) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return -1;
        }
    }

    public static int getOperationChoiceFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Strings.CHOOSE_OPERATION);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getStudentNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set the number");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }


    public static int getMajorIdFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please set the major id");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static int getIntegerFromUser(String toDisplay) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(toDisplay);
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
