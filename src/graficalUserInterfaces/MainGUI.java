package graficalUserInterfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 159, 149);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UserGUI user = new UserGUI(frame);                       //User GUI
				user.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnNewUser.setBackground(Color.LIGHT_GRAY);
		btnNewUser.setBounds(10, 11, 124, 23);
		frame.getContentPane().add(btnNewUser);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClubLogin clubLogin = new ClubLogin(frame);
				clubLogin.getFrame().setVisible(true);
				frame.disable();
			}
		});
		btnAdminLogin.setBackground(Color.LIGHT_GRAY);
		btnAdminLogin.setBounds(10, 45, 124, 23);
		frame.getContentPane().add(btnAdminLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnCancel.setBackground(Color.LIGHT_GRAY);
		btnCancel.setBounds(10, 79, 124, 23);
		frame.getContentPane().add(btnCancel);
		
		
	}
	public JFrame getFrame(){
		return frame;
	}
}
