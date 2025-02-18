package week1;

import java.util.Scanner;

public class TestLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int arraySize = sc.nextInt();

        LinearSearch ls = new LinearSearch(arraySize); // Use correct class name
        ls.addValue();
        
        System.out.println("Generated array:");
        ls.displayValue(); // Display the randomly generated values

        System.out.println("Enter value to search:");
        int valueToSearch = sc.nextInt();

        int resultIndex = ls.searchValue(valueToSearch);
        if (resultIndex != -1) {
            System.out.println("Value " + valueToSearch + " found at index: " + resultIndex);
        } else {
            System.out.println("Value " + valueToSearch + " not found in the array.");
        }   

        sc.close(); // Corrected variable name
    }
}
