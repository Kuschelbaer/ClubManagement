package graficalUserInterfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.TextField;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Button;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;

import clubClasses.DateLabelFormatter;

import org.jdatepicker.*;
import javax.swing.JCheckBox;

public class UserGUI {

	private JFrame frame;
	private JTextField txtFirstname;
	private JTextField txtLastname;
	private JTextField txtCountry;
	private JTextField txtCity;
	private JTextField txtStreet;
	private JButton btnSubmit;
	private JButton btnCancel;
	private int i = 0;
	private JTextField txtIBAN;
	private JCheckBox chckbxNewCheckBox;
	private JTextField txtEMail;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserGUI window = new UserGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 *//*
	public UserGUI() {
		initialize();
	}*/

	/**
	 * Initialize the contents of the frame.
	 */
	public UserGUI(JFrame parentFrame) {
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 323, 454);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//TextFields ----------------------------------------------------------------------- TextFields//
		txtFirstname = new JTextField();
		frame.getContentPane().add(txtFirstname);
		txtFirstname.setBounds(10, 36, 140, 20);
		CreateStandardTextfield(txtFirstname, "firstname", "Lastname");
		
		txtLastname = new JTextField();
		frame.getContentPane().add(txtLastname);
		txtLastname.setBounds(10, 67, 140, 20);
		CreateStandardTextfield(txtLastname,"lastname","Lastname");
		
		txtEMail = new JTextField();
		txtEMail.setBounds(10, 98, 140, 20);
		frame.getContentPane().add(txtEMail);
		CreateStandardTextfield(txtEMail, "email", "E-Mail");
		
		
		txtCountry = new JTextField();
		frame.getContentPane().add(txtCountry);
		txtCountry.setBounds(10, 129, 140, 20);
		CreateStandardTextfield(txtCountry, "country", "Country");
		
		txtCity = new JTextField();
		frame.getContentPane().add(txtCity);
		txtCity.setBounds(10, 160, 140, 20);
		CreateStandardTextfield(txtCity, "city", "City");
		
		txtStreet = new JTextField();
		frame.getContentPane().add(txtStreet);
		txtStreet.setBounds(10, 191, 140, 20);
		CreateStandardTextfield(txtStreet, "street", "Street");
		
		txtIBAN = new JTextField();
		frame.getContentPane().add(txtIBAN);
		txtIBAN.setBounds(10, 282, 140, 20);
		CreateStandardTextfield(txtIBAN, "iban", "IBAN Number for Bank Actions");
		
		
		UtilDateModel model = new UtilDateModel();
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl natalDayPanel = new JDatePanelImpl(model,p);
		JDatePickerImpl natalDayPicker = new JDatePickerImpl(natalDayPanel, new DateLabelFormatter());
		natalDayPicker.setBackground(Color.LIGHT_GRAY);
		natalDayPicker.getJFormattedTextField().setFont(new Font("Tahoma", Font.BOLD, 11));
		natalDayPicker.getJFormattedTextField().setForeground(new Color(0, 0, 0));
		natalDayPicker.getJFormattedTextField().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(natalDayPicker);
		natalDayPicker.setBounds(10, 248, 140, 23);
		
		//Labels ----------------------------------------------------------------------- Labels//
		JLabel lblRegistration = new JLabel("Registration");
		lblRegistration.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRegistration.setForeground(Color.LIGHT_GRAY);
		lblRegistration.setBounds(10, 11, 140, 23);
		frame.getContentPane().add(lblRegistration);
		lblRegistration.setFocusable(true);
		
		//Buttons ----------------------------------------------------------------------- Buttons//
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.setBounds(10, 382, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(109, 382, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JCheckBox ckbxStudent = new JCheckBox("Student?");
		ckbxStudent.setForeground(Color.LIGHT_GRAY);
		ckbxStudent.setBackground(Color.DARK_GRAY);
		ckbxStudent.setBounds(10, 218, 97, 23);
		frame.getContentPane().add(ckbxStudent);
		
		
		
		chckbxNewCheckBox = new JCheckBox("<html>I've read and accepted <br/>the User Agreement</html>");
		chckbxNewCheckBox.setForeground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBackground(Color.DARK_GRAY);
		chckbxNewCheckBox.setBounds(10, 342, 295, 33);
		frame.getContentPane().add(chckbxNewCheckBox);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		lblRegistration.grabFocus();
		
	}
	
	
	private void CreateStandardTextfield(JTextField textfield,String name,String toolTipp){
		textfield.setToolTipText("");
		textfield.setText(name);
		textfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
		textfield.setForeground(Color.GRAY);
		textfield.setBackground(Color.LIGHT_GRAY);
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent gainedFocus) {
				if(textfield.getText().equals(name)){
					textfield.setText("");
					textfield.setFont(new Font("Tahoma", Font.BOLD, 11));
					textfield.setForeground(Color.BLACK);
					textfield.setHorizontalAlignment(JTextField.LEFT);
				}
			}
			@Override
			public void focusLost(FocusEvent lostFocus) {
				if(textfield.getText().equals("")){
					textfield.setText(name);
					textfield.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 10));
					textfield.setForeground(Color.GRAY);
					textfield.setHorizontalAlignment(JTextField.CENTER);
				}
			}
		});
	}
	private void ShownPasswordDialog(){
		Object[] options = {"Submit",
        "Cancel"};
		JTextField username = new JTextField();
		username.setBackground(Color.LIGHT_GRAY);
		JPasswordField password = new JPasswordField();
		password.setBackground(Color.LIGHT_GRAY);
		JComponent[] inputs = new JComponent[] {
				new JLabel("Username"),
				username,
				new JLabel("Password"),
				password
		};
		JOptionPane.showOptionDialog(null, inputs, "Admin Login", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	}
	public JFrame getFrame(){
		return frame;
	}
}
