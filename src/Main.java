import algoEX03.ConsoleApplication;
import algoEX03.data.Student;
import algoEX03.stack.Stackable;
import algoEX03.utils.Utils;
import algoEX03.values.Strings;

import java.util.Scanner;

public class Main {

    private static ConsoleApplication consoleApplication;
    private static Scanner scanner;
    private static Stackable<Student> stack;
    private static boolean operationMenu;

    public static void main(String[] args) {
        // Greetings
        System.out.println(Strings.GREETING);
        // scanner
        scanner = new Scanner(System.in);
        // start the program
        boolean mainMenu = true;
        consoleApplication = new ConsoleApplication();
        // Main menu. Get the stack
        while (mainMenu) {
            boolean isCreated = createStack();
            while (!isCreated) {
                isCreated = createStack();
            }
            // Operation menu. Choose operation
            operationMenu = true;
            while (operationMenu) {
                int choice = consoleApplication.createOperation();
                while (choice == -1) {
                    choice = consoleApplication.createOperation();
                }
                // pass an operation choice to run
                stackOperationChoice(choice);
            }
        }
    }

    /**
     * Creates stack
     * @return  Flag indicating success
     */
    private static boolean createStack() {
        stack = consoleApplication.createStack();
        if (stack == null) {
            System.out.println(Strings.ERROR_REPEAT);
            String choice = scanner.nextLine();
            while (!choice.equals("y")) {
                System.out.println(Strings.ERROR_REPEAT);
                choice = scanner.nextLine();
                if (choice.equals("n")) {
                    System.exit(0);
                }
            }
            return false;
        } else {
            return true;
        }
    }

    /**
     * Handles choices of the user
     * @param choice    Choice entered by the user
     */
    private static void stackOperationChoice(int choice) {
        switch (choice) {
            case 1:
                addElement();
                break;
            case 2:
                pushElement();
                break;
            case 3:
                stack.pop();
                stack.printAll();
                break;
            case 4:
                stack.printAll();
                break;
            case 5:
                stack.printSize();
                break;
            case 6:
                deleteElement();
                break;
            case 7:
                System.exit(0);
                break;
        }
    }

    /**
     * Prompts parameters for the element
     * @param student   Element
     */
    private static void setParameters(Student student) {
        boolean isGivenParameters = false;
        while (!isGivenParameters) {
            isGivenParameters = consoleApplication.setParameterForTheElement(student);
        }
    }

    /**
     * Adds element to the stack
     */
    private static void addElement() {
        System.out.println("Creating an element\n");
        Student student2 = new Student();
        setParameters(student2);
        System.out.println("Adding an element as the first element\n");
        stack.add(student2);
        stack.printAll();
        System.out.println();
    }

    /**
     * Pushes element to the stack
     */
    private static void pushElement() {
        System.out.println("Creating an element\n");
        Student student2 = new Student();
        setParameters(student2);
        System.out.println("Adding an element as the first element\n");
        stack.push(student2);
        stack.printAll();
        System.out.println();
    }

    /**
     * Deletes element to the stack
     */
    private static void deleteElement() {
        int choice = -1;
        while (choice < 0 && choice < stack.size()) {
            choice = Utils.getIntegerFromUser("Please set the number of the stack you want to delete");
            if (choice >= stack.size()) {
                System.out.println("No elements to delete");
                choice = -1;
            }
            if (stack.size() == 0) {
                break;
            }
        }
        try {
            stack.deleteByIndex(choice);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
