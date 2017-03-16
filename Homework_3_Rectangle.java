package Homework_3;

/**
 * Created by USER on 3/7/2017.
 */
public  class Rectangle extends AreaShape {
    double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    protected double getArea() {
        return width*length;
    }
}
