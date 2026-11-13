import java.util.Scanner;
class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name, Class, Place;
        int Age;
        System.out.println("Enter bio data for student");
        System.out.println("Enter student name");
        Name = sc.nextLine();
        System.out.println("Enter student class");
        Class = sc.nextLine();
        System.out.println("Enter student age");
        Age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student place");
        Place = sc.nextLine();
        System.out.println("Name: " + Name);
        System.out.println("Class: " + Class);
        System.out.println("Age: " + Age);
        System.out.println("Place: " + Place);
        sc.close();
    }
}