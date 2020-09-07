package todoList;

import java.time.LocalDate;
import java.util.HashMap;

/*
TODO:
 - Possibly add a task object if I dont like how my current hashmap solution is working out but it seems to be working fine
*/
public class Task {
    String taskName = "";
    LocalDate date;
    int priority = 4;//default priority | lowest prio 1 is most important
    HashMap<String,String> labels;//labelName , labelName 
    HashMap<String,Subtask> subtaskMap;//

    Task(String name){
        this.taskName = name;
        this.labels = new HashMap<String,String>();
        subtaskMap = new HashMap<String,Subtask>();
    }
    public void markTaskAsComplete(){

    }
///////////////prioity
    public void setPriority(int priority) {
        if(priority < 1 || priority > 4)
            System.out.println("Cant set a priority not in the range 1-4");
        else
            this.priority = priority;
    }
    ///////////////date
    public void setDate(String date){//year-month-date
        this.date= LocalDate.parse(date) ;

    }
//////////////////label
    public void addLabel(String labelName){
        this.labels.put(labelName, labelName);
    }   
    public void removeLabel(String labelName){
        if(this.labels.containsKey(labelName))
            this.labels.remove(labelName);
        else
            System.out.println("The label is not connected to this task");


    }

    ///////////////subtask
    public void addSubtask(String name){
        this.subtaskMap.put(name,new Subtask(name));
    }
    public void addSubtask(String name,String desc){
        this.subtaskMap.put(name,new Subtask(name,desc));
    }

    public Subtask getSubtask(String subtaskName){
        return this.subtaskMap.get(subtaskName);
    }
    public void editSubtask(String subtaskName, Subtask s){
        Subtask subTask = this.subtaskMap.get(subtaskName);
    }
    public void removeSubtask(String subtaskName){
        this.subtaskMap.remove(subtaskName);
    }
    
    public void markSubtaskAsComplete(String subtaskName){
        Subtask subtask = this.subtaskMap.get(subtaskName);
        subtask.setCompleted(true);
    }
    public void markSubtaskAsNotComplete(String subtaskName){
        Subtask subtask = this.subtaskMap.get(subtaskName);
        subtask.setCompleted(false);
    }

}