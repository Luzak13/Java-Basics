import java.util.Scanner;

public class BPIE17{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        
        int numBits;

        System.out.println("Number of bits: ");
        numBits = in.nextInt();

        char[] binary1 = new char[numBits+1];
        char[] binary2 = new char[numBits+1];
        char[] binarySum = new char[numBits*2];

        boolean extraBit = false; 
        
        System.out.println("[LSD -> MSD] Binary 1: ");
        for(int c = 0; c < numBits; c+=1){
            binary1[c] = in.next().charAt(0);
        }
        System.out.println("[LSD -> MSD] Binary 2: ");
        for(int c = 0; c < numBits; c+=1){
            binary2[c] = in.next().charAt(0);
        }
        for(int c = 0; c < numBits*2; c+=1){
            binarySum[c] = '0';
        }
        
        
        System.out.print("\nBinary 1: ");
        for(int c = numBits-1; c >= 0; c-=1){
            System.out.print(binary1[c]);    
        }
        System.out.print("\nBinary 2: ");
        for(int c = numBits-1; c >= 0; c-=1){
            System.out.print(binary2[c]);    
        }

        for(int c = 0; c < numBits+1; c+=1){
            if(extraBit){
                if( binary1[c] == '1' ^ binary2[c] == '1'){
                    binarySum[c] = '0';
                    extraBit = true;
                }else if(binary1[c] == '0' & binary2[c] == '0'){
                    binarySum[c] = '1';
                    extraBit = false;
                }else{
                    binarySum[c] = '1';
                    extraBit = true;

                }
            }else{
                if( binary1[c] == '1' ^ binary2[c] == '1'){
                    binarySum[c] = '1';
                    extraBit = false;
                }else if(binary1[c] == '0' & binary2[c] == '0'){
                    binarySum[c] = '0';
                    extraBit = false;
                }else{
                    binarySum[c] = '0';
                    extraBit = true;

                }

            }
        }

        System.out.print("\nSum: ");
        for(int c = numBits*2-1; c >= 0; c-=1){
            System.out.print(binarySum[c]);    
        }
        
        

    }
}