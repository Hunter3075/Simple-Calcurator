import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner numIn = new Scanner(System.in);
        System.out.println("Choose number 1 and press enter.");
        double num1 = numIn.nextInt();
        System.out.println("Choose number 2 and press enter.");
        double num2 = numIn.nextInt();
        double ave = (num1 + num2) / 2;
        System.out.println("The average of " + num1 + " and " + num2 + " is: " + ave);
    }
}
