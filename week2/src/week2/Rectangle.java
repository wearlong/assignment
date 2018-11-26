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
public class Rectangle extends Shape {
    Point topLeft;
    double length;
    double width;
    static String name = "Rectangle";
    
    public Rectangle(double x, double y, double length, double width) {
        super(name);
        this.topLeft = new Point(x,y);
        this.length = length;
        this.width = width;
    }
    
    public void setLength ( double length) {
        this.length = length;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setWidth ( double width) {
        this.width = width;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setTopLeft( double x, double y) {
       this.topLeft = new Point(x,y);
    }
    
    public Point getTopLeft() {
        return topLeft;
    }
    
    public double getArea() {
        return (width * length);
    }
    
    public String toString() {
        return " TopLeft = " + topLeft.toString() + "; Length = " + length + "; Width = " + width;
    }
    
}
