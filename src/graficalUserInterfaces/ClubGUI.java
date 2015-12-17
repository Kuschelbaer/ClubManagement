package graficalUserInterfaces;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bankClasses.BankAcountAction;
import bankClasses.BankAcountData;
import bankClasses.BankConnector;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClubGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClubGUI frame = new ClubGUI();
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
	public ClubGUI(JFrame parentFrame) {
		
		frame = new JFrame();
		frame.setBackground(Color.DARK_GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Admin user");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(132, 103, 190, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAcountActions = new JButton("show Bank Actions");
		btnAcountActions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BankConnector connect = new BankConnector();
				BankAcountData bankAcount = new BankAcountData(null, null, null, null, null, null, null, null);
				BankAcountAction[] actions = connect.getAcountActions(bankAcount);
				for (BankAcountAction bankAcountAction : actions) {
					System.out.println(bankAcountAction.getActionDate() + " : " + bankAcountAction.getActionUsage() + " : " + bankAcountAction.getActionSum());
				}
				System.out.println("==================================");
			}
		});
		btnAcountActions.setBounds(10, 11, 143, 23);
		frame.getContentPane().add(btnAcountActions);
	}
	public JFrame getFrame(){
		return frame;
	}
}
