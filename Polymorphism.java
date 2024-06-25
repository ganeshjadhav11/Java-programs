/**
 * Student
 
 String name;
 int age; */
 class Student {
    String name;
    int age; 



public static void printInfo(String name){
    System.out.println(name);
}

public static void printInfo(int age){
    System.out.println(age);
}

public static void printInfo(String name,int age){
    System.out.println( name + " " + age);
}

 }

public class Poly {

    public static void main (String args[]){
         
        Student s1 = new Student();
        s1.name="Aman";
        s1.age=22;

        s1.printInfo(s1.name,s1.age);

    }
    
}
