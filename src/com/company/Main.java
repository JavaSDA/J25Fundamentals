/*
* A package is a class specification. Essentially, it allows you to differentiate classes, especially
* in a scenario or situation where the classes may have the same name.
*
* Boilerplate code is code that is essentially repeatable (and is needed for the program to run).
*
* All Java code is only valid inside a class.
*
* A class is a blueprint for writing code or building objects.
*
* A method is a collection of statements that achieve a unit of a task (or the task itself)
*
* A main method is the main entry point of any Java program (or Project).
* and the standard signature for any main method is public static void main(String[] args)
*
* public is an access modifier and it allows other components of your Java program to be
* able to see that component.
*
* Java is a statically-typed language, because you have to specify the data type of the variable before you define the variable.
*
* =======================
* Data types
* =======================
*
* We have 2 main categories of data types in java
* - Primitive data types - By default, they are in Java already
* - Complex Objects - Some are default and some are created by users.
*
* byte
* short
* int - integer and holds integer variables (4 bytes of memory): -2147483648 -> 2147483647
* long - 8 bytes: -2 ^ 63 -> (-2 ^ 63) - 1
* float - 4 byte - up to 6 or 7 decimal places
* double - 8 bytes - max of 15 dp
* char - 1 byte of data. A maximum of one character.
* boolean - true / false (or an expression that evaluates to true or false)
*
* String - Anything you have in between "" is a string
*
* concatenation is the action of joining two strings to make a new string.
*
* =====================
* Operators
* =====================
* Arithmetic Operators
* Comparison Operator
* Logical Operators
*
* Arithmetic - +, -, *, /, %
* addition -> +
* sub -> -
* Mul -> *
* Div -> /
* Modulus -> % -> returns the remainder after performing division
*
* Comparison Operators
* Greater than ( > )
* Less than ( < )
* Equals ( == )
*  Greater than or equal ( >= )
* Less than or equal ( <= )
* Not equal ( != )
*
* Logical Operators
* and ( && ) - This will only return true if both expressions evaluate to true
* or ( || ) - This will only return false if both expressions evaluate to false
*
* Strings
* Loops
* Regular Expressions
* */
// - single line comment
// /* */ - multiline comment


package com.company;

public class Main {

    public static void main(String[] args) {
        // primitive
        int firstNumber; // variable declaration
        long secondNumber;

//        firstNumber = 5; // initialization
        secondNumber = 6;
        firstNumber = (int)secondNumber;
//        secondNumber = firstNumber;

        float thirdNumber = 5.5f;
        double fourthNumber = 5.3434;

        char myChar = 'a';
        char mySecondChar = '2';

        boolean trueOrFalse = true;
        boolean tenNotFour = 10 != 4; // true
        boolean fiveGreaterEight = 5 > 8; // false
        boolean fourEqualThree = 4 == 3; // false

        String myString = "hello";


//        System.out.println(firstNumber + secondNumber);
//        System.out.println(firstNumber - secondNumber);
//        System.out.println(firstNumber * secondNumber);
//        System.out.println(firstNumber / secondNumber);
//        System.out.println(firstNumber % secondNumber);

//        System.out.println(5.0f / 2);

//        System.out.println(5 > 2); // true
//        System.out.println(2 > 5); // false
//        System.out.println(tenNotFour); // true

//        System.out.println(tenNotFour && trueOrFalse);

//        System.out.println(fiveGreaterEight || fourEqualThree);

//        if (tenNotFour) {
//            System.out.println("Ten is not four");
//        }
//
//        if (!fiveGreaterEight) { // false
//            System.out.println("Five is Greater than Eight");
//        } else {
//            System.out.println("Eight is greater than or equal five");
//        }

//        if (tenNotFour) {
//            System.out.println("Ten is not four");
//        } else if (fiveGreaterEight) {
//            System.out.println("Five is Greater than Eight");
//        }

/*        String option = "A";

        switch (option) {
            case "A":
            case "B":
            case "C":
            case "D":
                System.out.println("option is " + option);
                break;
            default:
                System.out.println("Invalid option");
                break;

        }*/

//        System.out.println("my fav number is " + 5);
        System.out.println("5" + 5);
    }
}


