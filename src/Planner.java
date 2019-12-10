import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Planner {

    //TODO: complete the calculation methods

     double budget;                // the budget should be calculated in accordance to our hourly rate and working days [Linus]
     private String projectName;
     private LocalDate startDate;
     private LocalDate endDate;

     List<Employee> employees = new ArrayList<>();
     List<Milestones> milestones = new ArrayList<>();

     public Planner(String projectName, LocalDate startDate, LocalDate endDate){
          this.projectName = projectName;
          this.startDate = startDate;
          this.endDate = endDate;
     }

     public void storeEmployees(List<Employee> employeeList){
          this.employees = employeeList;
     }

     public void printEmployees(){
          System.out.println(employees);
     }

     public void storeMilestones(List<Milestones> MilestoneList){
          this.milestones = MilestoneList;
     }

     public void printMilestones(){
          System.out.println(milestones);
     }

     @Override
     public String toString() {
          return "\nName: " + projectName + "\n" +
                  "StartDate: " + startDate + "\n" +
                  "EndDate: " + endDate + "\n";
     }
}
