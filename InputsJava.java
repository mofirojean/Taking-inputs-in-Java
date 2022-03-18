// Java program that takes input and displays it
// first we import the scanner class 
import java.util.Scanner;

public class InputsJava {
    public static void main(String[] args){
        // working with inputs in Java
        // special object call System.in
        
        // here we create an object from the scanner class
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        double age = input.nextDouble();

        System.out.print("Enter your maximum heart rate: ");
        double rate = input.nextDouble();

        double fb = (rate - age) * 0.65;
        System.out.println("Your ideal fat-burning heart rate is " + fb);
    }
}
