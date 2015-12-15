package graficalUserInterfaces;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JCheckBox;

public class ClubLogin  {

	private JFrame frame;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public ClubLogin(JFrame parentFrame) {

		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 251, 164);
		frame.getContentPane().setLayout(null);
		WindowListener exitListener = new WindowAdapter() {
		    @Override
		    public void windowClosing(WindowEvent e) {
		        parentFrame.enable();
		    	frame.dispose();
		    }
		};
		frame.addWindowListener(exitListener);
		
		//TextFields ----------------------------------------------------------------------- TextFields//
		txtUsername = new JTextField();
		txtUsername.setBounds(91, 11, 130, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		CreateStandardTextfield(txtUsername, "username", "");
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(91, 44, 130, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		CreateStandardTextfield(txtPassword, "password", "");
		
		
		//Labels ----------------------------------------------------------------------- Labels//
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsername.setForeground(Color.LIGHT_GRAY);
		lblUsername.setBounds(10, 11, 71, 14);
		frame.getContentPane().add(lblUsername);
		lblUsername.setFocusable(true);
		
		
		JLabel lblPasswort = new JLabel("Password");
		lblPasswort.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPasswort.setForeground(Color.LIGHT_GRAY);
		lblPasswort.setBounds(10, 45, 71, 14);
		frame.getContentPane().add(lblPasswort);
		
		JLabel lblWrongLogin = new JLabel("Wrong Login Credentials!");
		lblWrongLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWrongLogin.setForeground(Color.RED);
		lblWrongLogin.setBounds(10, 96, 180, 26);
		frame.getContentPane().add(lblWrongLogin);
		lblWrongLogin.setVisible(false);
		
		//Buttons ----------------------------------------------------------------------- Buttons//
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBackground(Color.LIGHT_GRAY);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("Admin")&&txtPassword.getText().equals("123456")){
					ClubGUI club = new ClubGUI(frame);
					frame.dispose();
					club.getFrame().setVisible(true);
				}else{
					lblWrongLogin.setVisible(true);
				}
			}
		});
		btnSubmit.setBounds(10, 73, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancel.setForeground(new Color(0, 0, 0));
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(132, 73, 89, 23);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				parentFrame.enable();
				frame.dispose();
			}
		});
		frame.getContentPane().add(btnCancel);
		
		//Action Listener for textfields ----------------------------------------------------------------blablabla//
		txtUsername.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPassword.grabFocus();
			}
		});
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnSubmit.doClick();
			}
		});
		
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
	public JFrame getFrame(){
		return frame;
	}
}
