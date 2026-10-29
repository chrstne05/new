/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;
import javax.sound.midi.SoundbankResource;

/**
 *
 * @author ROBILLOS_CPE113
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int number = input.nextInt();

        System.out.println();
        System.out.println("--------------- ");
        System.out.print("Answer: ");
        System.out.println(value(number));
        System.out.println("--------------- ");
        System.out.println();
        System.out.println();
        System.out.println("======Triangle Length======");
  
        System.out.print("Enter side a: ");
        int sidea = input.nextInt();
        
        System.out.println();
        System.out.print("Enter side b: ");
        int sideb = input.nextInt();
        
        System.out.println();
        System.out.print("Enter side c: ");
        int sidec = input.nextInt();
        System.out.println("===========================");
        
        System.out.println();
        System.out.println("--------------- ");
        System.out.print("Answer: ");
        System.out.println(classifyTriangle(sidea,sideb,sidec));
        System.out.println("--------------- ");
        
    }

    static int value(int number) {
        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    static int classifyTriangle(int sidea, int sideb, int sidec) {
        if (sidea == sideb && sideb == sidec) {
            return 1;
        } else if (sidea == sideb || sideb == sidec || sidec == sidea) {
            return 2;
        } else {
            return 3;
        }
    }
}
