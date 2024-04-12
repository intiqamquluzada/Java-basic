/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loops.loops;
import java.util.Scanner;
/**
 *
 * @author quluzade
 */
public class CalcWMethods {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        double firstNumber = sc.nextDouble();
        
        System.out.println("Enter second number: ");
        double secondNumber = sc.nextDouble();
        
        System.out.println("Select operation:\n1.+\n2.-\n3.*\n4./");
        char operationSymbol = sc.next().charAt(0);
        
        if(operationSymbol == '1'){
            System.out.println(sumDigits(firstNumber, secondNumber));
        }
        else if(operationSymbol == '2'){
            System.out.println(minusDigits(firstNumber, secondNumber));
        }
        else if(operationSymbol == '3'){
            System.out.println(multiplyDigits(firstNumber, secondNumber));
        }
        else if(operationSymbol == '4'){
            System.out.println(divideByDigits(firstNumber, secondNumber));
        }
    }
    
    public static double sumDigits(double a, double b){
        return a + b;
    }
    public static double multiplyDigits(double a, double b){
        return a * b;
    }
    public static double divideByDigits(double a, double b){
        return a / b ;
    }
    public static double minusDigits(double a, double b){
        return a - b;
    }
    
}
