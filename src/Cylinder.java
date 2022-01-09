public class Cylinder {
    public float radius;
    public float height;

    public float lidArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float totalSurfaceArea() {
        return 2 * lidArea() + volume() * height;
    }

    public float volume() {
        return lidArea()*height;
    }
}
class Cylinder1{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.height=10;
        c1.radius=7;
        System.out.println("lidArea: " +c1.lidArea());
        System.out.println("volume: " +c1.volume());
        System.out.println("totalSurfaceArea: " +c1.totalSurfaceArea());
    }

}

