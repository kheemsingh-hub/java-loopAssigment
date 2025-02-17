import java.util.Scanner;

//2)Accept two numbers from user and display LCM as well as HCF of both numbers
public class loop2 {
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2);


        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}