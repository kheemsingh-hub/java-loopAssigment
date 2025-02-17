import java.util.Scanner;

//1)Accept a number from user and display all factors of that number
public class loop {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter a number");
        int num= scanner.nextInt();
        for (int i=1; i<=num; i++  ){
            if (num %i==0){
                System.out.println(i);
            }
        }

    }
}
