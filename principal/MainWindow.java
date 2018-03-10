package principal;

import informations.Help;
import informations.InfosIesn;
import inscription.EnrolmentForm;
import listener.WindowListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


public class MainWindow extends JFrame {

    private Container container;

    private JMenuBar menuBar;

    private JMenu applicationMenu;
    private JMenuItem exit;

    private JMenu studentMenu;
    private JMenuItem studentInscription;

    private JMenu infosMenu;
    private JMenuItem iesn;
    private JMenuItem help;

    public MainWindow() {

        super("College");

        setUpMenu();
        setUpMainWindow();

        setVisible(true);
    }

    public void setUpMenu() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        //APPLICATION
        applicationMenu = new JMenu("Application");
        applicationMenu.setMnemonic('a');
        menuBar.add(applicationMenu);

        exit = new JMenuItem("Exit");
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
        applicationMenu.add(exit);

        //STUDENT
        studentMenu = new JMenu("Student");
        studentMenu.setMnemonic('s');
        menuBar.add(studentMenu);

        studentInscription = new JMenuItem("Inscription");
        studentMenu.add(studentInscription);

        //TO DO Inscription

        //INFORMATIONS
        infosMenu = new JMenu("Informations");
        infosMenu.setMnemonic('i');
        menuBar.add(infosMenu);

        iesn = new JMenuItem("IESN");
        infosMenu.add(iesn);

        help = new JMenuItem("Help");
        infosMenu.add(help);

        //Sending information to controler
        ControlerListener controlerEvent = new ControlerListener();
        exit.addActionListener(controlerEvent);
        iesn.addActionListener(controlerEvent);
        help.addActionListener(controlerEvent);
        studentInscription.addActionListener(controlerEvent);
    }

    public void setUpMainWindow() {
        setBounds(100, 50, 400, 500);

        WelcomePanel welcomePanel = new WelcomePanel();

        addWindowListener(new WindowListener());

        container = this.getContentPane();
        container.add(welcomePanel);
    }

    private class ControlerListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == exit) {
                System.exit(0);
            }
            if(event.getSource() == iesn) {
                container.removeAll();
                container.add(new InfosIesn());
                container.revalidate();
                //container.repaint();
            }
            if(event.getSource() == help) {
                dispose();
                Help helpPanel = new Help();
                helpPanel.setVisible(true);
            }
            if(event.getSource() == studentInscription){
                container.removeAll();
                container.add(new EnrolmentForm());
                container.revalidate();
            }
        }
    }
}


