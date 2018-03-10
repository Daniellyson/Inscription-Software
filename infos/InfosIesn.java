package informations;

import javax.swing.*;
import java.awt.*;

public class InfosIesn extends JPanel {
    private  JLabel title;
    private JLabel text;

    public InfosIesn() {

        title = new JLabel("Contact details");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));

        text = new JLabel("<html>Address : Street Neverland, 00 - 0000 Belgium<br>" +
                "Tel : +32 (0)00 00 00 00<br>" +
                "Web site : www.henallux.be</html>");
        text.setFont(new Font("Times New Roman", Font.PLAIN, 25));

        title.setHorizontalAlignment(SwingConstants.CENTER);
        text.setHorizontalAlignment(SwingConstants.CENTER);

        this.setLayout(new BorderLayout());

        this.add(title, BorderLayout.NORTH);
        this.add(text, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
