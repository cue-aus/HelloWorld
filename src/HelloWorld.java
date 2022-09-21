import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            // read a single byte
            System.out.print("Enter one digit: ");
            int data = System.in.read();
            System.out.println("" + data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //using Scanner
        Scanner myObj = new Scanner(System.in);
        //clear input console
        myObj.nextLine();
        //start new input
        System.out.print("Enter name: ");
        // String input
        String name = myObj.nextLine();
        // Numerical input
        System.out.print("Enter age: ");
        int age = myObj.nextInt();
        System.out.print("Enter salary: ");
        double salary = myObj.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
