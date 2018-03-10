package principal;

import javax.swing.*;
import java.awt.*;

public class WelcomePanel extends JPanel {

    private JLabel welcomeMessage;

    public WelcomePanel() {
        welcomeMessage = new JLabel("Welcome to my software");
        welcomeMessage.setFont(new Font("Times New Roman", Font.BOLD, 35));
        welcomeMessage.setForeground(Color.BLUE);
        welcomeMessage.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(new BorderLayout());
        this.add(welcomeMessage, BorderLayout.CENTER);
    }
}
