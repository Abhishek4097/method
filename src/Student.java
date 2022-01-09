public class Student {
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float) total()/3;
    }
    public char grade(){
        if(average()>=60)
            return 'A';
        else
            return 'B';
    }
    public String toString(){
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.roll=1;
        s1.name="AKS";
        s1.course="CS";
        s1.m1=12;
        s1.m2=34;
        s1.m3=56;
        System.out.println("Total:"+s1.total());
        System.out.println("Average:"+s1.average());
        System.out.println("Details:\n"+s1);
    }
}
