package org.example;

public class Rectangle {
    public double a;
    public double b;
    public Rectangle(double a1, double b1){
        this.a = a1;
        this.b = b1;
    }
    public double area(){
        return this.a * this.b;
    }
}
