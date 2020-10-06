import java.net.*;
import java.io.*;

public class Server {
  public static void main(String[] args) throws IOException {

    ServerSocket serverSocket = new ServerSocket(8000);
    while (true) {
      Socket clientSocket = serverSocket.accept();
      //clientSocket.getOutputStream().write("<h2>Hello</h2>".getBytes());
      System.out.println("client accepted");
      OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
      writer.write("<h1>Java</h1>");
      writer.flush();
      clientSocket.close();
    }
    //serverSocket.close();
  }
}
