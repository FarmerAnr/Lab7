import java.awt.*;
import javax.swing.*;

public class LoginScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Нэвтрэх цонх");
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("   Хэрэглэгч:");
        JTextField userText = new JTextField();
        JLabel passLabel = new JLabel("   Нууц үг:");
        JPasswordField passText = new JPasswordField();

        JButton loginButton = new JButton("Нэвтрэх");

        loginButton.addActionListener(e -> {
            String username = userText.getText();
            System.out.println("Entered user: " + username);
        });

        frame.add(userLabel);
        frame.add(userText);
        frame.add(passLabel);
        frame.add(passText);
        frame.add(new JLabel()); 
        frame.add(loginButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
