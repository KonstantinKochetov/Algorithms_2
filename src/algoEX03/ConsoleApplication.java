package algoEX03;

import algoEX03.data.Student;
import algoEX03.stack.Stack;
import algoEX03.stack.Stackable;
import algoEX03.utils.Utils;
import algoEX03.values.Strings;

import java.util.Scanner;

/**
 * Helper class for the main class
 */
public class ConsoleApplication {

    private Scanner mScanner;

    public ConsoleApplication() {
        mScanner = new Scanner(System.in);
    }

    public Stackable<Student> createStack() {
        // Choose
        mScanner = new Scanner(System.in);
        // get user input
        int choice = Utils.getStackChoiceFromUser();
        // decide what to do
        switch (choice) {
            case 1:
                System.out.println(Strings.STACK_CREATION);
                return new Stack<Student>();
            case 2:
                System.exit(0);
                break;
            default:
                return null;
        }

        return null;

    }

    /**
     * Displays the list of operation based on the chosen implementation of {@link Stackable}
     * @return              Choice of the user
     */
    public int createOperation() {
        // parse integer
        return Utils.parseOperationChoiceFromUser(Utils.getOperationChoiceFromUser());
    }

    /**
     * Sets parameters for the newly created element
     * @param student       Object to set parameters to
     * @return              Result of the operation
     */
    public boolean setParameterForTheElement(Student student) {
        // name
        mScanner = new Scanner(System.in);
        String name = student.getFirstName();
        while (name == null || name.trim().equals("")) {
            System.out.println("Please set the name\n");
            name = mScanner.nextLine();
            if (name == null || name.trim().equals("")) {
                return false;
            } else {
                student.setFirstName(name);
                System.out.println(student.toString());
                System.out.println();
            }
        }
        // last name
        String lastName = student.getLastName();
        while (lastName == null || lastName.trim().equals("")) {
            System.out.println("Please set the last name\n");
            lastName = mScanner.nextLine();
            if (lastName == null || lastName.trim().equals("")) {
                return false;
            } else {
                student.setLastName(lastName);
                System.out.println(student.toString());
                System.out.println();
            }
        }

        // student number
        int number = student.getNumber();
        while (number < 1) {
            number = Utils.getStudentNumberFromUser();
        }
        student.setNumber(number);
        System.out.println(student.toString());
        System.out.println();

        // major id
        int majorId = student.getMajorId();
        while (majorId < 1) {
            majorId = Utils.getMajorIdFromUser();
        }

        student.setMajorId(majorId);
        System.out.println(student.toString());
        System.out.println();

        // parameters are set -> return
        return true;

    }
}
