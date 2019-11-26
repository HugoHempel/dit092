import java.util.Scanner;
//TODO Add the menu, options and related classes.
public class UI {

    Scanner scanner = new Scanner(System.in);

    private void printMainMenu(){
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
        System.out.println("1. Change employee name.");
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
                    break;

                case CHANGE_EMPLOYEE_INFORMATION:
                    runEmployeeMenu();
                    break;
                case EXIT:
                    System.out.println("Thank you for using the Planner Tool.");
                    scanner.close();
            }
        }while (option != EXIT);
    }

    private void runEmployeeMenu(){
        final int CHANGE_EMPLOYEE_NAME = 1;
        final int CHANGE_EMPLOYEE_SALARY= 2;
        final int ADD_EMPLOYEE_HOURS= 3;
        final int EXIT = 4;
        int option = 0;
        do {
            printEmployeeMenu();
            option = inputInt();
            switch (option) {

            }
        }while (option != EXIT);
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

    public static void main(String[] args) {
        UI ui = new UI();
        ui.runMainMenu();
    }

}
