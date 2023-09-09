package Java_Practice;

public class Const {

    String name;
    int age;
    int rollno;

    Const(String n, int a, int rn) {
        name = n;
        age = a;
        rollno = rn;
    }

    public static void main(String[] args) {

        Const obj1 = new Const("Saurabh", 15, 2);
        Const obj2 = new Const("Aman", 15, 1);

        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.rollno);

        System.out.println("***************************************");

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.rollno);
    }

}
