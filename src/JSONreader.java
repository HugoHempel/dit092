import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONreader {

    //TODO complete the JSONreader file where we will read the input file and create all objects to preload the program with

    public static void main (String[]args){

        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("input.json")) {

            Object obj = parser.parse(reader);

            JSONObject jsonObject = (JSONObject) obj;

            String projectName = (String) jsonObject.get("projectName");            //creates a planner object
            String projectStartDate = (String) jsonObject.get("startDate");
            LocalDate startDate = LocalDate.parse(projectStartDate);
            String projectEndDate = (String) jsonObject.get("endDate");
            LocalDate endDate = LocalDate.parse(projectEndDate);
            Planner planner = new Planner(projectName, startDate, endDate);

            JSONArray employeeList = (JSONArray) jsonObject.get("employeeList");    //creates all employee objects
            for(Object value : employeeList){
                String employeeName = (String) jsonObject.get("projectName");
                int employeeID = (int) jsonObject.get("startDate");
                double salary = (double) jsonObject.get("endDate");
            }

            //System.out.println(employeeList);

            System.out.println(planner);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
