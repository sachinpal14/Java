
import java.util.*;

class pen {

    String color;
    String type;
    int price;
    String brand;
    String name;

    public void write() {
        System.out.println("Writing with " + this.color + " " + this.type + " pen of brand " + this.brand);

    }

    public void printColor() {
        System.out.println(this.color); // this keyword refers to the current context
    }
}

class Student {
    String name;
    int rollNo;
    String branch;
    int age = 50;

    Student() {
        System.out.println("Constructor called");
        // default constructor
    }

    Student(Student s2) {
        this.name = s2.name;
        this.rollNo = s2.rollNo; // copy constructor
    }

    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Branch: " + this.branch);
        System.out.println("Age: " + this.age);
    }

    public void printDetails(String name) {
        System.out.println("Name: " + name);
    } // method overloading

    public void printDetails(int rollNo) {
        System.out.println("Roll No: " + rollNo);
    } // method overloading
}

class Shape {
    String color;
} // parent class

class Triangle extends Shape { // child class
    int base;
    int height;

    public void area() {
        System.out.println("Area of triangle: " + (0.5 * this.base * this.height));
    }
}

class EquilateralTriangle extends Triangle {

    public void area() {
        System.out.println("Area of equilateral triangle: " + (0.5 * this.base * this.height));
    }
}

class circle extends Shape { // child class
    int radius;

    public void area() {
        System.out.println("Area of circle: " + (3.14 * this.radius * this.radius));
    }
}

abstract class Animal { // abstract class
    String name;

    Animal() { // constructor of abstract class
        System.out.println("Animal constructor called");
    } // constructor of abstract class

    public void eat() {
        System.out.println("Animal eats food");
    }

    public abstract void sound(); // abstract method
}

class Dog extends Animal { // child class
    Dog() { // constructor of child class
        System.out.println("Dog constructor called");
    } // constructor of child class

    public void sound() { // overriding the abstract method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal { // child class
    public void sound() { // overriding the abstract method
        System.out.println("Cat meows");
    }
}

class Student1 {
    String name;
    static String schoolName;

    public static void schoolName(String newSchoolName) {
        schoolName = "bhen ke la** autaat me ..";// static method to change the school name
    } // static method to change the school name
}

interface Animals {
    // interface do not have the constructors
    // interface ko extends ni krte h
    // inteface ke andar non-abstract method nahi hote h
    //
    public void sound();

    int eye = 2;
    // abstact method ko implement nahi krte h
    // interface ke andar by default saari field final , static ,public hote h
    // yah par method and variable automatically public and abstract hote h h but
    // child me implement karte waqt define krte h ki public hoga ya static hoga ya
    // private hoga

}

class Dog1 implements Animals { // implementing the interface
    public void sound() { // overriding the abstract method
        System.out.println("Dog barks");
    }

}

class Horse implements Animals, Hervibore { // implementing the interface
    public void sound() { // overriding the abstract method
        System.out.println("Horse neighs");

    }

    public void eat() { // implementing the abstract method of Hervibore interface
        System.out.println("Horse eats grass");
    } // implementing the abstract method of Hervibore interface
}

interface Hervibore {
    public void eat(); // abstract method
}

public class oops { // main function
    public static void main(String[] args) {
        // pen p1 = new pen(); // creating object of class pen
        // p1.color = "blue";
        // p1.type = "gel";
        // p1.price = 10;
        // p1.brand = "Parker";
        // p1.name = "Parker Pen";

        // pen p2 = new pen(); // creating object of class pen
        // p2.color = "red";
        // p2.type = "ballpoint";
        // p2.price = 20;
        // p2.brand = "Reynolds";
        // p2.name = "Reynolds Pen";

        // p1.write();
        // p2.write();

        // p2.printColor();

        // Creating an object of Student class
        // creating object of class Student when the we do not make the constructor
        // new keyword is used to create an object of a class the memory is allocated to
        // the object in the heap this is called dynamic memory allocation and called
        // the constructor of the class
        // Constructor is a special method which is called when an object is created. It
        // has the same name as the class and does not have any return type.

        // In java there are the three types of constructors:
        // 1. Default constructor: It does not take any parameters and initializes the
        // object with default values.
        // 2. Parameterized constructor: It takes parameters and initializes the object
        // with the given values.
        // 3. Copy constructor: It creates a new object by copying the values of an
        // existing object.
        // java bydefault provides a default constructor if we do not define any
        // constructor in the class.

        // Student s1 = new Student();

        // s1.rollNo = 69;
        // s1.name = "Jhaatu ";
        // s1.branch = "xHamster";

        // Student s2 = new Student(s1); // copy constructor

        // s2.printDetails();

        // destructor is a special method which is called when an object is destroyed.
        // It has the same name as the class and does not have any return type. It is
        // used to perform cleanup operations before the object is destroyed. In java
        // there is no destructor because java has garbage collection which
        // automatically destroys the objects when they are no longer needed.
        // Destructor is used to free the memory allocated to the object. In java there
        // is no destructor because java has garbage collection which automatically
        // destroys the objects when they are no longer needed. Garbage collection is a
        // process of automatic memory management in which the java runtime environment
        // automatically frees the memory occupied by the objects that are no longer
        // referenced by the program. The garbage collector runs in the background and
        // periodically checks for objects that are no longer needed and frees their
        // memory. This helps to prevent memory leaks and improves the performance of
        // the program.

        // POLLYMORPHISM :- It is the ability of an object to take on many forms. It is
        // a feature of OOP that allows one interface to be used for a general class of
        // actions. The specific action is determined by the exact nature of the
        // situation. There are two types of polymorphism in java:
        // Compile time
        // Runtime

        // Compile time polymorphism: It is also known as static polymorphism. It is
        // achieved by method overloading and operator overloading. Method overloading
        // is the ability to define multiple methods with the same name but different
        // parameters. Operator overloading is the ability to define multiple operators
        // with the same name but different parameters.

        // overloading : same name with different parameters different data types or
        // different number of parameters or diffrenetn return type differnet arguments
        // length

        // overriding : overide the name of he variable

        // INHERITANCE :- It is the process by which one class acquires the properties
        // of another class

        // Triangle t1 = new Triangle();// creating object of class triangle
        // t1.base = 5;
        // t1.height = 10;
        // t1.color = "red";
        // t1.area();

        // EquilateralTriangle t2 = new EquilateralTriangle(); // creating object of
        // class equilateral triangle
        // t2.base = 5;
        // t2.height = 10;
        // t2.color = "blue";

        /// making the package of he class and importing the package in the main class

        // in the java the multilevel inheritance is not allowed but there is something
        // in java called the interface which is used in the replacement of the
        // multilevel inheritance.

        // Encapsulation: It is the process of wrapping the data and the code together
        // as a single unit. It is used to restrict the access to the data and the code.
        // It is achieved by using access modifiers. There are four types of access
        // modifiers in java:
        // 1. private: It is used to restrict the access to the data and the code within
        // the class.
        // 2. protected: It is used to restrict the access to the data and the code
        // within the package and subclasses.
        // 3. public: It is used to allow the access to the data and the code from
        // anywhere.
        // 4. default: It is used to allow the access to the data and the code within
        // the package only.

        // Abstraction: It is the process of hiding the implementation details and
        // showing only the functionality to the user. It is achieved by using abstract
        // classes and interfaces.

        // Interface: It is a collection of abstract methods. It is used to achieve
        // abstraction and multiple inheritance in java. An interface can extend
        // multiple interfaces but a class can implement multiple interfaces.

        // Abstract class: It is a class that cannot be instantiated. It can have
        // abstract methods and concrete methods. An abstract method is a method that
        // does not have a body. A concrete method is a method that has a body.

        // Abstract class can have constructors and methods but interface cannot have
        // constructors and methods. Abstract class can have instance variables but
        // interface cannot have instance variables. Abstract class can have static
        // methods but interface cannot have static methods. Abstract class can have
        // final methods but interface cannot have final methods. Abstract class can
        // implement multiple interfaces but interface cannot implement multiple
        // interfaces.

        // Dog d = new Dog();
        // d.sound(); // calling the sound method of dog class

        // Cat c = new Cat(); // creating object of cat class
        // c.sound(); // calling the sound method of cat class
        // c.eat();

        // Horse horse = new Horse(); // creating object of horse class
        // horse.sound(); // calling the sound method of horse class
        // horse.eat(); // calling the eat method of horse class
        // // Interface is a collection of abstract methods. It is used to achieve
        // abstraction

        // Static :- java ka matlabl jo class ke liye common hoti h  variable ke use hote h nested ke liye bhi use hote . 
        // isse fucntion ke andar ya bahar dono jagah use kar sakte h 

        Student1.schoolName = "load lassun School"; // static variable sabke liye common h 
        Student1 s1 = new Student1(); // creating object of class Student1
        s1.name = "Jhaatu"; // instance variable
        System.out.println(s1.schoolName); // instance variable

    }

}