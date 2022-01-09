import java.awt.geom.Area;

public class Rectangle {
    public double length;
    public double breadth;
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
 class Rectangle1{
     public static void main(String[] args) {
         Rectangle r1=new Rectangle();
         r1.length=3;
         r1.breadth=5;
         System.out.println("Area " +r1.area());
         System.out.println("Perimter " +r1.perimeter());
         System.out.println("isSquare " +r1.isSquare());
     }
}
