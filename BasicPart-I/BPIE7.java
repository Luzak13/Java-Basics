import java.util.Scanner;

public class BPIE7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println("Multiplication Table of " + num);
        for(int c = 0; c <= 10; c += 1){
            System.out.println(num + " X " + c + " = " + num*c);
        }
        
    }
}