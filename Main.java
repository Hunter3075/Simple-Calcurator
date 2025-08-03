import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner numberInput = new Scanner(System.in);
            System.out.println("Number 1 should always be bigger th than number 2 for substruction (-).");
            System.out.println("Choose number 1");
            double num1 = numberInput.nextDouble();
            System.out.println("Choose number 2");
            double num2 = numberInput.nextDouble();
            System.out.println("Choose operation 1 for +, 2 for -, 3 for *, 4 for /");
            int operation = numberInput.nextInt();
            if (operation == 1) {
                System.out.println(num1 + num2);
            }
            if (operation == 2) {
                System.out.println(num1 - num2);
            }
            if (operation == 3) {
                System.out.println(num1 * num2);
            }
            if (operation == 4) {
                System.out.println(num1 / num2);
            }
            System.out.println("Do you want to use the calculator again? 1 for Yes, 2 for No");
            int again = numberInput.nextInt();
            if (again == 1) {
                continue;
            }
            if (again == 2) {
                System.out.println(":(");
                break;
            }
        }
    }
}
