package week4;

import java.util.ArrayList;

/**
 *
 * @author huy
 */
public class Main {
    public static void menu() {
        System.out.println(" 1. Add Student");
        System.out.println(" 2. Find and Sort");
        System.out.println(" 3. Update/Delete");
        System.out.println(" 4. Report");
        System.out.println(" 5. Exit");
        System.out.print(" Enter your choice: ");
    }

    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        
        // Thêm dữ liệu mẫu
        manageStudent.addStudent(new Student("1", "Pham Ngoc Hoa", "Spring", "Java"));
        manageStudent.addStudent(new Student("2", "Do Quang Hiep", "Summer", ".Net"));
        manageStudent.addStudent(new Student("3", "Nguyen Xuan Cuong", "Spring", "C/C++"));

        // Vòng lặp cho menu
        while (true) {
            menu();
            int choice = Validation.checkInputIntLimit(1, 5);

            switch (choice) {
                case 1:
                    // Thêm sinh viên mới
                    System.out.print("Enter ID: ");
                    String id = Validation.checkInputString();
                    System.out.print("Enter Name: ");
                    String name = Validation.checkInputString();
                    System.out.print("Enter Semester: ");
                    String semester = Validation.checkInputString();
                    System.out.print("Enter Course: ");
                    String course = Validation.checkInputCourse();

                    Student newStudent = new Student(id, name, semester, course);
                    if (manageStudent.addStudent(newStudent)) {
                        System.out.println("Student added successfully!");
                    } else {
                        System.out.println("Student already exists!");
                    }
                    break;

                case 2:
                    // Tìm kiếm và sắp xếp
                    System.out.print("Enter name to search: ");
                    String searchName = Validation.checkInputString();
                    ArrayList<Student> foundStudents = (ArrayList<Student>) manageStudent.searchByName(searchName);
                    
                    if (foundStudents.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        manageStudent.sortStudent();
                        System.out.println("Sorted students:");
                        for (Student s : foundStudents) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    // Cập nhật hoặc xóa sinh viên
                    System.out.print("Enter student ID to update/delete: ");
                    String updateId = Validation.checkInputString();
                    System.out.print("Do you want to update (U) or delete (D)? ");
                    boolean isUpdate = Validation.checkInputUD();
                    
                    if (isUpdate) {
                        System.out.print("Enter new Name: ");
                        String newName = Validation.checkInputString();
                        System.out.print("Enter new Semester: ");
                        String newSemester = Validation.checkInputString();
                        System.out.print("Enter new Course: ");
                        String newCourse = Validation.checkInputCourse();

                        Student updatedStudent = new Student(updateId, newName, newSemester, newCourse);
                        if (manageStudent.update(updatedStudent) == 1) {
                            System.out.println("Student updated successfully.");
                        } else {
                            System.out.println("Update failed. Student ID not found.");
                        }
                    } else {
                        if (manageStudent.deleteStudent(updateId) == 1) {
                            System.out.println("Student deleted successfully.");
                        } else {
                            System.out.println("Student ID not found.");
                        }
                    }
                    break;

                case 4:
                    // Báo cáo thống kê
                    manageStudent.reportStudent();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }
}
