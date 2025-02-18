/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author huy
 */
public class Course {
    protected String courseId;
    protected String courseName;
    protected int credits;

    public Course() {
        courseId = "";
        courseName = "";
        credits = 0;
    }

    public void inputAll(String id, String cn, int cr){
        courseId=id;
        courseName=cn;
        credits=cr;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
    
    
   
    
}
