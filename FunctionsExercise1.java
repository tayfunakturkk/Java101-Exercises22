package Functions.Exercise1;
import java.util.Scanner;

public class FunctionsExercise1 {
    static boolean isPalindrom(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number to check:");
        int number=input.nextInt();
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }
        if(number==reverseNumber){
            System.out.println(number+" is Palindrom");
            return true;
        }else{
            System.out.println(number+ " is not Palindrom");
            return false;
    }
}
    public static void main(String[] args) {
        isPalindrom();
    }
}
