package week1;

import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author PT360
 */
public class testWC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your content: ");
            String input = sc.nextLine();
            
            CountWC countWC = new CountWC(input);
            
            Map<String, Integer> wordCount = countWC.countWord();
            System.out.println("Word count: " + wordCount);
            
            Map<Character, Integer> charCount = countWC.countCharacter();
            System.out.println("Character count: " + charCount);
        }
    }
}
