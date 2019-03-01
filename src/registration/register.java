package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JCheckBox;

public class register {

	private JFrame frame;
	private JTextField phoneNUM;
	private JTextField Mail;
	private JTextField user;
	private JTextField pass;
	private JTextField SID;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
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
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 499, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("userN");
		lblUsername.setBounds(42, 41, 46, 14);
		frame.getContentPane().add(lblUsername);
		
		JLabel LblPassword = new JLabel("Password");
		LblPassword.setBounds(42, 73, 46, 14);
		frame.getContentPane().add(LblPassword);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(42, 115, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setBounds(94, 111, 109, 23);
		frame.getContentPane().add(rdbtnStudent);
		
		JRadioButton rdbtnTutor = new JRadioButton("Tutor");
		rdbtnTutor.setBounds(217, 111, 109, 23);
		frame.getContentPane().add(rdbtnTutor);
		
		JLabel lblPhoneNo = new JLabel("Phone Number");
		lblPhoneNo.setBounds(42, 153, 94, 14);
		frame.getContentPane().add(lblPhoneNo);
		
		phoneNUM = new JTextField();
		phoneNUM.setBounds(146, 150, 86, 20);
		frame.getContentPane().add(phoneNUM);
		phoneNUM.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(42, 191, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		Mail = new JTextField();
		Mail.setBounds(146, 181, 86, 20);
		frame.getContentPane().add(Mail);
		Mail.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Account acc = new Account();
				acc.setUserName(user.getText());
				acc.setPassword(pass.getText());
				if(rdbtnStudent.isSelected()) {
					acc.setUserRole("Student");
				}else if(rdbtnTutor.isSelected()) {
					acc.setUserRole("Tutor");
				}else {
					JOptionPane.showMessageDialog(null, "need to select one");
				} 
				acc.setEmail(Mail.getText());
				acc.setPhoneNumber(phoneNUM.getText());
				acc.setRegistration(true);
				acc.setUserRating(0);
				ArrayList<Account> account = new ArrayList<>();
				account.add(acc);
				for(int i=0;i<account.size();i++){
				    System.out.println(account.get(i));
				} 
				
			}
		});
		btnRegister.setBounds(164, 481, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		user = new JTextField();
		user.setBounds(146, 38, 86, 20);
		frame.getContentPane().add(user);
		user.setColumns(10);
		
		pass = new JTextField();
		pass.setBounds(146, 70, 86, 20);
		frame.getContentPane().add(pass);
		pass.setColumns(10);
		
		JCheckBox TermsAndConditons = new JCheckBox("");
		TermsAndConditons.setBounds(197, 451, 97, 23);
		frame.getContentPane().add(TermsAndConditons);
		
		JLabel lblTermsAndConditions = new JLabel("Terms and Conditions");
		lblTermsAndConditions.setBounds(30, 456, 161, 14);
		frame.getContentPane().add(lblTermsAndConditions);
		
		JLabel YearOfStudy = new JLabel("year of study");
		YearOfStudy.setBounds(42, 258, 78, 14);
		frame.getContentPane().add(YearOfStudy);
		
		JLabel StudentID = new JLabel("StudentID");
		StudentID.setBounds(42, 342, 94, 14);
		frame.getContentPane().add(StudentID);
		
		SID = new JTextField();
		SID.setBounds(146, 339, 86, 20);
		frame.getContentPane().add(SID);
		SID.setColumns(10);
	}
}
