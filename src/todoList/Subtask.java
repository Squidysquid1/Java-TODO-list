package todoList;

import java.util.ArrayList;
import java.util.List;

public class Subtask {
    String taskName = "";
    String taskDesc = "";
    boolean completed = false;
    
    public Subtask(String name){
        this.taskName = name;
    }
    public Subtask(String name, String desc){
        this.taskName = name;
        this.taskDesc = desc;
    }
    
    public void setName(String name){

    }
    public void setDesc(String desc){
        this.taskDesc = desc;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ArrayList<String> getSubtaskInfo(){
        return new ArrayList<String>(List.of(taskName,taskDesc));
    }
    public String getTaskName() {
        return this.taskName;
    }
    public String getTaskDesc(){
        return this.taskDesc;
    }
    
}