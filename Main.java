package tuan8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Student
        Student student = new Student("Nguyen Van A", 20);
        
        // Thực hiện tuần tự hóa và ghi vào tệp tin
        try {
            FileOutputStream fileOut = new FileOutputStream("student.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student); // Tuần tự hóa đối tượng và ghi vào tệp tin
            fileOut.close();
            System.out.println("Da tuan tu hoa va ghi vao tep tin.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Đọc từ tệp tin và giải tuần tự hóa đối tượng
        try {
            FileInputStream fileIn = new FileInputStream("student.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            // Ép kiểu đối tượng về kiểu Student
            Student sttFromFile = (Student) in.readObject(); // Giải tuần tự hóa đối tượng từ tệp tin
            in.close();
            fileIn.close();
            System.out.println("Doi tuong dang duoc doc tu tep tin.");
            System.out.println("Ten: " + sttFromFile.getName());
            System.out.println("Tuoi: " + sttFromFile.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
