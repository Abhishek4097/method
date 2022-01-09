class const1 {
    private double length;
    private double breadth;
    public const1(){
        length=1;
        breadth=1;
    }
    public const1(double l,double b){
        length=l;
        breadth=b;
    }
    public const1( double s){
        length=breadth=s;
    }
}
class RectangleTest{
    public static void main(String[] args) {
        const1 c1=new const1(); 
    }
}
