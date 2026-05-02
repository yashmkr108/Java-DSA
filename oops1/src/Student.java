public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    // Constructor
    // Default -> attribute -> Garbage value
    public Student() {
        System.out.println("Default ctor is called");
    }

    // Parameterised
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Parameterized ctor is called");
        this.id = id;
        this.name = name;
        this.nos = nos;
        this.age = age;
        this.gf = gf;
    }
    // Copy
    public Student(Student srcObj){
        System.out.println("Copy ctor is called");
        this.id = srcObj.id;
        this.name = srcObj.name;
        this.age= srcObj.age;
        this.nos = srcObj.nos;
    }

    // Methods/Behaviors
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void bunk() {
        System.out.println(name + " Bunking");
    }

    private void gfChatting() {
        System.out.println(name + "Chatting to gf");
    }
}
