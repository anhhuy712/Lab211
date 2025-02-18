/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.time.LocalDate;

/**
 *
 * @author huy
 */
public class OfflineCourse extends Course{
    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        super();
        begin =null;
        end = null;
        campus = "";
    }

    

    @Override
    public String toString() {
        return super.toString()+"OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }
    
    
    
    public void inputAll(int b, int e, String c, String ){
         begin=b;
         end =e;
         campus=c;
    }
    
}
