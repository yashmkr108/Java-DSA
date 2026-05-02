public class App {
    public static void main(String[] args) throws Exception {
        // Default ctor
        Student A = new Student();
        A.id = 1;
        A.name = "yash";
        A.age = 18;
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.name);
        System.out.println(A.nos);

        A.sleep();

        // Parameterized ctor
        Student B = new Student(2,21,"Yash Makkar",5,"Yoroichi");
        System.out.println(B.age);

        // Copy ctor
        Student C = new Student(B);
        C.sleep();

        PrivateStudent me = new PrivateStudent("Yash",21);
        me.getStudentDetails();
        me.setStudentAge("Yanish",31);
        me.getStudentDetails();
    }
}
