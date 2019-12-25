
package calculator;

import java.util.Scanner;
public class Calculator {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER TWO NUMBERS:");
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        System.out.print("ENTER AN OPERATOR(+,-,*,/):");
        char operator=sc.next().charAt(0);
        double result;
        switch(operator)
        {
            case'+':
                result=first+second;
                break;
            case'-':
                result=first+second;
                break;
            case'*':
                result=first*second;
                break;
                case'/':
                    result=first/second;
                default:
                    System.out.print("ERROR! Operator not found");
                    return;
                   
        
        }
           System.out.printf("%.1f%c%.1f=%.1f",first,operator,second,result);
    }
    
}
