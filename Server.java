package tuan8;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server dang chay.....");
            while (true) {
                Socket socket = serverSocket.accept(); // Wait for a client connection
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                
                // Tạo một đối tượng Student
                Student student = new Student("Tran Van B", 21);
                
                // Ghi đối tượng và truyền qua mạng
                oos.writeObject(student);
                
                // Đóng ObjectOutputStream, nhưng không đóng Socket
                oos.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
