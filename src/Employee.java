import id_generator_5Digits.GeneratorMain;

public class Employee {

    //TODO: Discuss the implementations here on the next meeting.

    private String forename;
    private String surname;
    private int id;
    private int birthDay;
    private double salary;
    GeneratorMain idGen = new GeneratorMain();

    //This is for the new coming employees.
    public Employee (String forename, String surname, int birthDay, double salary){
        this.forename = forename;
        this.surname = surname;
        this.birthDay = birthDay;
        this.salary = salary;
        this.id = setId();
    }

    //This is for the already existing employees
    public Employee (String forename, String surname, int birthDay, double salary, int id){
        this.forename = forename;
        this.surname = surname;
        this.birthDay = birthDay;
        this.salary = salary;
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setName(String name) {
        this.forename = forename;
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
      return "\nName: " + forename + " " + surname + "\n" +
              "ID: " + id + "\n" +
              "Salary: " + salary + "/hour \n\n";
    }
}
