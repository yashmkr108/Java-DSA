class Employee {
    protected String name;
    protected int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
        this.id = id;
        this.name = name;
    }

    protected void display() {
        System.out.println("Employee Id : " + id + " name : " + name);
    }
}

class Devloper extends Employee {
    public String programmingLang;

    public Devloper(int id, String name, String programmingLang) {
        super(id, name);
        this.programmingLang = programmingLang;
    }

    public void show() {
        System.out.printf("My name id %s , I use %s language\n", name, programmingLang);
    }
}

class HR extends Employee {

    public HR(int id, String name) {
        super(id, name);
    }

    public void HRDuty() {
        System.out.println("Doing hr duties");
    }
}

//class ProjectManager extends Employee {
//
//    protected String projectManaged;
//
//    public ProjectManager(int id, String name, String projectManaged) {
//        super(id, name);
//        this.projectManaged = projectManaged;
//    }
//
//    public void manageProject() {
//        System.out.println("Yes i will manage this project : " + projectManaged);
//    }
//}

//class TeamLead extends Employee {
//
//    protected int teamSize;
//
//    public TeamLead(int id, String name, int teamSize) {
//        super(id, name);
//        this.teamSize = teamSize;
//    }
//
//    public void leadTeam() {
//        System.out.println("Yes i will lead this team of : " + teamSize);
//    }
//}


interface ProjectManager {
    void manageProject();
}

interface TeamLead {
    void leadTeam();
}

// both teamlead and project manager is implemented insidee techLead
class TechLead extends Employee implements ProjectManager, TeamLead {
    protected String projectManaged;
    protected int teamSize;

    public TechLead(int id, String name, String projectManaged, int teamSize) {
        super(id, name);
        this.projectManaged = projectManaged;
        this.teamSize = teamSize;
    }

    public void manageProject() {
        System.out.println("Yes i will manage this project : " + projectManaged);
    }

    public void leadTeam() {
        System.out.println("Yes i will lead this team of : " + teamSize);
    }

}

public class TypeOfInheritance {

    static void main(String[] args) {
        // Single Inheritance
        Devloper dev = new Devloper(1, "Dev", "Java");
        dev.show();
    }
}
