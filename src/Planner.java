import java.time.temporal.ChronoUnit;
import java.time.LocalDate;

public class Planner {

    public static void main(String[]args) {

        double budget = 50000;                                              //need budget, name, startdate and completedate to have a planner
        String plannerName = "Frosk";
        LocalDate startDate = LocalDate.of(2019, 11, 8 );
        LocalDate completeDate = LocalDate.of(2020, 1, 10 );
        LocalDate localDate = LocalDate.now();

        float totalDays = ChronoUnit.DAYS.between(startDate, completeDate); //compares 2 dates and returns the diff in numbers
        float nowDays = ChronoUnit.DAYS.between(startDate, localDate);
        float deadLine = totalDays - nowDays;

        float percentCompletePlanned = nowDays / totalDays;
        double percentCompleteActual = 0.2;                                 //here we have to sum the time for all tasks, sum all completed tasks and then divide them(?)

        double plannedValue = percentCompletePlanned * budget;
        double earnedValue = percentCompleteActual * budget;
        double scheduleVariance = earnedValue - plannedValue;
        double actualCost = 12000;                                          //here we have to sum total cost we spent so far (all workers hours times salary)
        double costVariance = earnedValue - actualCost;

        System.out.println("Total days for project: " + totalDays);
        System.out.println("Days since start: " + nowDays);
        System.out.println("Days until deadline: " + deadLine);
        System.out.println("=============\nPlanned value: " + plannedValue);
        System.out.println("Earned value: " + earnedValue);
        System.out.println("Schedule variance: " + scheduleVariance);       //if SV is negative, the task is behind schedule.
        System.out.println("Actual cost: " + actualCost);
        System.out.println("Cost variance: " + costVariance);               //if CV is negative, the task is over budget
    }
}
