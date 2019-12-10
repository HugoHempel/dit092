import java.time.LocalDate;
import java.util.Map;

public class Milestones {

    //TODO: start working on the calculation methods of hours spent by users for each task etc which will be used by the planner class
    //TODO: add the amount of hours in the input.json file, respectively to your ID's. Everyone will have to fill in their part.

    private String name;
    private LocalDate startDate;
    private LocalDate plannedEndDate;
    private LocalDate actualEndDate;

    Map<Integer, Double> employeeHours; //ID as the key, amount of hour as the value. ex. ID 1, hours 8

    public Milestones(String name, LocalDate startDate, LocalDate plannedEndDate, LocalDate actualEndDate, Map <Integer, Double> employeeHours){
        this.name = name;
        this.startDate = startDate;
        this.plannedEndDate = plannedEndDate;
        this.actualEndDate = actualEndDate;
        this.employeeHours = employeeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(LocalDate plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
    }

    public LocalDate getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(LocalDate actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public Map<Integer, Double> getEmployeeHours() {
        return employeeHours;
    }

    public void setEmployeeHours(Map<Integer, Double> employeeHours) {
        this.employeeHours = employeeHours;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "StartDate: " + startDate + "\n" +
                "PlannedEndDate: " + plannedEndDate + "\n" +
                "ActualEndDate: " + actualEndDate + "\n" +
                "Employees contributions: " + employeeHours + "\n\n";
    }
}
