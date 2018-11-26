/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author itst
 */
public class TestShape {
    public static void main(String[] args) {
        
        Circle circle;
        circle = new Circle( 22, 8, 3.5);
        
        Rectangle rectangle;
        rectangle = new Rectangle( 7.5, 2, 18, 11);
        
        System.out.print(circle.getName() + ":" + circle.toString());
        System.out.println("; Area = " + circle.getArea());
        
        
        System.out.print(rectangle.getName() + ":" + rectangle.toString());
        System.out.println("; Area = " + rectangle.getArea());
    }
    
}
