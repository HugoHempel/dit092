import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.ArrayList;

public class Planner {
    //TODO complete the calculation methods

     double budget;                // the budget should be calculated in accordance to our hourly rate and working days [Linus]
     LocalDate start;
     LocalDate end;

     Milestones milestones;
     ArrayList<Employee> employees = new ArrayList<>();

     public Planner(LocalDate start, LocalDate end){
          this.start = start;
          this.end = end;
     }

     /*
     LocalDate localDate = LocalDate.now();  // creates a date based on todays date [Hjalmar]
     float totalDays = ChronoUnit.DAYS.between(start, end); // compares 2 dates and returns the diff in numbers [Hjalmar]
     float nowDays = ChronoUnit.DAYS.between(start, localDate);
     float percentCompletePlanned = nowDays / totalDays;
     double percentCompleteActual = 0.2; // here we have to sum the time for all tasks, sum all completed tasks and then divide them(?) [Hjalmar]
     */

     public double calcPV(){
          return percentCompletePlanned * budget;
     }

     public double calcEV(){
          return percentCompleteActual * budget;
     }

     public double calcSV(){
          return calcEV() - calcPV();
     }

     public double calcCV(){
          double actualCost = 500;  // here we have to sum total cost we spent so far (all workers hours times salary)
          return calcEV() - actualCost;
     }
}
