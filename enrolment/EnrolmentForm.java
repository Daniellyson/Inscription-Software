package enrolment;

import javax.swing.*;
import java.awt.*;


public class EnrolmentForm extends JPanel {
    private JPanel formPanel;
    private JPanel buttonPanel;

    //private Container container;

    private JLabel registrationNumberLabel;
    private JLabel firtNameLabel;
    private JLabel lastNameLabel;
    private JLabel birthdayLabel;
    private JLabel sectionLabel;

    private JTextField registrationNumber;
    private JTextField firtName;
    private JTextField lastName;
    private JTextField birthday;
    private JTextField section;

    private JCheckBox scholarshipHolder;
    private JCheckBox foreign;

    private JLabel originLabel;
    private JComboBox origin;

    private ButtonGroup enrolomentButtonGroup;
    private JRadioButton newEnrolment;
    private JRadioButton reEnrolment;


    public EnrolmentForm(){

        //setLayout(new BorderLayout());

        formPanel = new JPanel(new GridLayout(8, 2, 10, 15));
        add(formPanel, BorderLayout.CENTER);

        //TO DO buttonPanel

        registrationNumberLabel = new JLabel("Registration Number: ");
        registrationNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(registrationNumberLabel);
        registrationNumber = new JTextField(15);
        formPanel.add(registrationNumber);

        firtNameLabel = new JLabel("First name:");
        firtNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(firtNameLabel);
        firtName = new JTextField(15);
        formPanel.add(firtName);

        lastNameLabel = new JLabel("Last name:");
        lastNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(lastNameLabel);
        lastName = new JTextField(15);
        formPanel.add(lastName);

        birthdayLabel = new JLabel("Birthday:");
        birthdayLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(birthdayLabel);
        birthday = new JTextField();
        formPanel.add(birthday);

        sectionLabel = new JLabel("Section:");
        sectionLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(sectionLabel);
        section = new JTextField(15);
        formPanel.add(section);

        scholarshipHolder = new JCheckBox("Scholarship Holder");
        formPanel.add(scholarshipHolder);

        //TO DO Listener ↓↑

        foreign = new JCheckBox("Foreign");
        formPanel.add(foreign);

        originLabel = new JLabel("Origin:");
        originLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(originLabel);

        //TO DO Listener ↓↑

        String [] values = getListComboBox();

        origin = new JComboBox(values);
        formPanel.add(origin);

        newEnrolment = new JRadioButton("New Enrolment");
        formPanel.add(newEnrolment);

        //TO DO Listener ↓↑

        reEnrolment = new JRadioButton("Re-enrolment");
        formPanel.add(reEnrolment);

        //Only one radio button at once
        enrolomentButtonGroup = new ButtonGroup();
        enrolomentButtonGroup.add(newEnrolment);
        enrolomentButtonGroup.add(reEnrolment);


    }

    public String [] getListComboBox() {
        String [] values = {"Europe", "Africa", "Asia", "America", "Oceania"};
        return values;
    }
}
