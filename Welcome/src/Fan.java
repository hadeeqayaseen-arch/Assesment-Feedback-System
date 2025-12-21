/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadee
 */
public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private  String colour;
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public Fan(){
        speed = 5;
        on = false;
        radius = 2;
    }
    public Fan(int speed,boolean on, double radius,String colour ){
        this.speed = speed;
        this.on = on;
        this.radius= radius;
        this.colour = colour;
    }
   
    public int getSpeed(){
        return speed;}
    public boolean getOn(){
        return on;
    }
    public double getRadius(){
        return radius;
    }
    public  String getColour(){
        return colour;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public String toString() {
    return "Speed: " + speed + ", On: " + on + ", Radius: " + radius + ", Colour: " + colour;
   }
    public int slowSpeed(){
        return 1;
    }
    public int mediumSpeed(){
        return 2;
    }
    public int fastSpeed(){
        return 3;
    }    
}
