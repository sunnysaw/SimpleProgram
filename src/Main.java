/*
Question : Write a java program to take input from user and then increment all the number by 1.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int temp, temp2 = 0,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        while (a > 0){
            temp = a % 10;
            temp++;
            temp2 = temp2 * 10 + temp;
            a = a / 10;
        }
        System.out.println("Final result :");
        while (temp2 > 0){
            b = temp2 % 10;
            System.out.print(b);
            temp2 = temp2 / 10;
        }
    }
}
