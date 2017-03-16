package Homework_3;

/**
 * Created by USER on 3/7/2017.
 */
public class Prism extends ComparableShape {
    public Prism(double width, double length, double height){
        this.shape = new Rectangle(length, width);
        this.height = height;
    }
}
