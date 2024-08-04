package org.example;

public class ProgFirst {
    public static void main(String[] args) {
        Square s = new Square(5);
        Rectangle r = new Rectangle(2,6);
        String text = "british stylish";
        voice1(text);
        voice2(s,r);
        //System.out.println("what is it?"+ "chokopai");
   }

    public static void voice1(String newtext){
        System.out.println(newtext);

    }
    public static void voice2(Square s, Rectangle r){
        System.out.println("Y kvadrata so stotonoi plochad " + s.l + " = " + s.area());
        System.out.println("Y prymaegolnika so stotonami plochad " + r.a + " and "+ r.b + " = " + r.area());
    }
}