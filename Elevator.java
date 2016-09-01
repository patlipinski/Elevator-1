

public class Elevator
{
    // instance variables - replace the example below with your own
    private int current_floor;
    private int top_floor;
    private int lowest_floor;

    public Elevator()
    {
        // initialise instance variables
        current_floor = 0;
        top_floor = 11;
    }
    
    public void ascend() {
       //tell the lift to go up
       //add 1 on to the current_floor
       //if current floor less than top_floor
       if(current_floor < top_floor) {
        current_floor = current_floor +1;
        }
        else {
            System.out.println("Sorry your at the top!");
        }
       //else display error message
     }
     
    public void descend() {
       //tell the lift to go up
       //add 1 on to the current_floor
       //if current floor less than top_floor
       if(current_floor > lowest_floor) {
        current_floor = current_floor -1;
        }
        else {
            System.out.println("Sorry your at the bottom!");
        }
       //else display error message
     }
}
