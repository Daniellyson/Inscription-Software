package enrolment;

import principal.MainWindow;
import principal.WelcomePanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EnrolmentForm extends JPanel {
    private JPanel formPanel;
    private JPanel buttonPanel;

    private JLabel registrationNumberLabel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel birthdayLabel;
    private JLabel sectionLabel;

    private JTextField registrationNumber;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField birthday;
    private JTextField section;

    private JCheckBox scholarshipHolder;
    private JCheckBox foreign;

    private ActionCheckBox actionCheckBox;

    private JLabel originLabel;
    private JComboBox origin;

    private ButtonGroup enrolomentButtonGroup;
    private JRadioButton newStudent;
    private JRadioButton reEnrolment;

    private JButton returnButton;
    private JButton validationButton;
    private JButton resetButton;

    private Container container;

    public EnrolmentForm(Container container){

        formPanel = new JPanel(new GridLayout(8, 2, 10, 22));
        add(formPanel, BorderLayout.CENTER);

        buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 30));
        add(buttonPanel, BorderLayout.SOUTH);

        registrationNumberLabel = new JLabel("Registration Number: ");
        registrationNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(registrationNumberLabel);
        registrationNumber = new JTextField(15);
        formPanel.add(registrationNumber);
        registrationNumber.addActionListener(new ActionRegistrationNumber());


        firstNameLabel = new JLabel("First name:");
        firstNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(firstNameLabel);
        firstName = new JTextField(15);
        formPanel.add(firstName);


        lastNameLabel = new JLabel("Last name:");
        lastNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(lastNameLabel);
        lastName = new JTextField(15);
        formPanel.add(lastName);

        birthdayLabel = new JLabel("Birthday:");
        birthdayLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(birthdayLabel);
        birthday = new JTextField(15);
        formPanel.add(birthday);

        sectionLabel = new JLabel("Section:");
        sectionLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(sectionLabel);
        section = new JTextField(15);
        section.setEnabled(false);
        formPanel.add(section);

        //for the foreign, newStudent, scholarshipHolder
        actionCheckBox = new ActionCheckBox();

        scholarshipHolder = new JCheckBox("Scholarship Holder");
        formPanel.add(scholarshipHolder);
        scholarshipHolder.addItemListener(actionCheckBox);

        foreign = new JCheckBox("Foreign");
        formPanel.add(foreign);
        foreign.addItemListener(actionCheckBox);


        originLabel = new JLabel("Origin:");
        originLabel.setHorizontalAlignment(JLabel.RIGHT);
        formPanel.add(originLabel);

        String [] values = getListComboBox();

        origin = new JComboBox(values);
        formPanel.add(origin);
        origin.setEnabled(false);


        newStudent = new JRadioButton("New student");
        formPanel.add(newStudent);
        newStudent.addItemListener(actionCheckBox);

        reEnrolment = new JRadioButton("Re-enrolment");
        formPanel.add(reEnrolment);

        //Only one radio button at once
        enrolomentButtonGroup = new ButtonGroup();
        enrolomentButtonGroup.add(newStudent);
        enrolomentButtonGroup.add(reEnrolment);

        //Buttons South
        returnButton = new JButton("Return");
        buttonPanel.add(returnButton);
        returnButton.addActionListener(new ButtonsActionListener());

        validationButton = new JButton("Validation");
        buttonPanel.add(validationButton);
        validationButton.addActionListener(new ButtonsActionListener());

        resetButton = new JButton("Reset");
        buttonPanel.add(resetButton);
        resetButton.addActionListener(new ButtonsActionListener());

        this.container = container;
    }

    public String [] getListComboBox() {
        String [] values = {"Europe", "Africa", "Asia", "America", "Oceania"};
        return values;
    }
	
	private class ActionRegistrationNumber implements ActionListener {

		public void actionPerformed(ActionEvent event) {

			if(event.getSource() == registrationNumber) {
				int firstNumber = Character.getNumericValue(registrationNumber.getText().charAt(0));
				//int firstNumber = Integer.parseInt(registrationNumber.getText());
				//firstNumber /= 1000;
				switch (firstNumber) {
					case 1 :
						section.setText("Thechnologie de l'informatique");
						break;
					case 2 :
						section.setText("Matematique de gestion");
						break;
					case 3 :
						section.setText("Comptabilité");
						break;
					case 4 :
						section.setText("Marketing");
						break;
					case 5 :
						section.setText("Automation");
						break;
					case 6 :
						section.setText("Droit");
						break;
					case 7 :
						section.setText("Régendat");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Registration Number", "Error", JOptionPane.ERROR_MESSAGE);

				}
			}
		}
	}
	
	private class ActionCheckBox implements ItemListener {

        public void itemStateChanged(ItemEvent event) {
            if(event.getSource() == foreign) {
                if(event.getStateChange() == ItemEvent.SELECTED) {
                    origin.setEnabled(true);
                }
                else {
                    origin.setEnabled(false);
                }
            }
            if(event.getSource() == newStudent || event.getSource() == scholarshipHolder) {
                if(newStudent.isSelected() && scholarshipHolder.isSelected()) {
                    //Boolean test
                    JOptionPane.showMessageDialog(null, "Hello, you are invited to go to the secretariat",
                            "Information", JOptionPane.INFORMATION_MESSAGE);
                    scholarshipHolder.setSelected(true);
                }
            }
        }
    }
	
	private class ButtonsActionListener implements ActionListener {
		
		private boolean erase;

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == returnButton) {
                container.removeAll();

                WelcomePanel welcomePanel = new WelcomePanel();
                Images imageLogo = new Images();

                container.add(imageLogo.getImageLogo(), BorderLayout.NORTH);
                container.add(welcomePanel, BorderLayout.CENTER);
                setVisible(true);
                welcomePanel.revalidate();
            }
            if(event.getSource() == validationButton) {
                Student student;
                student = new Student(registrationNumber.getText(), firstName.getText(), lastName.getText(),
                        birthday.getText(), section.getText(), scholarshipHolder.isSelected(), foreign.isSelected(),
                        (String)origin.getSelectedItem());

                JOptionPane.showMessageDialog(null, student, "Student Enroled", JOptionPane.INFORMATION_MESSAGE,
                        images.getImageIconEnroled());
						
				erase = true;
            }
            if(event.getSource() == resetButton || erase) {
                registrationNumber.setText(null);
                firstName.setText(null);
                lastName.setText(null);
                birthday.setText(null);
                section.setText(null);
                scholarshipHolder.setSelected(false);
                foreign.setSelected(false);
                origin.setSelectedItem("Europe");
                newStudent.setSelected(false);
                reEnrolment.setSelected(false);
            }
        }
    }
}