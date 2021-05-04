package Lab1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class panelLab2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			panelLab2 dialog = new panelLab2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public panelLab2() {
		setBounds(100, 100, 482, 687);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 10, 453, 44);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Server Settings");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 5, 180, 35);
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("Server Type:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblNewLabel_1.setBounds(10, 65, 70, 15);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lbl1 = new JLabel("Server Name:");
			lbl1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lbl1.setBounds(10, 85, 70, 15);
			contentPanel.add(lbl1);
			lbl1.setDisplayedMnemonic(KeyEvent.VK_S);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("IMAP Mail Server");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblNewLabel_3.setBounds(80, 65, 120, 15);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lbl2N = new JLabel("User Name:");
			lbl2N.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lbl2N.setDisplayedMnemonic(KeyEvent.VK_N);
			lbl2N.setBounds(10, 105, 80, 15);
			contentPanel.add(lbl2N);
		}
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(85, 85, 190, 15);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(85, 105, 190, 15);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(143, 0, 2000, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spinner.setBounds(310, 85, 50, 15);
		contentPanel.add(spinner);
		
		JLabel lbl2P = new JLabel("Port:");
		lbl2P.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl2P.setBounds(280, 85, 30, 15);
		lbl2P.setDisplayedMnemonic(KeyEvent.VK_P);
		contentPanel.add(lbl2P);
		
		JLabel lblport = new JLabel("Default:  143");
		lblport.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblport.setDisplayedMnemonic(KeyEvent.VK_P);
		lblport.setBounds(380, 85, 80, 15);
		contentPanel.add(lblport);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Security Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 130, 453, 69);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl3u = new JLabel("Connection security:");
		lbl3u.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lbl3u.setDisplayedMnemonic(KeyEvent.VK_U);
		lbl3u.setBounds(10, 20, 120, 20);
		panel_1.add(lbl3u);
		
		JLabel lbl4i = new JLabel("Authentification method:");
		lbl4i.setBounds(10, 45, 140, 20);
		lbl4i.setDisplayedMnemonic(KeyEvent.VK_I);
		panel_1.add(lbl4i);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"STARTTLS"}));
		comboBox.setBounds(160, 20, 130, 20);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Normal Password"}));
		comboBox_1.setBounds(160, 45, 130, 20);
		panel_1.add(comboBox_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Server Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(10, 205, 453, 212);
		contentPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JCheckBox check1C = new JCheckBox("Check for new messages at startup");
		check1C.setSelected(true);
		check1C.setMnemonic(KeyEvent.VK_C);
		check1C.setBounds(10, 20, 400, 20);
		panel_2.add(check1C);
		
		JCheckBox check2y = new JCheckBox("Check for new messages every ");
		check2y.setSelected(true);
		check2y.setBounds(10, 40, 250, 20);
		check2y.setMnemonic(KeyEvent.VK_Y);
		panel_2.add(check2y);
		
		JCheckBox check3w = new JCheckBox("Allow immediate server notifications when new messages arrive");
		check3w.setSelected(true);
		check3w.setMnemonic(KeyEvent.VK_W);
		check3w.setBounds(10, 60, 400, 20);
		panel_2.add(check3w);
		
		JLabel lblNewLabel_9 = new JLabel("When I delete a message:");
		lblNewLabel_9.setBounds(20, 85, 150, 20);
		panel_2.add(lblNewLabel_9);
		
		JRadioButton radio1o = new JRadioButton("Move it to this folder:");
		radio1o.setSelected(true);
		radio1o.setMnemonic(KeyEvent.VK_O);
		radio1o.setBounds(35, 110, 160, 20);
		panel_2.add(radio1o);
		
		JRadioButton radiok2 = new JRadioButton("Just mark it as deleted");
		radiok2.setBounds(35, 130, 160, 20);
		radiok2.setMnemonic(KeyEvent.VK_K);
		panel_2.add(radiok2);
		
		JRadioButton radio3d = new JRadioButton("Remove it immediately");
		radio3d.setBounds(35, 150, 160, 20);
		radio3d.setMnemonic(KeyEvent.VK_D);
		panel_2.add(radio3d);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"STERSE ON"}));
		comboBox_2.setToolTipText("");
		comboBox_2.setBounds(230, 110, 120, 20);
		panel_2.add(comboBox_2);
		
		JButton AddvancedV = new JButton("Advanced");
		AddvancedV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AddvancedV.setMnemonic(KeyEvent.VK_V);
		AddvancedV.setBounds(358, 181, 85, 21);
		panel_2.add(AddvancedV);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(10, 0, 60, 1));
		spinner_1.setBounds(260, 40, 40, 20);
		panel_2.add(spinner_1);
		
		JLabel lblNewLabel_2 = new JLabel("minutes");
		lblNewLabel_2.setBounds(320, 40, 60, 20);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Message Storage", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(10, 420, 453, 147);
		contentPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JCheckBox check4E = new JCheckBox("Clean up(\"Expunge\")Inbox on Exit ");
		check4E.setBounds(10, 15, 400, 21);
		check4E.setMnemonic(KeyEvent.VK_E);
		panel_3.add(check4E);
		
		JCheckBox check5x = new JCheckBox("Empty Trash on Exit");
		check5x.setBounds(10, 40, 142, 20);
		check5x.setMnemonic(KeyEvent.VK_X);
		panel_3.add(check5x);
		
		JLabel lab5T = new JLabel("Message Store Type:");
		lab5T.setBounds(10, 65, 130, 20);
		lab5T.setDisplayedMnemonic(KeyEvent.VK_T);
		panel_3.add(lab5T);
		
		JComboBox COMBOT = new JComboBox();
		COMBOT.setModel(new DefaultComboBoxModel(new String[] {"File per folder (mbox)"}));
		COMBOT.setBounds(150, 65, 150, 20);
		
		panel_3.add(COMBOT);
		
		
		
		textFieldch = new JTextField();
		textFieldch.setBounds(10, 117, 338, 20);
		panel_3.add(textFieldch);
		textFieldch.setColumns(10);
		
		JButton BrowserB = new JButton("Browser");
		BrowserB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser jFileChooser = 
						new JFileChooser();
				jFileChooser.setDialogTitle("Save File");
				int result = jFileChooser.showSaveDialog(null);
				textFieldch.setText( jFileChooser.getSelectedFile().getAbsolutePath());
				
				
				
			}
			
		});
		BrowserB.setMnemonic(KeyEvent.VK_B);
		BrowserB.setBounds(358, 116, 85, 20);
		panel_3.add(BrowserB);
		
		JLabel lblNewLabel_11 = new JLabel("Local Directory:");
		lblNewLabel_11.setBounds(10, 90, 120, 20);
		panel_3.add(lblNewLabel_11);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
		
	}
}
