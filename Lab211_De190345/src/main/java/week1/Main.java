/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Converter converter = new Converter();
        
        while (true) {
            int choice = converter.menu();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter binary number: ");
                    String binary = sc.next();
                    converter.convertFromBinary(binary);
                }
                case 2 -> {
                    System.out.print("Enter decimal number: ");
                    String decimal = sc.next();
                    converter.convertFromDecimal(decimal);
                }
                case 3 -> {
                    System.out.print("Enter hexadecimal number: ");
                    String hexa = sc.next();
                    converter.convertFromHexa(hexa);
                }
                case 4 -> {
                    System.out.println("Exiting program...");
                    return;
                }
            }
        }
    }
}
