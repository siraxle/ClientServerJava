import java.net.*;
import java.io.*;

public class Server {
  public static void main(String[] args) throws IOException {

    ServerSocket serverSocket = new ServerSocket(8000);
    int count = 0;
    while (true) {
      Socket clientSocket = serverSocket.accept();
      //clientSocket.getOutputStream().write("<h2>Hello</h2>".getBytes());
      System.out.println("client accepted" + (count++));
      OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
      writer.write("HTTP/1.0 200 OK\r\n" +
              "Content-type: text/html\r\n"+
              "\r\n"+
              "<h1>Java</h1>\r\n");
      writer.flush();
      writer.close();
      clientSocket.close();
    }
    //serverSocket.close();
  }
}
