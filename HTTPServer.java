import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class HTTPServer {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java HTTPServer.jar [port]");
            return;
        }
        int port = Integer.parseInt(args[0]);

        try {
            final ServerSocket server = new ServerSocket(port);
            System.out.println("Listening for connection on port " + port + " ....");
            ;
            while (true) {
                // 1. Read HTTP request

                Socket clientSocket = server.accept();

                // 1.5 Get client Information
                InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
                BufferedReader reader = new BufferedReader(isr);

                String line = reader.readLine();
                while (!line.isEmpty()) {
                    System.out.println(line);
                    line = reader.readLine();
                }

                // 2. Prepare HTTP response

                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;

                // 3. Send HTTP response

                clientSocket.getOutputStream().write(httpResponse.getBytes("UTF-8"));

                // 4. Close Client

                clientSocket.close();
            }
        } catch (Exception e) {
            // Exception handling
            e.printStackTrace();
        }
    }
}
