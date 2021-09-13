package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
    System.out.println("What is the room area in square ft? ");
    Scanner sc = new Scanner(System.in);
    int square_ft = Integer.parseInt(sc.nextLine());
    int square_feet_number = square_ft;
    int gallons = 0;
        while(square_ft > 0){
            square_ft = square_ft - 350;
                    gallons++;
        }
    System.out.println("You will need to purchase "+ gallons+ " gallons of paint to cover "+ square_feet_number+ " square feet.");

    }
}
