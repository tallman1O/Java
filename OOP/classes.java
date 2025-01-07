package OOP;

public class classes {
    public static void main(String[] args) {
        Student Student1;
        Student1 = new Student();
        //or
        // Student Student1 = new Student();
        System.out.println(Student1.rnoll); // 0
        System.out.println(Student1.name); // null
        System.out.println(Student1.marks); // 0.0

        //After putting Default Value of Marks
        System.out.println(Student1.marks); // 90.0

        Student1.rnoll = 69;
        Student1.name = "Mehul";
        Student1.marks = 96.5f;

        System.out.println(Student1.rnoll); // 69
        System.out.println(Student1.name); // Mehul
        System.out.println(Student1.marks); // 96.5


        //constructor
        Student Student2 = new Student();

        Student2.greeting(); //Hello My name is Mehul Uttam

    }

}

//Create a class
//for every single Student.
class Student {
    int rnoll;
    String name;
    float marks = 90; //Default Value

    void greeting() {
        System.out.println("Hello My name is "+ name);
    }

    Student(){
    this.rnoll = 12;
    this.name = "Mehul Uttam";
    this.marks = 56.7f;
    }
}
