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