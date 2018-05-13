import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MTServer {
   static final int PORT = 9090;
   
   public static void main(String[] args) throws IOException {
      ServerSocket s = new ServerSocket(PORT);
      System.out.println("Server Started");
      try {
         while (true) {
            Socket socket = s.accept();
            try {
               new SOne(socket);
            }
            catch (IOException e) {
               socket.close();
            }
         }
      }
      finally {
         s.close();
      }
   }
} 