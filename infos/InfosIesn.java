package informations;

import javax.swing.*;
import java.awt.*;

public class InfosIesn extends JPanel {
    private JLabel text;

    public InfosIesn() {

        text = new JLabel("<html> <br> <b>Contact details: </b> <br><br>" +
                "Address : Street Neverland, 0 - 0000 Belgium<br>" +
                "Tel : +32 (0)00 00 00 00<br>" +
                "Web site : www.website.be</html>");
        text.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        text.setHorizontalAlignment(SwingConstants.CENTER);

        this.setLayout(new BorderLayout());

        this.add(text, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
