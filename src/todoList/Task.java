package todoList;
import java.time.LocalDate;

public class Task {
    String taskName = "";
    LocalDate date;
    int priority = 4;//default priority | lowest prio 1 is most important

    Task(String name){
        this.taskName = name;

    }

    public void setPriority(int priority) {
        if(priority < 1 || priority > 4)
            System.out.println("Cant set a priority not in the range 1-4");
        else
            this.priority = priority;
    }
    
    public void setDate(String date){//year-month-date
        this.date= LocalDate.parse(date) ;

    }

    public void addLabel(String labelName){

    }
    public void deleteLabel(String labelName){

    }


}