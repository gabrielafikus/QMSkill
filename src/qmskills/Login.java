package qmskills;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JTextField;

import booking.Booking;
import booking.BookingTutor;
import registration.Account;
import registration.register;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		username = new JTextField();
		username.setText("username");
		username.setBounds(165, 93, 80, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setText("password");
		password.setBounds(165, 136, 80, 20);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JButton Login = new JButton("Login");
		Login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String Pass = password.getText(); 
				String User = username.getText();
				Account acc = new Account();
				if(acc.getPassword().equals(Pass) && acc.getUserName().equals(User)) {
					if(acc.getUserRole().equals("Tutor")) {
						BookingTutor bt = new BookingTutor(); 
						BookingTutor.main(null);
					}else {
						Booking book = new Booking();
						Booking.main(null);
					} 
					
				}else {
					JOptionPane.showMessageDialog(null, "incorrect input");
				}
				
			}
		});
		Login.setBounds(96, 178, 89, 23);
		frame.getContentPane().add(Login);
		
		JButton Register = new JButton("Register");
		Register.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				register reg = new register();
				register.main(null);
			}
		});
		Register.setBounds(215, 178, 89, 23);
		frame.getContentPane().add(Register);
		
		JButton Close = new JButton("Close");
		Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.exit(1);
			}
		});
		Close.setBounds(165, 212, 89, 23);
		frame.getContentPane().add(Close);
		
		JLabel lblNewLabel = new JLabel("QMSkills");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel.setBounds(153, 52, 112, 30);
		frame.getContentPane().add(lblNewLabel);
	}
}
