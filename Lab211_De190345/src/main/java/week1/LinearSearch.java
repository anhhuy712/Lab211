package week1;

import java.util.Random;

public class LinearSearch {

    private int[] array;

    public LinearSearch(int n) {
        this.array = array;
    }

    void addValue() {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length);
        }

    }

    void displayValue() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.err.println();
    }

    int searchValue(int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i; // Return the index if the value is found
            }
        }
        return -1; // Return -1 if the value is not found
    }
}
