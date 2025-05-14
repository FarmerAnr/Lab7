
import java.awt.*;
import javax.swing.*;

public class RegisterBookScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ном бүртгэх");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        JLabel titleLabel = new JLabel("Номын нэр:");
        JTextField titleField = new JTextField();
        JLabel authorLabel = new JLabel("Зохиолч:");
        JTextField authorField = new JTextField();
        JLabel yearLabel = new JLabel("Он:");
        JTextField yearField = new JTextField();

        JButton registerButton = new JButton("Бүртгэх");

        registerButton.addActionListener(e -> {
            System.out.println("Successfully registered!");
        });

        frame.add(titleLabel);
        frame.add(titleField);
        frame.add(authorLabel);
        frame.add(authorField);
        frame.add(yearLabel);
        frame.add(yearField);
        frame.add(new JLabel());
        frame.add(registerButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
