package Lab1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JSlider;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Lab4 extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab4 frame = new Lab4();
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
	public Lab4() {
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 760);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Tools", "Interface", "Input/Output", "System"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		splitPane.setLeftComponent(list);
		
		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Language(requires restart):");
		lblNewLabel.setBounds(10, 10, 160, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tool box icon size:");
		lblNewLabel_1.setBounds(10, 80, 160, 20);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Secondary toolbar icon size:");
		lblNewLabel_2.setBounds(10, 220, 160, 20);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Control bar icon size:");
		lblNewLabel_3.setBounds(10, 150, 160, 20);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Maximum documents in Open Recent:");
		lblNewLabel_4.setBounds(10, 330, 220, 20);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"System default"}));
		comboBox.setBounds(20, 40, 280, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Large", "Small"}));
		comboBox_1.setBounds(20, 110, 280, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Small", "Large"}));
		comboBox_2.setBounds(20, 180, 280, 20);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Smaller"}));
		comboBox_3.setBounds(20, 250, 280, 20);
		panel.add(comboBox_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Work-around color sliders not drawing");
		chckbxNewCheckBox.setBounds(10, 290, 290, 20);
		panel.add(chckbxNewCheckBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(20, 1, 50, 1));
		spinner.setBounds(240, 330, 60, 20);
		panel.add(spinner);
		
		JSlider slider = new JSlider();
		
		slider.setValue(100);
		slider.setMaximum(200);
		slider.setBounds(20, 400, 200, 22);
		panel.add(slider);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(100, 0, 200, 1));
		spinner_1.setBounds(240, 400, 60, 20);
		panel.add(spinner_1);
		
		JLabel lblNewLabel_5 = new JLabel("Show measurements in units of:");
		lblNewLabel_5.setBounds(10, 430, 200, 20);
		panel.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Milimeters"}));
		comboBox_4.setBounds(20, 460, 280, 20);
		panel.add(comboBox_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Show filter primitives infobox (require restart)");
		chckbxNewCheckBox_1.setBounds(10, 500, 290, 20);
		panel.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_6 = new JLabel("Dockbar style (require restart)");
		lblNewLabel_6.setBounds(10, 540, 290, 20);
		panel.add(lblNewLabel_6);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Icon ant test"}));
		comboBox_5.setBounds(20, 570, 280, 20);
		panel.add(comboBox_5);
		
		JLabel lblNewLabel_7 = new JLabel("Switcher style (require restart)");
		lblNewLabel_7.setBounds(10, 610, 290, 20);
		panel.add(lblNewLabel_7);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Icon"}));
		comboBox_6.setBounds(20, 640, 280, 20);
		panel.add(comboBox_6);
		
		JLabel lblNewLabel_8 = new JLabel("Zoom correction factor (in %)");
		lblNewLabel_8.setBounds(10, 370, 260, 13);
		panel.add(lblNewLabel_8);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.WEST);
		
		JButton btnHelp = new JButton("Help");
		panel_2.add(btnHelp);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.EAST);
		
		JButton btnReset = new JButton("Reset");
		panel_3.add(btnReset);
		
		JButton btnOK = new JButton("OK");
		panel_3.add(btnOK);
		
		JButton btnCancel = new JButton("Cancel");
		panel_3.add(btnCancel);
		slider.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				spinner_1.setValue(slider.getValue());
			}
		});
	}
}
