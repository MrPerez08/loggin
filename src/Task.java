import java.util.ArrayList;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Task {
    private String taskName;
    private String taskCreationTime;
    private ArrayList<Double> Data=new ArrayList<>();
    private ArrayList<String> Time=new ArrayList<>();
    private Map<Integer,String> Desc=new HashMap<>();

    //Description should be a map with the keys being the indexes for when/duration the task was developed/done in the other ArrayLists.

    public Task(String taskName){
        this.taskName = taskName;
        taskCreationTime = Main.timeATM();
    }

    public void logData(Double data){
        Data.add(data);
        Time.add(Main.timeATM());
    }

    public void addDesc(String desc){
        Desc.put(Time.size(),taskName);
    }

    public String getName(){
        return this.taskName;
    }

    public String getCreationTime(){
        return this.taskCreationTime;
    }

    public ArrayList<Double> getData(){
        return this.Data;
    }



}
