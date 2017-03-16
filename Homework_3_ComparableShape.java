package Homework_3;

public abstract class ComparableShape implements Comparable<ComparableShape>{
    protected double height;
    protected AreaShape shape;
    protected double getVolume(){
        return height*shape.getArea();
    }
    public int compareTo(ComparableShape o){
        if(this.getVolume() > o.getVolume())
            return 1;
        else if( this.getVolume() < o.getVolume())
            return -1;
        else
            return 0;
    }
}
