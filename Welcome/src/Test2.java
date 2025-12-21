/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hadee
 */
public class Test2 {
    public static void main(String[] args) {
        Fan fn = new Fan();
        
        fn.setSpeed(3);
        fn.setOn(true);
        fn.setRadius(10);
        fn.setColour("yellow");
        
        System.out.println("Fan 1:");
        System.out.println("Speed: " + fn.getSpeed());
        System.out.println("On: " + fn.getOn());
        System.out.println("Radius: " + fn.getRadius());
        System.out.print("Colour :" + fn.getColour());
        

    }    
}
