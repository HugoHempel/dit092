import java.time.LocalDate;

public class Milestones {
    //TODO figure out how to divide hours for each employee so we can see who spent time on what

    String name;
    LocalDate start;
    LocalDate plannedEnd;
    LocalDate actualEnd;
    float hours;

    public Milestones(String name, LocalDate start, LocalDate plannedEnd, LocalDate actualEnd, float hours){
        this.name = name;
        this.start = start;
        this.plannedEnd = plannedEnd;
        this.actualEnd = actualEnd;
    }
}
