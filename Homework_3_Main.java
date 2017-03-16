package Homework_3;

/**
 * Created by USER on 3/7/2017.
 */
public class Main {
    public static void main(String [] args){
        Prism prsm = new Prism(5,5,5);
        Cylinder cl = new Cylinder(5,5);
        System.out.println(prsm.getVolume());
        System.out.println(cl.getVolume());
        System.out.println(prsm.compareTo(cl));
        System.out.println(cl.compareTo(prsm));
    }
}
