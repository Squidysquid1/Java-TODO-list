package todoList;
import java.time.LocalDate;
import java.util.HashMap;
public class Task {
    String taskName = "";
    LocalDate date;
    int priority = 4;//default priority | lowest prio 1 is most important
    HashMap labels;
    Task(String name){
        this.taskName = name;
        this.labels = new HashMap();
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
    public void deleteLabel(String labelName){
        if(this.labels.containsKey(labelName))
            this.labels.remove(labelName);
        else
            System.out.println("The label is not connected to this task");


    }

    ///////////////subtask
    public void addSubtask(){
        
    }
    public void editSubtask(){
        
    }
    public void removeSubtask(){
        
    }
    public void markSubtaskAsComplete(){
        
    }

}