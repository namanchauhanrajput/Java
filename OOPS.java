class Pen {
    String color;
    String type; // ballpoint; gel

    public  void write() {
        System.out.println("writing something");
    }

    public void printcolor() {
        System.out.println(this.color);

    }

}
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS{
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Naman";
        s1.age = 19;

        s2.name = "Aman";
        s2.age = 18;
        s1.printInfo();
        s2.printInfo();
    }
}