package informations;

import javax.swing.*;
import java.awt.*;

public class InfosIesn extends JPanel {
    private JLabel text;
	
	private JLabel webLabel;

    public InfosIesn() {
        webLabel = new JLabel("www.website.com");

        text = new JLabel("<html> <br> <b> Contact details </b> <br><br>" +
                "Address : Street de la Pluie, 00 - 0000 Belgium<br>" +
                "Tel : +32 (0)00 00 00 00<br>" +
                "Web site : <a href=" + webLabel + "> www.site.com </a> </html>");
        text.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        text.setHorizontalAlignment(SwingConstants.CENTER);

        this.setLayout(new BorderLayout());

        this.add(text, BorderLayout.NORTH);

        this.setVisible(true);
    }
}
