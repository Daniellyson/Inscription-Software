package informations;

import listener.WindowListener;
import principal.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Help extends JFrame {
    private JPanel helpPanel;
    private JLabel helpText;

    private JButton backToMainWindow;

    private Container container;

   public Help() {
       super("Help");

       setBounds(50, 50, 600, 400);

       addWindowListener(new WindowListener());

       helpText = new JLabel("Go to the student secretariat to get help !");
       helpText.setFont(new Font("Times New Roman", Font.BOLD, 20));
       helpText.setHorizontalAlignment(SwingConstants.CENTER);

       backToMainWindow = new JButton("Go Back to the Main window");
       backToMainWindow.setHorizontalAlignment(SwingConstants.CENTER);

       helpPanel = new JPanel(new BorderLayout());

       helpPanel.add(helpText, BorderLayout.CENTER);
       helpPanel.add(backToMainWindow, BorderLayout.SOUTH);

       container = this.getContentPane();
       container.add(helpPanel);

       backToMainWindow.addActionListener(new ControlerListener());
   }

    private class ControlerListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            dispose();
            new MainWindow();
        }

    }
}
