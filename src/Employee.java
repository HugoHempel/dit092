import id_generator_5Digits.GeneratorMain;

public class Employee {

    private String forename;
    private String surname;
    private int id;
    private int birthDay;
    private double hours;
    private double salary;
    GeneratorMain idGen = new GeneratorMain();

    public Employee (String forename, String surname, int birthDay, double salary){
        this.forename = forename;
        this.surname = surname;
        this.birthDay = birthDay;
        this.hours = 0;
        this.salary = salary;
        this.id = setId();
    }

    public String getForename() {
        return forename;
    }

    public void setName(String name) {
        this.forename = forename;
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
        id = idGen.generateID(this.forename, this.surname, this.birthDay);

        return id;
    }

    @Override
    public String toString() {
      return "Name: " + forename + " " + surname + "\n" +
              "ID: " + id + "\n" +
              "Salary: " + salary + "/hour \n" +
              "Hours worked: " + hours;

    }
}
