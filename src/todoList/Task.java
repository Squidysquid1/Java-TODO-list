package todoList;
public class Task{
    String taskName = "";
    //date
    int priority = 4;//default priority | lowest prio 1 is most important

    Task(String name){
        this.taskName = name;

    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

}