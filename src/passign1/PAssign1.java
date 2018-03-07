/* Shaun Dobbs
 * CSCI 1302
 * Assignment 1
 * January 27, 2016
 * Purpose : Create a fan class with varous characteristics and 
 * display two outputs with random fan characteristics.
 */

public class PAssign1 {

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println(fan2.toString());
    }
}

class Fan {

    public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private boolean setOn;
    private int speed;
    private String color;
    private double radius;

    Fan() {
        setOn = false;
        radius = 5.0;
        color = "blue";
        speed = SLOW;
    }

    Fan(int speed, double radius, String color, boolean setOn) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.setOn = setOn;
    }
    
    void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    void setOn(boolean setPower) {
        setOn = setPower;
    }
    public boolean getOn(){
        return setOn;
    }

    public String toString() {
        String output = "";

        if (setOn == true) {
            output = "A " + getRadius() + " inch " + getColor() + " fan at a speed of " + getSpeed();
        } else {
            output = "A " + getRadius() + " inch " + getColor() + " fan; fan is off";
        }
        return output;
    }
}
