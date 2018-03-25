package images;

import javax.swing.*;
import java.awt.*;


public class Images extends JPanel {
    private ImageIcon imageIconEnroled;
    private ImageIcon imageLogo;

    public Images() {
        imageIconEnroled = new ImageIcon(("src/icons/check.png"));

        imageLogo = new ImageIcon("src/icons/logo.png");
    }

    public ImageIcon getImageIconEnroled() {
        return imageIconEnroled;
    }

    public JLabel getImageLogo() {

        JLabel labelLogo = new JLabel();
        labelLogo.setIcon(imageLogo);
        labelLogo.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(labelLogo, BorderLayout.CENTER);
        return labelLogo;
    }
}
