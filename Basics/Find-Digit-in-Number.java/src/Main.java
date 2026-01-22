import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=in.nextInt();
        System.out.print("Enter a digit from " + num + ": ");
        int digit=in.nextInt();
        int temp=num;
        int count=0;
        while(temp!=0){
            int lastDigit=temp%10;
            if(lastDigit==digit){
                count++;
            }
            temp/=10;
        }
        System.out.println(digit + " in " + num + " is " + count + " times");
    }
}