package Homework_3;

/**
 * Created by USER on 3/7/2017.
 */
public class Circle extends AreaShape{
    public Circle(double width){
        this.width = width;
    }
    public double getArea(){
        return Math.PI*Math.pow(width,2);
    }
}
