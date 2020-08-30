package todoList;
import java.util.ArrayList;

public class UserTODOmanager {
    ArrayList taskStorageArray = new ArrayList();
    public void addNewTask(String taskName){
        taskStorageArray.add(new Task(taskName));
    }
    public void deleteTask(int index/*have either int for index or a task name for a hashmap*/){
        int arrSize = taskStorageArray.size();
        if(index<0 || index > arrSize)
            System.out.println("Array index out of bounds for delete task");
        else
            taskStorageArray.remove(index);
    }
    public void editTask(){
        
    }
}