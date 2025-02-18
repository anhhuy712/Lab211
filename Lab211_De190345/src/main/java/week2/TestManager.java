/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author huy
 */
public class TestManager {
    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Manager.mennu();
            switch (choice) {
                case 1 -> Manager.normalCalculator();
                case 2 -> Manager.BMICalculator();
                case 3 -> {
                    return;
                }
            }
        }

    }
}
