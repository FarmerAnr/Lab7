
import java.awt.*;
import javax.swing.*;

public class BookListScreen {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Номын жагсаалт");
        frame.setSize(300, 200);

        String[] books = {"Clean Code", 
        "Java Basics", 
        "Data Structures",
        "Effective Java",
        "Design Patterns",
        "Introduction to Algorithms",
        "Thinking in Java",
        "Head First Java",
        "The Pragmatic Programmer",
        "Java Concurrency in Practice",
        "Refactoring",
        "Spring in Action",
        "Cracking the Coding Interview",
        "Algorithms Unlocked",
        "Computer Networking: A Top-Down Approach"};
        JList<String> bookList = new JList<>(books);
        JScrollPane scrollPane = new JScrollPane(bookList);

        JButton selectButton = new JButton("Сонгох");
        selectButton.addActionListener(e -> {
            System.out.println("Chosen book: " + bookList.getSelectedValue());
        });

        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(selectButton, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
