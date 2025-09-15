
public class ConstructorStudent {

    public static void main(String[] args) {
        System.out.println("=======Student Details:=========");
        Student obj = new Student();
        obj.displayDetails();
        Student obj1 = new Student(102, "Amit", 21, 85);
        obj1.displayDetails();
        System.out.println("=======Teacher Details:=========");
        Teacher obj2 = new Teacher();
        obj2.displayDetails();
        Teacher obj3 = new Teacher(104, "Anu", 31, "Pune", "Science", 60000);
        obj3.displayDetails();

        if (obj1.marks > 80) {
            System.out.println("Student is Passed");
        } else {
            System.out.println("Student is Failed");
        }
    }
}

class Student {

    int id;
    String name;
    int age;
    int marks;

    public Student() {
        id = 101;
        name = "Adi";
        age = 20;
        marks = 80;
    }

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

class Teacher {

    int id;
    String name;
    int age;
    String subject;
    int salary;

    public Teacher() {
        id = 103;
        name = "Anu";
        age = 30;
        subject = "Maths";
        salary = 50000;
    }

    public Teacher(int id, String name, int age, String address, String subject, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}
