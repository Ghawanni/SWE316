package Homework_3;

/**
 * Created by USER on 3/7/2017.
 */
public class Cylinder extends ComparableShape{
    public Cylinder(double radius, double height){
        this.shape = new Circle(radius);
        this.height = height;
    }
}
