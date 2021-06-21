import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        
Scanner userInput = new Scanner(System.in);

boolean endCalculator = false;
float endResult = 0;

System.out.println("Welcome to a java based calculator!");



System.out.println("Input a number:");
float num1 = userInput.nextFloat(); //First number input

System.out.println("Input an +, -, *, / ");
char operationSymbol = userInput.next().charAt(0);

System.out.println("Input second number:");

float num2 = userInput.nextFloat();//Second number input

switch(operationSymbol){

    case '+': endResult = add(num1, num2);
             break;

    case '-': endResult = subtract(num1,num2);
            break;

    case '*': endResult = multiply(num1,num2);
            break;

    case '/': endResult = divide(num1,num2);
             break; 

    }

    System.out.println("The answer is " + endResult);

    System.out.println("Would you like to use the end result with an another operation? Enter Y for yes or N for no");

    char anotherOp = userInput.next().charAt(0);

    float endResult2 = 0;
    if(anotherOp == 'Y'){

        System.out.println("Enter the operation symbol: (+,-,*,/)");
        char operationSymbol2 = userInput.next().charAt(0);

        System.out.println("Enter the next number:");
        float num3 = userInput.nextFloat();

        switch(operationSymbol2){

            case '+': endResult2 = add(endResult, num3);
                    break;

            case '-': endResult2 = subtract(endResult,num3);
                    break;

            case '*': endResult2 = multiply(endResult2,num3);
                    break;

            case '/': endResult2 = divide(endResult2,num3);
                    break; 

        }
        System.out.println("The answer is: " + endResult2);

    }
    else{
        System.out.println("Calculator shutting off");
    }
    




    }
///////////////////////////////////////////////////////////////////
static int calculatorMenu(){
    Scanner keyboard = new Scanner(System.in);

    int option;
    boolean invalidChoice;

    do{
        System.out.println("-----Calculator menu--------------");
        System.out.println("Press '+'  " );
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        option = keyboard.nextInt();

        invalidChoice = (option < 1 || option > 4);

        if(invalidChoice){
            System.out.println("Invalid choice please try again! (1-4)");
        }
        


    }while(invalidChoice);

    return option;

}
/////////////////////////////////////////
public static float add(float x, float y){
    float addResult;

    addResult = x + y;

    return addResult;
}
//////////////////////////////////////////
public static float subtract(float x, float y){
    float subtractResult;

    subtractResult = x - y;


    return subtractResult;
}
/////////////////////////////////////////
public static float multiply(float x, float y){
    float multiplyResult;

    multiplyResult = x * y;

    return multiplyResult;
}
//////////////////////////////////////////
public static float divide(float x, float y){
    float divideResult;

    divideResult = x/y;

    return divideResult;

}



}
