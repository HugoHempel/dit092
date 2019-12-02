import java.time.LocalDate;

public class Milestones {

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
