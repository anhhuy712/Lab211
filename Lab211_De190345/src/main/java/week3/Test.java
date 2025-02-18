/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author huy
 */
public class Test {
    public static void main(String[] args) {
        MangSoNguyen mangSoNguyen= new MangSoNguyen(Utilizer.checkNumber());
        mangSoNguyen.addValue();
        mangSoNguyen.showValue();
        mangSoNguyen.sortValue();
        mangSoNguyen.quickSort(mangSoNguyen.getArray(), 0, mangSoNguyen.getArray().length);
        mangSoNguyen.showValue();
    }
}
