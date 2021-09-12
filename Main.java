import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int choice = Integer.parseInt(JOptionPane.showInputDialog("1 for server | 2 for client"));
        if (choice == 1) {
            new Server();
        } else {
            Client client = new Client("id113");
            client.run();
        }
    }
}
