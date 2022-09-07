import java.util.Scanner;

class BinNum{


    char[] arrayOfBits = null;
    int numOfBits;

    public BinNum(char[] bits, int numBits){
        this.numOfBits = numBits;
        this.arrayOfBits = new char[numBits];
        for(int c = 0; c < numBits; c++){
            this.arrayOfBits[c] = bits[c];

        }

    }

    public char[] multNum(int times){

        char[] initNum = this.arrayOfBits;
        char[] finalResult = new char[this.numOfBits];

        for( int c = 0; c < times-1; c++){

            this.arrayOfBits = this.sumNum(initNum);

        }
        
        return this.arrayOfBits;
        
    }

    public char[] sumNum(char[] bits){
        int numOfBits = this.numOfBits;
        
        boolean carry = false;

        char[] bits1 = this.arrayOfBits;
        char[] bits2 = new char[this.numOfBits];
        char[] sumResult = new char[this.numOfBits];

        for(int c = 0; c < bits1.length; c++){

            if(c < bits.length){

                bits2[c] = bits[c];

            }else{

                bits2[c] = '0';

            }

        }

        for(int c = 0; c < numOfBits; c++){
            sumResult[c] = '0';
            
        }
        System.out.println("Adding: ");
        System.out.println(bits1);
        System.out.println(bits2);
        System.out.println("Result: ");
        
        //sum operation
        for(int c = 0; c < numOfBits; c++){

            if(carry){

                if( bits1[c] == '1' ^ bits2[c] == '1'){

                    sumResult[c] = '0';
                    carry = true;
                    
                }else if(bits1[c] == '0' & bits2[c] == '0'){

                    sumResult[c] = '1';
                    carry = false;

                }else{

                    sumResult[c] = '1';
                    carry = true;

                }

            }else{

                if( bits1[c] == '1' ^ bits2[c] == '1'){

                    sumResult[c] = '1';
                    carry = false;

                }else if(bits1[c] == '0' & bits2[c] == '0'){

                    sumResult[c] = '0';
                    carry = false;

                }else{

                    sumResult[c] = '0';
                    carry = true;

                }

            }
        
        }
        System.out.println(sumResult);
        this.arrayOfBits = sumResult;
        return sumResult;
       
    }
}

class Calc{

    public void startCalc(){

        char[] inputBits0 = {'0', '0', '0', '0', '0', '0', '0', '0'};
        char[] inputBits1 = {'1', '0', '0', '0'};
        char[] inputBits2 = {'0', '1', '0', '0', '0'};
        char[] inputBits3 = {'1', '1', '0', '0', '0', '0', '0', '0'};
        char[] inputBits4 = {'0', '0', '1', '0', '0', '0', '0', '0'};
        char[] inputBits5 = {'1', '0', '1', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0','0', '0', '0', '0', '0', '0', '0', '0'};

        BinNum binNum1 = new BinNum(inputBits5, inputBits5.length);
        binNum1.sumNum(inputBits1);
        binNum1.sumNum(inputBits2);
        binNum1.multNum(5);


        

    }


}

public class BPIE18{
    public static void main(String[] args){
        Calc calc1 = new Calc();
        calc1.startCalc();
    }
}

