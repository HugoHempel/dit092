public class Employee {

    private String name;
    private int id;
    private int birthNumber;
    private double hours;
    private double salary;


    public Employee (String name, int birthNumber, double hours, double salary){
        this.name = name;
        this.birthNumber = birthNumber;
        this.hours = hours;
        this.salary = salary;
        //TODO Change the id_generator so it can be called inside the constructor.
    }
}
