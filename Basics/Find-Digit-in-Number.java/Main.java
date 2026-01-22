// Problem Statement: Take number Input from User and Print how many times
// the number is been repeated.
// For Example, if User inputs number -> 567789
// and digit -> 7
// The Output Should be:
// 7 in 567789 is: 2 times
// Approach: 1. Use 'while' loop and find out the lastdigit.
//           2. Check the lastdigit and the input 'digit'.
//           3. If it's same, increase the count

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