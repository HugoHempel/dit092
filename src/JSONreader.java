import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONreader {

    //TODO complete the JSONreader file where we will read the input file and create all objects to preload the program with

    //Loads in input file and creates a planner object
    public void loadPlanner() {

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("input.json")) {

            Object obj = parser.parse(reader);                   //Parse the content in input.json


            JSONObject jsonObject = (JSONObject) obj;            //Convert above information into a json object

            //Create and print object for planner
            String projectName = (String) jsonObject.get("projectName");
            String projectStartDate = (String) jsonObject.get("startDate");
            LocalDate startDate = LocalDate.parse(projectStartDate);
            String projectEndDate = (String) jsonObject.get("endDate");
            LocalDate endDate = LocalDate.parse(projectEndDate);
            Planner planner = new Planner(projectName, startDate, endDate);
            System.out.println(planner);

            parseEmployeeObject(jsonObject);
            parseMilestoneObject(jsonObject);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    //Creates employee object(s) and puts into array.
    private void parseEmployeeObject(JSONObject jsonObject) {

        JSONArray objArray = (JSONArray) jsonObject.get("employeeList"); //Create the json array for employeeList in input.json

        //Create and print object for employee
        for (int i = 0; i < objArray.size(); i++) {
            JSONObject arrayIn = (JSONObject) objArray.get(i);
            String foreName = (String) arrayIn.get("employeeForename");
            String surName = (String) arrayIn.get("employeeSurname");
            String birth = (String) arrayIn.get("employeeBirth");
            int birthDay = Integer.parseInt(birth);
            String salary = (String) arrayIn.get("salary");
            double employeeSalary = Double.parseDouble(salary);

            Employee employees = new Employee(foreName, surName, birthDay, employeeSalary);
            System.out.println(employees);
        }
    }
    //Creares milestone object(sw) and puts into array.
    private void parseMilestoneObject(JSONObject jsonObject) {

        JSONArray objArray = (JSONArray) jsonObject.get("milestoneList");  //Create the json array for milestoneList in input.json

        //Create and print object for employee
        //Also works for the maps key and value relationship
        for (int i = 0; i < objArray.size(); i++) {
            JSONObject arrayIn = (JSONObject) objArray.get(i);
            String taskName = (String) arrayIn.get("taskName");
            String taskStartDate = (String) arrayIn.get("startDate");
            LocalDate startDate = LocalDate.parse(taskStartDate);
            String plannedEnd = (String) arrayIn.get("plannedEndDate");
            LocalDate plannedEndDate = LocalDate.parse(plannedEnd);
            String actualEnd = (String) arrayIn.get("actualEndDate");
            LocalDate actualEndDate = LocalDate.parse(actualEnd);
            JSONObject taskMemberMap = (JSONObject) arrayIn.get("hoursPerEmployee");

            Milestones milestone = new Milestones(taskName,startDate, plannedEndDate, actualEndDate, taskMemberMap);
            System.out.println(milestone);
        }
    }
}