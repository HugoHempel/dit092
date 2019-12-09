import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONreader {

    //TODO complete the JSONreader file where we will read the input file and create all objects to preload the program with

    public void loadPlanner() {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("input.json")) {

            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;
            String projectName = (String) jsonObject.get("projectName");
            String projectStartDate = (String) jsonObject.get("startDate");
            LocalDate startDate = LocalDate.parse(projectStartDate);
            String projectEndDate = (String) jsonObject.get("endDate");
            LocalDate endDate = LocalDate.parse(projectEndDate);
            Planner planner = new Planner(projectName, startDate, endDate);
            System.out.println(obj);

            //Iterates through employeeList array inside json.input and prints information.
            JSONArray objArray = (JSONArray) jsonObject.get("employeeList");
            for( int i = 0; i < objArray.size(); i++){
                JSONObject arrayIn = (JSONObject) objArray.get(i);
                String employeeForename = (String) arrayIn.get("employeeForename");
                String employeeSurname = (String) arrayIn.get("employeeSurname");
                String employeeBirth = (String) arrayIn.get("employeeBirth");
                String employeeSalary = (String) arrayIn.get("salary");

                System.out.println("Employee forename is: " + employeeForename );
                System.out.println("Employee surname is: " + employeeSurname);
                System.out.println("Employee Birthdate is: " + employeeBirth);
                System.out.println("Employee salary is: " + employeeSalary);
                System.out.println("------------------------");
            }




            //jsonArray.forEach(employee -> parseEmployeeObject((JSONObject) employee));
            //jsonArray.forEach(milestone -> parseMilestoneObject((JSONObject) milestone));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    /*private void parseEmployeeObject(JSONObject employee) {



         JSONObject employeeObject = (JSONObject) employee.get("employee");
        String foreName = (String) employeeObject.get("employeeForename");
        String surName = (String) employeeObject.get("employeeSurname");
        int birthday = (int) employeeObject.get("employeeBirth");
        double salary = (double) employeeObject.get("salary");

        Employee employees = new Employee(foreName, surName, birthday, salary);
        System.out.println(employees);

    }*/

    /*private void parseMilestoneObject(JSONObject milestone) {

        JSONObject milestoneObject = (JSONObject) milestone.get("milestone");
        String taskName = (String) milestoneObject.get("taskName");
        LocalDate startDate = (LocalDate) milestoneObject.get("startDate");
        LocalDate plannedEndDate = (LocalDate) milestoneObject.get("plannedEndDate");
        LocalDate actualEndDate = (LocalDate) milestoneObject.get("actualEndDate");

        Milestones milestone = new Milestones(taskName, startDate, plannedEndDate, actualEndDate);
    }*/
}
