public class subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public subject(String subId,String name,int maxMarks){
        this.subId=subId;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    public void setMaxMarks(int mm){
        maxMarks=mm;
    }
    public void setMarksObtain(int m){
        marksObtain=m;
    }
    boolean isQualified(int m){
        return m>=maxMarks;
    }
    public String toString(){
        return "\nSubject ID:"+subId+"\nName:"+name+"\nMarks Obtained:"+marksObtain;
    }
}
class SCoops{
    public static void main(String[] args) {

    }
}