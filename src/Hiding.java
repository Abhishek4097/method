import java.awt.geom.Area;

public class Hiding {
    private double length;
    private double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
}
class Rectangle0{
    public static void main(String[] args) {
        Hiding r1=new Hiding();
        r1.setLength(12.5);
        r1.setBreadth(3.8);
        System.out.println("Area " +r1.area());
        System.out.println("Perimter " +r1.perimeter());
        System.out.println("isSquare " +r1.isSquare());
        System.out.println("Length: "+r1.getLength());
        System.out.println("Breadth: "+r1.getBreadth());
    }
}

