/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author huy
 */
public class ManageStudent {

    private List<Student> studentList = new ArrayList<>();

    private boolean checkStudent(Student std) {
        for(Student s : studentList){
            if(s.getSemester().equals(std.getSemester())){
                if(s.getCourseName().equals(std.getCourseName())){
                    return false;
                }
            }
        }
        //kiểm tra student đã có trong list chưa, nếu chưa có  thì trả về true còn nếu có rồi thì trả về false
        return true;
    }

    public boolean addStudent(Student std) {
        if (checkStudent(std)) {
            studentList.add(std);
            return true;
        }
        return false;
    }

    public void showStudent() {
        for (Student std : studentList) {
            System.out.println(std.toString());
        }
    }

    public List<Student> searchByName(String name) {
        List<Student> listStd = new ArrayList<>();
        //viet code
        for(Student std: studentList){
            if(std.getName().equalsIgnoreCase(name)){
                listStd.add(std);
            }
        }
        return listStd;
    }

    public int deleteStudent(String id) {
        //viet code 
        for (Student std : studentList) {
            if (std.getId().equals(id)) {
                studentList.remove(std);
                return 1; // Successfully deleted
            }
        }
        return 0;
    }

    public int update(Student std) {

        return 0;
    }

    public void sortStudent() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student std1, Student std2) {
                return std1.getName().compareToIgnoreCase(std2.getName());
            }
        });
    }
    public void reportStudent(){
        Map<String, Integer> report= new HashMap<>();
        for(Student st: studentList){
            String key= st.getId()+"|"+st.getName()+"|"+st.getCourseName();
            report.put(key, report.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<String,Integer> entry:report.entrySet()){
            System.out.println(entry.getKey()+"|"+entry.getValue());
        }
    }
}
