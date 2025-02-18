package week4;

import java.util.ArrayList;
import java.util.Scanner;
import week4.Student;


public class Validation {

    private final static Scanner in = new Scanner(System.in);

    // Kiểm tra người dùng nhập số nguyên trong khoảng giới hạn
    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    // Kiểm tra người dùng nhập chuỗi không rỗng
    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Input cannot be empty!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    // Kiểm tra người dùng nhập Y/N
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input Y/N.");
            System.out.print("Enter again: ");
        }
    }

    // Kiểm tra người dùng nhập U/D (Update/Delete)
    public static boolean checkInputUD() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input U (Update) or D (Delete).");
            System.out.print("Enter again: ");
        }
    }

    // Kiểm tra khóa học hợp lệ
    public static String checkInputCourse() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Java") ||
                result.equalsIgnoreCase(".Net") ||
                result.equalsIgnoreCase("C/C++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++.");
            System.out.print("Enter again: ");
        }
    }

    // Kiểm tra sinh viên có tồn tại trong danh sách không
    public static boolean checkStudentExist(ArrayList<Student> ls, String id,
                                            String studentName, String semester, String courseName) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && studentName.equalsIgnoreCase(student.getName()) && semester.equalsIgnoreCase(student.getSemester()) && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    // Kiểm tra ID có tồn tại trong danh sách không
    public static boolean checkIdExist(ArrayList<Student> ls, String id, String name) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId()) && 
                !name.equalsIgnoreCase(student.getName())) {
                return false;
            }
        }
        return true;
    }
}
