//How do you want to organize the information? i have to first find out how to:
    //Select WHAT i want to log (dont provide anything just ask the user what they want to log (task name))

import java.util.Scanner;
import java.util.*;

public class Profile {
    private String name;
    private String profileCreationTime;
    private Map<String,Task> taskList = new HashMap<>();

    public Profile(String name){
        this.name = name;
        profileCreationTime = Main.timeATM();
    }


    Scanner scanner = new Scanner(System.in);

    public void newTask(String name){taskList.put(name, new Task(name));}
    public void logTask(String task, Double data){
        if(taskList.get(task)==null){System.out.println("Task "+ task +" not found");} //If task doesnt exist in taskList
        else{taskList.get(task).logData(data);}
    }




    public String getName(){return name;}
    public Map<String, Task> getTasks(){return taskList;}
}
