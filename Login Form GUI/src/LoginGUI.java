import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class RegisterGUI{

}

public class LoginGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocation(500, 280);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(1, 1));
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);
        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(5);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(100, 100, 80, 25);
        panel.add(loginButton);
        loginButton.addActionListener( (ActionEvent e) -> {
String userName = userText.getText();
            String password = new String(passwordText.getPassword());
            System.out.println("Username: " + userName);
            System.out.println("Password: " + password);
            if (userName.equals("admin") && password.equals("admin")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        });

        JButton registerButton = new JButton("register");
        registerButton.setBounds(185, 100, 80, 25);
        panel.add(registerButton);
        registerButton.addActionListener( (ActionEvent e) -> {

        });
    }
}
