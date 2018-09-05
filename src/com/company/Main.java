package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int userChoice = 0;
        boolean isValid = false;

        do {
            System.out.println("Choose the Area you wish to calculate");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Rectangle");

            userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    isValid = true;
                    SquareArea(input);
                    break;

                case 2:
                    isValid = true;
                    CircleArea(input);
                    break;

                case 3:
                    isValid = true;
                    TriangleArea(input);
                    break;

                case 4:
                    isValid = true;
                    RectangleArea(input);
                    break;

                 default:
                     System.out.println("Invalid Input. Please try again");

            }

        }while (!isValid);
    }

    private static void SquareArea(Scanner input){
        System.out.println("Enter the number of one of the sides");
        float side = input.nextFloat();
        float areaTotal = side * side;
        System.out.println("The area is " + areaTotal);

    }

    private static void CircleArea(Scanner input){
        System.out.println("Enter the radius");
        float radius = input.nextFloat();
        float areaTotal = radius * radius * 3.14159265358f;
        System.out.println("The Area is " + areaTotal);
    }

    private static  void TriangleArea(Scanner input){
        System.out.println("Enter the base");
        float base = input.nextFloat();
        System.out.println("Enter the height");
        float height = input.nextFloat();
        float areaTotal = 0.5f * base * height;
        System.out.println("The Area is " + areaTotal);
    }

    private  static void RectangleArea(Scanner input){
        System.out.println("Enter the width");
        float width = input.nextFloat();
        System.out.println("Enter the height");
        float height = input.nextFloat();
        float areaTotal = width * height;
        System.out.println("The Area is " + areaTotal);
    }



}
