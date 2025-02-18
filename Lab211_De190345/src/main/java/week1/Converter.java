/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;


import java.util.Scanner;

public class Converter {

    public static final char[] hexDigits = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    private Scanner sc = new Scanner(System.in);

    // Hiển thị menu
    public int menu() {
        System.out.println("1. Convert From Binary.");
        System.out.println("2. Convert From Decimal.");
        System.out.println("3. Convert From Hexa.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        return checkInputIntLimit(1, 4);
    }

    // Hiển thị lựa chọn chuyển đổi
    public int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("1. Convert from " + from + " to " + toCase1);
        System.out.println("2. Convert from " + from + " to " + toCase2);
        System.out.print("Enter your choice: ");
        return checkInputIntLimit(1, 2);
    }

    // Chuyển đổi từ binary
    public void convertFromBinary(String binary) {
        int choice = displayConvert("binary", "decimal", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + convertBinaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertBinaryToHexa(binary));
                break;
        }
    }

    // Chuyển đổi từ decimal
    public void convertFromDecimal(String decimal) {
        int choice = displayConvert("decimal", "binary", "hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertDecimalToBinary(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertDecimalToHexa(decimal));
                break;
        }
    }

    // Chuyển đổi từ hexadecimal
    public void convertFromHexa(String hexa) {
        int choice = displayConvert("hexa", "binary", "decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertHexaToBinary(hexa));
                break;
            case 2:
                System.out.println("Decimal: " + convertHexaToDecimal(hexa));
                break;
        }
    }

    // Chuyển đổi từ binary sang decimal
    public String convertBinaryToDecimal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    // Chuyển đổi từ binary sang hexadecimal
    public String convertBinaryToHexa(String binary) {
        String decimal = convertBinaryToDecimal(binary);
        return convertDecimalToHexa(decimal);
    }

    // Chuyển đổi từ hexadecimal sang decimal
    public int convertHexaToDecimal(String hexadecimal) {
        return Integer.parseInt(hexadecimal, 16);
    }

    // Chuyển đổi từ hexadecimal sang binary
    public String convertHexaToBinary(String hexadecimal) {
        return Integer.toBinaryString(convertHexaToDecimal(hexadecimal));
    }

    // Chuyển đổi từ decimal sang binary
    public String convertDecimalToBinary(String decimal) {
        return Integer.toBinaryString(Integer.parseInt(decimal));
    }

    // Chuyển đổi từ decimal sang hexadecimal
    public String convertDecimalToHexa(String decimal) {
        int deci = Integer.parseInt(decimal);
        StringBuilder hexa = new StringBuilder();
        while (deci != 0) {
            hexa.insert(0, hexDigits[deci % 16]);
            deci /= 16;
        }
        return hexa.toString();
    }

    // Kiểm tra nhập số trong giới hạn cho trước
    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result >= min && result <= max) {
                    return result;
                }
                System.out.print("Please enter a number between " + min + " and " + max + ": ");
            } catch (NumberFormatException e) {
                System.out.print("Invalid input! Please enter an integer: ");
            }
        }
    }
}
