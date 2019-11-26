import java.util.Scanner;
//TODO Add the menu, options and related classes.
public class UI {

    public static void printMenu(){
        System.out.println("Welcome to the Team Planner 1.0");
        System.out.println("--------------------------------------");
        System.out.println("1. Add employee.");
        System.out.println("2. Change employee information. ");
        System.out.println("3. Use planner tools. ");
        System.out.println("4. Exit. ");
    }

    public static void menuOptions(){
        int option = inputInt("Please chose a valid option");

        switch(option){

        }
    }

    public static int inputInt(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return result;
    }




}
