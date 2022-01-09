public class method5 {
    boolean validate(String name){
        return name.matches("[a-zA-Z\\s]+");
    }
    boolean validate(int age){
        return age>=3 && age<=15;
    }

}
