import java.time.LocalDate;
import java.util.Map;

public class Milestones {
//TODO start working on the calculation methods of hours spent by users for each task etc which will be used by the planner class

    String name;
    LocalDate startDate;
    LocalDate plannedEndDate;
    LocalDate actualEndDate;

    Map<Integer, Double> employeeHours; //ID as the key, amount of hour as the value. ex. ID 1, hours 8

    public Milestones(String name, LocalDate startDate, LocalDate plannedEndDate, LocalDate actualEndDate, Map <Integer, Double> employeeHours){
        this.name = name;
        this.startDate = startDate;
        this.plannedEndDate = plannedEndDate;
        this.actualEndDate = actualEndDate;
        this.employeeHours = employeeHours;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "StartDate: " + startDate + "\n" +
                "PlannedEndDate: " + plannedEndDate + "\n" +
                "ActualEndDate: " + actualEndDate + "\n" +
                "Employees contributions: " + employeeHours + "\n";
    }
}
