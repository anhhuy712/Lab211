/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author huy
 */
public class OnlineCourse extends Course{
    private String platform;
    private String instructors;
    private String note;

    public OnlineCourse() {
        super();
        platform="";
        instructors="";
        note="";
    }

    @Override
    public String toString() {
        return super.toString()     + "OnlineCourse{" + "platform=" + platform + ", instructors=" + instructors + ", note=" + note + '}';
    }
    
    
    
    public void inputAll(String pf, String ins, String n, String cId, String cn, int cr){
        super.inputAll(cId, cn, cr);
        platform=pf;
        instructors=ins;
        note=n;
    }
}
