/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package calculatorjava.calculatorjava;
import java.util.Scanner;
/**
 *
 * @author quluzade
 */
public class CalculatorJava {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Please enter first number: ");
            double firstNumber = sc.nextDouble();
            
            System.out.println("Please enter second number: ");
            double secondNumber = sc.nextDouble();
            
            System.out.println("Plese select operation: *, +, -, /");
            char operationSymbol = sc.next().charAt(0);
            
            
            
            
            if (operationSymbol == '+'){
                System.out.println(firstNumber +  "+" + secondNumber + "=" + (firstNumber + secondNumber) );
            }
            else if (operationSymbol == '*'){
                System.out.println(firstNumber +  "*" + secondNumber + "=" + (firstNumber * secondNumber));
            }
            else if (operationSymbol == '/'){
                System.out.println(firstNumber +  "/" + secondNumber + "=" + (firstNumber / secondNumber));
            }
            else if (operationSymbol == '-'){
                System.out.println(firstNumber +  "-" + secondNumber + "=" + (firstNumber - secondNumber));
            }
            else {
                System.out.println("UNKNOWN OPERATION");
            }
            
    }
}
