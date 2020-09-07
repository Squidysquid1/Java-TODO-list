package todoList;
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class App {
    //frame 
    static JFrame f; 
    //lists 
    static JList b; 



    public static void main(String[] args) throws Exception {
        UserTODOmanager mainManager = new UserTODOmanager();
        initializeGUI();
    }

    public static void initializeGUI() {
        f = new JFrame("frame"); 
        
        //create a panel 
        JPanel p =new JPanel(); 

        //String array to store weekdays 
        String week[]= { "Monday","Tuesday","Wednesday", "Thursday","Friday","Saturday","Sunday"}; 
        
        //create list 
        b = new JList<String>(week);
        
        //set a selected index 
        b.setSelectedIndex(2); 
        
        //add list to panel 
        p.add(b); 
        
        f.add(p); 
        
        //set the size of frame 
        f.setSize(400,400); 
        
        f.setVisible(true); 
    }
}
