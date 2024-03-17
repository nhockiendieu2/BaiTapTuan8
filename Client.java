package tuan8;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            
            // Đọc đối tượng từ input stream
            Student s = (Student) ois.readObject();
            System.out.println("Da nhan doi tuong: " + s.getName() + " - " + s.getAge());
            
            // Đóng ObjectInputStream và Socket
            ois.close();
            socket.close();
               
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
