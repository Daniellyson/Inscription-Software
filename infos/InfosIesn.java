package informations;

import javax.swing.*;
import java.awt.*;

public class InfosIesn extends JPanel {
    private  JLabel title;
    private JLabel text;

    public InfosIesn() {

        title = new JLabel("Contact details : IESN");
        title.setFont(new Font("Times New Roman", Font.BOLD, 25));

        text = new JLabel("<html>Address : Street Joseph Calozet, 19 - 5000 Namur<br>" +
                "Tel : +32 (0)81 46 86 10<br>" +
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
