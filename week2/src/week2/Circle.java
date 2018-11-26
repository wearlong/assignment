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
public class Circle extends Shape {
    Point center;
    double radius;
    static String name = "Circle";
    
    public Circle(double x, double y, double radius) {
        super(name);
        this.center = new Point(x, y);
        this.radius = radius;
    }
    
    public void setRadius( double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setCenter( double x, double y) {
        this.center = new Point(x, y);
    }
    
    public Point getCenter() {
        return center;
    }
    
    public double getArea() {
        return (radius * radius * Math.PI );
    }
    
    public String toString() {
        return " Center = " + center.toString() + "; Radius = " + radius;
    }
}
