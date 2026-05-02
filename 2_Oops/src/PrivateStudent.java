// Perfect Encapsulation

public class PrivateStudent {
    private String name;
    private int age;

    public PrivateStudent(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void getStudentDetails(){
        System.out.println("The details of private student are");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public void setStudentAge(String name,int age){
        this.name = name;
        this.age = age;
    }
}
