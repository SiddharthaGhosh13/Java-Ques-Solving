// Problem Statement: Take two no. Input from User and Enter the Operator(+ - / *)
// & continue calculating until user terminates it.
// For Example, the Output Should be:
// Enter num1: 5
// Enter num2: 7
// Enter operator('+' '-' 'x' '/'): +
// 12.0
// (Press 'n' to stop)
// Enter operator('+' '-' 'x' '/' 'n'): -
// Enter num: 10
// 2.0
// (Press 'n' to stop)
// Enter operator('+' '-' 'x' '/' 'n'): n
//
// Approach: 1. Take no. Input and Use Switch Case for Storing the right
//              Operator(+ - / *) and Printing their Sum, Difference, Product, Division.
//           2. Put Break Statement, to Come Out Of the Switch Case after Getting the
//              result.
//           3. Then use a 'for' loop and take operator input from user.
//           4. If the operator is valid, take number input and calculate until terminated.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        double num1 = in.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = in.nextDouble();
        System.out.print("Enter operator('+' '-' 'x' '/'): ");
        char operator = in.next().charAt(0);
        double nextNum=0;
        double result=0;

        switch(operator){
            case '+': {
                System.out.println((num1+num2));
                result=(num1+num2);
                break;
            }
            case '-':{
                System.out.println((num1-num2));
                result=(num1-num2);
                break;
            }
            case '/':{
                System.out.println((num1/num2));
                result=(num1/num2);
                break;
            }
            case 'x':{
                System.out.println((num1*num2));
                result=(num1*num2);
                break;
            }
            default:{
                System.out.println("Invalid operator");
            }
        }

        for(int i=1; true ; i++){
            System.out.println("(Press 'n' to stop)");
            System.out.print("Enter operator('+' '-' 'x' '/' 'n'): ");
            char Op=in.next().charAt(0);

            if( Op == '+' || Op == '-' || Op == 'x' || Op == '/'){
                System.out.print("Enter num: ");
                nextNum = in.nextDouble();

                switch(Op){
                    case '+': {
                        System.out.println((result+nextNum));
                        result=(result+nextNum);
                        break;
                    }
                    case '-':{
                        System.out.println((result-nextNum));
                        result=(result-nextNum);
                        break;
                    }
                    case '/':{
                        System.out.println((result/nextNum));
                        result=(result/nextNum);
                        break;
                    }
                    case 'x': {
                        System.out.println((result * nextNum));
                        result = (result * nextNum);
                        break;
                    }
                }
            }
            else if(Op == 'n'){
                break;
            }
            else{
                System.out.println("Invalid operator");
                break;
            }
        }
    }
}