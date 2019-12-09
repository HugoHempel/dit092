import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;

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
            System.out.println(planner);

            parseEmployeeObject(jsonObject);
            parseMilestoneObject(jsonObject);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }


    private void parseEmployeeObject(JSONObject jsonObject) {

        JSONArray objArray = (JSONArray) jsonObject.get("employeeList");

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
    private void parseMilestoneObject(JSONObject jsonObject) {

        JSONArray objArray = (JSONArray) jsonObject.get("milestoneList");

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