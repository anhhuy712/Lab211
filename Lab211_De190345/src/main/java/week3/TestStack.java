/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author huy
 */
public class TestStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Push values to the stack
        for (int i = 0; i < list.length; i++) {
            myStack.push(list[i]);
        }
//        Pop values out from the stack
        myStack.pop();
//        Get values from the stack
        for (int i = 0; i < 3; i++) {
            myStack.get(i);
        }
    }
}
