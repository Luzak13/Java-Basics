import java.util.Scanner;
public class BPIE12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        float average = (num1+num2+num3)/3;
        System.out.print("Average is " + average); 
    }
}