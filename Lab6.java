package Lab1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Lab6 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textSSL;
	private JTextField textSSI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab6 frame = new Lab6();
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
	public Lab6() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 432, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 10, 397, 306);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("General", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Protocol");
		lblNewLabel.setBounds(10, 10, 60, 20);
		panel.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TCP/IP", "FTP", "SFTP", "webDEV"}));
		comboBox.setBounds(80, 10, 300, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Host");
		lblNewLabel_1.setBounds(10, 40, 45, 20);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(80, 40, 200, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Port");
		lblNewLabel_2.setBounds(290, 40, 35, 20);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(335, 41, 45, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Login type");
		lblNewLabel_3.setBounds(10, 70, 70, 20);
		panel.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Anonymous", "Ask for password"}));
		comboBox_1.setBounds(80, 70, 300, 20);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setBounds(10, 100, 60, 20);
		panel.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(80, 100, 90, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setBounds(225, 100, 60, 20);
		panel.add(lblNewLabel_5);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(290, 100, 90, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_6 = new JLabel("Comment");
		lblNewLabel_6.setBounds(10, 140, 60, 20);
		panel.add(lblNewLabel_6);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 170, 370, 88);
		panel.add(editorPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Advanced", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Server type");
		lblNewLabel_7.setBounds(20, 20, 80, 20);
		panel_1.add(lblNewLabel_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Windows", "Linux", "VxWorks"}));
		comboBox_2.setBounds(30, 45, 335, 21);
		panel_1.add(comboBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Use SSL");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		chckbxNewCheckBox.setBounds(20, 80, 93, 20);
		panel_1.add(chckbxNewCheckBox);
		
		textSSL = new JTextField();
		textSSL.setBounds(20, 140, 230, 20);
		panel_1.add(textSSL);
		textSSL.setColumns(10);
		
		JButton Browser = new JButton("Browser");
		Browser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = 
						new JFileChooser();
				jFileChooser.setDialogTitle("Save File");
				int result = jFileChooser.showSaveDialog(null);
				textSSL.setText( jFileChooser.getSelectedFile().getAbsolutePath());
			}
		});
		Browser.setBounds(260, 140, 105, 20);
		panel_1.add(Browser);
		
		JLabel lblSSL = new JLabel("SSL Private key");
		lblSSL.setBounds(20, 110, 120, 20);
		panel_1.add(lblSSL);
		
		JLabel lblSSI = new JLabel("SSI CA certificate");
		lblSSI.setBounds(20, 170, 140, 20);
		panel_1.add(lblSSI);
		
		textSSI = new JTextField();
		textSSI.setBounds(20, 200, 230, 20);
		panel_1.add(textSSI);
		textSSI.setColumns(10);
		
		JButton Browser2 = new JButton("Browser");
		Browser2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = 
						new JFileChooser();
				jFileChooser.setDialogTitle("Save File");
				int result = jFileChooser.showSaveDialog(null);
				textSSI.setText( jFileChooser.getSelectedFile().getAbsolutePath());
			}
		});
		Browser2.setBounds(260, 200, 105, 20);
		panel_1.add(Browser2);
		
		JLabel lbltime = new JLabel("Adjust server time");
		lbltime.setBounds(20, 230, 110, 20);
		panel_1.add(lbltime);
		
		JSpinner spinner1 = new JSpinner();
		
		spinner1.setModel(new SpinnerNumberModel(0, 0, 100, 1));
		spinner1.setBounds(125, 230, 40, 20);
		panel_1.add(spinner1);
		
		JLabel lblore = new JLabel("ore");
		lblore.setBounds(175, 230, 45, 20);
		panel_1.add(lblore);
		
		JSpinner spinner2 = new JSpinner();
		
		spinner2.setModel(new SpinnerNumberModel(0, 0, 59, 1));
		spinner2.setBounds(220, 230, 40, 20);
		panel_1.add(spinner2);
		
		JLabel lblminute = new JLabel("minute");
		lblminute.setBounds(270, 230, 70, 20);
		panel_1.add(lblminute);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Charset", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("The charset used by server to encode filenames");
		lblNewLabel_13.setBounds(20, 10, 300, 20);
		panel_2.add(lblNewLabel_13);
		
		JComboBox comboBox_3 = new JComboBox();
		
		
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Autodetect", "UTF-8", "Custom charset"}));
		comboBox_3.setBounds(30, 40, 290, 20);
		panel_2.add(comboBox_3);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBounds(10, 70, 372, 158);
		panel_2.add(editorPane_1);
		editorPane_1.setVisible(false);
		
		JButton btnNewButton = new JButton("Open");
		btnNewButton.setBounds(217, 326, 85, 21);
		contentPane.add(btnNewButton);
		textSSI.setVisible(false);
		textSSL.setVisible(false);
		lblSSI.setVisible(false);
		lblSSL.setVisible(false);
		Browser.setVisible(false);
		Browser2.setVisible(false);
		lbltime.setBounds(20, 110, 120, 20);
		spinner1.setBounds(135, 110, 40, 20);
		lblore.setBounds(185, 110, 45, 20);
		spinner2.setBounds(220, 110, 40, 20);
		lblminute.setBounds(270, 110, 60, 20);
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					textSSI.setVisible(true);
					textSSL.setVisible(true);
					lblSSI.setVisible(true);
					lblSSL.setVisible(true);
					Browser.setVisible(true);
					Browser2.setVisible(true);
					lbltime.setBounds(20, 230, 120, 20);
					spinner1.setBounds(135, 230, 40, 20);
					lblore.setBounds(185, 230, 45, 20);
					spinner2.setBounds(220, 230, 40, 20);
					lblminute.setBounds(270, 230, 60, 20);
					
				}
				else {
					textSSI.setVisible(false);
					textSSL.setVisible(false);
					lblSSI.setVisible(false);
					lblSSL.setVisible(false);
					Browser.setVisible(false);
					Browser2.setVisible(false);
					lbltime.setBounds(20, 110, 120, 20);
					spinner1.setBounds(135, 110, 40, 20);
					lblore.setBounds(185, 110, 45, 20);
					spinner2.setBounds(220, 110, 40, 20);
					lblminute.setBounds(270, 110, 60, 20);
				}
			}
		});
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox_3.getSelectedIndex() == 2) {
					editorPane_1.setVisible(true);
				}
				else {
					editorPane_1.setVisible(false);
				}
			}
		});
		spinner1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if ((int) spinner1.getValue() > 19) {
					lblore.setText("de ore");
				}
			}
		});
		spinner2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if ((int) spinner2.getValue() > 19) {
					lblminute.setText("de minute");
				}
			}
		});
		btnNewButton_1.setBounds(312, 326, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
