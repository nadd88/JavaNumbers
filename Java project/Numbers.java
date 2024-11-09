import java.util.Scanner;
  public class Numbers{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);
      System.out.println("Welcome to java numbers converter!");
        System.out.println("Please choose which equation to proceed : \n 1 - Decimal to binary \n 2 - Decimal to hexadecimal  \n 3 - Decimal to octal \n 4 - Octal to decimal \n 5 - Binary to decimal ");
        while( i <= 6){
        switch(i){       
           case 1 : DecToBin(); break;
          case 2 : DecToHex(); break;
          case 3 : DecToOctal(); break;
          case 4 : OctalToDec(); break;
          case 5 : BinToDec(); break;
        }
        System.out.println("Please choose which equation to proceed : \n 1 - Decimal to binary \n 2 - Decimal to hexadecimal  \n 3 - Decimal to octal \n 4 - Octal to decimal \n 5 - Binary to decimal ");
        i = in.nextInt();
      }     
    }
    static void DecToBin(){  //Decimal to binary method

      Scanner in = new Scanner(System.in);
      System.out.print("Please enter number in decimal : ");
      int num = in.nextInt();  //Decimal number by the user
      int mod; String Bin = "";
      while(num != 0){
        mod = num%2;
        Bin = mod + Bin;
        num/=2;
      }
      System.out.println(Bin);
        } //End of method


    static void DecToHex(){ //Decimal to hexadecimal method
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter number in Decimal : ");
      int num = in.nextInt();
      int mod; String Hex = "";
        while(num != 0){
           mod = num % 16;
           num/=16;
           switch(mod){
            case 10 : System.out.print("A"); break;
            case 11 : System.out.print("B"); break;
            case 12 : System.out.print("C"); break;
            case 13 : System.out.print("D"); break;
            case 14 : System.out.print("E"); break;
            case 15 : System.out.print("F"); break;
            default : Hex = mod + Hex;
           }          
        }
        System.out.println(Hex);
     } //End of DecToHex method
    static void DecToOctal(){ //Decimal To Octal Method
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter number in Decimal : ");
      int num = in.nextInt();  //Decimal number by the user
       int mod; String Oct = "";
      while(num != 0){
        mod = num%8;
        Oct = mod + Oct;
        num/=8;
      }
      System.out.println(Oct);
   } //End of DecToOctal Method
    static void OctalToDec(){
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter number in Octal : ");
      int oct = in.nextInt();
      int mod;
      int sum = 0;
      int i = 0; int dec= 0;
      while(oct != 0){
        mod = oct%10;
        oct/=10;
        sum = mod * (int)Math.pow(8, i);
        dec +=sum; 
        i++;   
      }
      System.out.println(dec);
         
    }
    static void BinToDec(){
      Scanner in = new Scanner(System.in);
      System.out.print("Please enter number in Binary : ");
      int bin = in.nextInt();
      int mod;
      int sum = 0;
      int i = 0; int dec= 0;
      while(bin != 0){
        mod = bin%10;
        sum = mod * (int)Math.pow(2, i);
        bin/=10;
        dec +=sum;   
        i++; 
      }
      System.out.println(dec);
    
    }
  } //End of class