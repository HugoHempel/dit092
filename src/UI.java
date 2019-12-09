import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {

    //TODO: Add the menu, options and related classes.

    Scanner scanner = new Scanner(System.in);
    // Planner planner = new Planner();

    /*private void printMainMenu(){
        System.out.println("Welcome to the Team Planner 1.0");
        System.out.println("--------------------------------------");
        System.out.println("Please chose a valid option below:");
        System.out.println("1. Add employee.");
        System.out.println("2. Change employee information. ");
        System.out.println("3. Use planner tools. ");
        System.out.println("4. Exit. ");
    }

    private void printEmployeeMenu(){
        System.out.println("Here you can do changes to the employees.");
        System.out.println(" -----------------------------------------");
        System.out.println("Please choose a valid option below:");
        System.out.println("1. Print all employees");
        System.out.println("2. Change employee salary.");
        System.out.println("3. Add employee hours. ");
        System.out.println("4. Return to main menu.");

    }

    private void printPlannerMenu(){

    }

    public void runMainMenu(){
        final int ADD_EMPLOYEE = 1;
        final int CHANGE_EMPLOYEE_INFORMATION = 2;
        final int USE_PLANNER_TOOLS = 3;
        final int EXIT = 4;
        int option = 0;
        do {
            printMainMenu();
            option = inputInt();
            switch (option) {

                case ADD_EMPLOYEE:
                    registerEmployee();
                    break;

                case CHANGE_EMPLOYEE_INFORMATION:
                    runEmployeeMenu();
                    break;

                case USE_PLANNER_TOOLS:
                    break;

                case EXIT:
                    System.out.println("Thank you for using the Planner Tool.");
                    scanner.close();
                    break;
            }
        }while (option != EXIT);
    }

    private void runEmployeeMenu(){
        final int PRINT_ALL_EMPLOYEES = 1;
        final int CHANGE_EMPLOYEE_SALARY= 2;
        final int ADD_EMPLOYEE_HOURS= 3;
        final int EXIT = 4;
        int option = 0;
        do {
            printEmployeeMenu();
            option = inputInt();
            switch (option) {

                case PRINT_ALL_EMPLOYEES:
                    for (Employee employee : employees){
                        System.out.println(employee);
                    }
                    break;

                case CHANGE_EMPLOYEE_SALARY:
                    int id = inputInt("Please enter ID of the employee");
                    //TODO Add a search function that depends on ID.
                    break;

                case ADD_EMPLOYEE_HOURS:
                    id = inputInt("Please enter ID of the employee: ");
                    //TODO Add a search function that depends on ID.
                    double newSalary = inputDouble("Please enter the new salary: ");


            }
        }while (option != EXIT);
    }

    private void registerEmployee(){
        String forename = inputString("Please enter forename: ");
        String surname = inputString("Please enter surname: ");
        int birthDay = inputInt("Please enter birthday (YYYYMMDD): ");
        double salary = inputDouble("Please enter salary: ");
        //planner.addEmployee(forename, surname, birthDay, salary);
        Employee employee = new Employee(forename, surname, birthDay, salary);
        employees.add(employee);

    }

    private int inputInt(String message) {
        System.out.print(message);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    private int inputInt() {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    private String inputString(String message){
        System.out.print(message);
        String result = scanner.nextLine();
        return result;
    }

    private double inputDouble(String message){
        System.out.print(message);
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }*/

    public static void main(String[] args) throws IOException, ParseException {

        JsonReader jsonreader = new JsonReader();
        Planner planner = jsonreader.loadPlanner();

        System.out.println("\n-- Stored planner information printed from the main --");
        System.out.println(planner);
        System.out.println("\n -- Stored employee information printed from the main --\n");
        planner.printEmployees();
        System.out.println("\n-- Stored milestone information printed from the main --\n");
        planner.printMilestones();
    }

}
