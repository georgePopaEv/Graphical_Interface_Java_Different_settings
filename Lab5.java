package Lab1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.SwingConstants;

public class Lab5 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField generalusertxt;
	private JTextField generalpasstxt;
	private JTextField limitedusertxt;
	private JTextField limitedpasstxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab5 frame = new Lab5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Lab5() {
		setTitle("Laboratorul numarul 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 567, 370);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Connection Settings", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Monitor Form ");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEFT);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 10, 80, 20);
		panel.add(lblNewLabel);
		
		JLabel lblinfo1 = new JLabel("");
		lblinfo1.setToolTipText("Aceasta optiune seteaza tipul monitorului\r\n");
		lblinfo1.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo1.setBounds(140, 10, 20, 20);
		panel.add(lblinfo1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"dfunkier"}));
		comboBox.setBounds(170, 10, 380, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Connect Using");
		lblNewLabel_2.setBounds(10, 40, 100, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblinfo2 = new JLabel("");
		lblinfo2.setToolTipText("Tipul de conectare");
		lblinfo2.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo2.setBounds(140, 40, 20, 20);
		panel.add(lblinfo2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"TCP/IP"}));
		comboBox_1.setBounds(170, 40, 380, 20);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Instance Address");
		lblNewLabel_3.setBounds(10, 70, 110, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblinfo3 = new JLabel("");
		lblinfo3.setToolTipText("Adresa de conectare");
		lblinfo3.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo3.setBounds(140, 70, 20, 20);
		panel.add(lblinfo3);
		
		textField = new JTextField();
		textField.setBounds(170, 70, 250, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Port");
		lblNewLabel_4.setBounds(430, 70, 30, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblinfo4 = new JLabel("");
		lblinfo4.setToolTipText("Portul la care te conectezi");
		lblinfo4.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo4.setBounds(470, 70, 20, 20);
		panel.add(lblinfo4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(510, 70, 40, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Admin User");
		lblNewLabel_5.setBounds(10, 100, 80, 20);
		panel.add(lblNewLabel_5);
		
		JLabel lblinfo5 = new JLabel("");
		lblinfo5.setToolTipText("Userul de Admin");
		lblinfo5.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo5.setBounds(140, 100, 20, 20);
		panel.add(lblinfo5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 100, 380, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Admin Password");
		lblNewLabel_6.setBounds(10, 130, 100, 20);
		panel.add(lblNewLabel_6);
		
		JLabel lblinfo6 = new JLabel("");
		lblinfo6.setToolTipText("Parola de Admin");
		lblinfo6.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo6.setBounds(140, 130, 20, 20);
		panel.add(lblinfo6);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 130, 380, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Auto-Create Less Privileged Users");
		lblNewLabel_7.setBounds(10, 160, 200, 20);
		panel.add(lblNewLabel_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Yes", "No"}));
		comboBox_2.setBounds(250, 160, 300, 20);
		panel.add(comboBox_2);
		
		JLabel lblinfo7 = new JLabel("");
		lblinfo7.setToolTipText("Privilegiat sau nu");
		lblinfo7.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfo7.setBounds(220, 160, 20, 20);
		panel.add(lblinfo7);
		
		JLabel generaluserlbl = new JLabel("General User");
		generaluserlbl.setBounds(10, 190, 80, 20);
		panel.add(generaluserlbl);
		
		generalusertxt = new JTextField();
		generalusertxt.setBounds(170, 190, 380, 19);
		panel.add(generalusertxt);
		generalusertxt.setColumns(10);
		
		JLabel lblinfogeneraluser = new JLabel("");
		lblinfogeneraluser.setToolTipText("Userii Generali");
		lblinfogeneraluser.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfogeneraluser.setBounds(140, 190, 20, 20);
		panel.add(lblinfogeneraluser);
		
		JLabel generalpasslbl = new JLabel("General Password");
		generalpasslbl.setBounds(10, 220, 100, 20);
		panel.add(generalpasslbl);
		
		JLabel lblinfogeneralpass = new JLabel("");
		lblinfogeneralpass.setToolTipText("Parola Generala");
		lblinfogeneralpass.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfogeneralpass.setBounds(140, 220, 20, 20);
		panel.add(lblinfogeneralpass);
		
		generalpasstxt = new JTextField();
		generalpasstxt.setBounds(170, 220, 380, 20);
		panel.add(generalpasstxt);
		generalpasstxt.setColumns(10);
		
		JLabel limiteduserlbl = new JLabel("Limited User");
		limiteduserlbl.setBounds(10, 250, 100, 20);
		panel.add(limiteduserlbl);
		
		JLabel lblinfolimiteduser = new JLabel("");
		lblinfolimiteduser.setToolTipText("Utilizator limitat");
		lblinfolimiteduser.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfolimiteduser.setBounds(140, 250, 20, 20);
		panel.add(lblinfolimiteduser);
		
		limitedusertxt = new JTextField();
		limitedusertxt.setBounds(170, 250, 380, 19);
		panel.add(limitedusertxt);
		limitedusertxt.setColumns(10);
		
		JLabel limitedpass = new JLabel("Limited Password");
		limitedpass.setBounds(10, 280, 100, 20);
		panel.add(limitedpass);
		
		JLabel lblinfolimitedpass = new JLabel("");
		lblinfolimitedpass.setToolTipText("Parola Limitata");
		lblinfolimitedpass.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/01.png")));
		lblinfolimitedpass.setBounds(140, 280, 20, 20);
		panel.add(lblinfolimitedpass);
		
		limitedpasstxt = new JTextField();
		limitedpasstxt.setBounds(170, 281, 380, 19);
		panel.add(limitedpasstxt);
		limitedpasstxt.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Instance");
		btnNewButton.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/03.png")));
		btnNewButton.setBounds(300, 310, 140, 20);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setIcon(new ImageIcon(Lab5.class.getResource("/Lab1/02.png")));
		btnNewButton_1.setBounds(450, 310, 100, 20);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Encryption Settings", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Advanced Settings", null, panel_2, null);
		
		generalpasstxt.setEditable(false);
		generalusertxt.setEditable(false);
		limitedpasstxt.setEditable(false);
		limitedusertxt.setEditable(false);
		textField_1.setText("3306");
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Group Settings", null, panel_3, null);
		comboBox_2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (comboBox_2.getSelectedIndex() == 0)
				{
					generalpasstxt.setEditable(false);
					generalusertxt.setEditable(false);
					limitedpasstxt.setEditable(false);
					limitedusertxt.setEditable(false);
					}
				else {
					generalpasstxt.setEditable(true);
					generalusertxt.setEditable(true);
					limitedpasstxt.setEditable(true);
					limitedusertxt.setEditable(true);
				}
			}
		});
	}
}
