package Praktikum05;
import java.lang.Math;
public class Sphere extends Shape{
    private double radius;
    public Sphere(double r){
        super("Sphere");
        this.radius = r;
    }
    public double area(){
        return 4 * Math.PI * radius * radius; }
    public String toString(){
        return super.toString() + " of radius " + radius;
    }
}