// Problem Statement: Take Input 'n' from User and Print the first
// 'n' Fibonnaci numbers.
// For Example, if User inputs 5, the Output Should be:
// The first Fibonnaci numbers are: 1 1 2 3 5
// Approach: 1. Use If-Else for the 1st and 2nd number of the series.
//           2. Use loops for adding the previous number and continuing
//              the series.

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        System.out.println("n->(Number of Fibonacci numbers)");
        System.out.print("Enter n: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int Prev_no1=1;
        int Prev_no2=1;
        int temp=1;
        System.out.println("The first " + n + " Fibonacci numbers are: ");
        for(int no=1;no<=n;no++){
            if(no==1){
                System.out.print(Prev_no1+" ");
            }
            else if(no==2){
                System.out.print(Prev_no1+" ");
            }
            else{
                Prev_no1=Prev_no1+Prev_no2;
                Prev_no2=temp;
                temp=Prev_no1;
                System.out.print(Prev_no1+" ");
            }
        }
    }
}