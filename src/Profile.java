//How do you want to organize the information? i have to first find out how to:
    //Select WHAT i want to log (dont provide anything just ask the user what they want to log (task name))

import java.awt.image.BufferedImage;
import java.util.Scanner;
import java.util.*;

public class Profile {
    private String first;
    private String last;
    private BufferedImage pfp;
    private String desc;
    private String profileCreationTime;
    private Map<String,Task> taskList = new HashMap<>();

    public Profile(String first,String last){
        this.first = first;
        profileCreationTime = Main.timeATM();
    }


    Scanner scanner = new Scanner(System.in);

    public void newTask(String name){taskList.put(name, new Task(name));}
    public void logTask(String task, Double data){
        if(taskList.get(task)==null){System.out.println("Task "+ task +" not found");} //If task doesnt exist in taskList
        else{taskList.get(task).logData(data);}
    }


    //Note to future self, should the same function be used to handle setting AND CHANGING profile attributes? or should this be handled through two separate functions
    public void addPfp(BufferedImage pfp){this.pfp=pfp;}
    public void addDesc(String desc){this.desc=desc;}

    public String getFirst(){return first;}
    public String getLast(){return last;}
    public void changeFirst(String first){this.first=first;}
    public void changeLast(String last){this.last=last;}
    public Map<String, Task> getTasks(){return taskList;}
}
