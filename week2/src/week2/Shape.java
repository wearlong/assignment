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
public abstract class Shape {
    
    protected String name;
    
    public Shape(String n) {
        name = new String(n);
    }
    
    public abstract double getArea();
    
    public String getName() {
        return name;
    }
}
