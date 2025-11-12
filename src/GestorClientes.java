import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GestorClientes extends Thread {
    Socket socket;
    public GestorClientes(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);) {
            while (true) {
                String linea = reader.readLine();
                if (linea == null || linea.equalsIgnoreCase("adios")) {
                    break;
                }
                writer.println("ECO: " + linea);
            }

        } catch (IOException e) {
            System.out.println("Fallo a nivel de Sockets");
        }
    }
}
