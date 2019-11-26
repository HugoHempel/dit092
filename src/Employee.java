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
        this.id = setId();
        //TODO Change the id_generator so it can be called inside the constructor.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = this.hours + hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId(){return id;}

    public int setId(){
        Planner planner = new Planner();
        return planner.genId();
    }
}
