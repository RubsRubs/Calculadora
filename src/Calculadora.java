import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Calculadora {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Consolas", Font.BOLD, 20));
		frame.setBounds(100, 100, 450, 617);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		value1 = new JTextField();
		value1.setBackground(Color.LIGHT_GRAY);
		value1.setForeground(Color.DARK_GRAY);
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Consolas", Font.BOLD, 20));
		value1.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		value1.setBounds(236, 24, 175, 61);
		frame.getContentPane().add(value1);
		value1.setColumns(10);

		value2 = new JTextField();
		value2.setBackground(Color.LIGHT_GRAY);
		value2.setForeground(Color.DARK_GRAY);
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Consolas", Font.BOLD, 20));
		value2.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		value2.setBounds(22, 96, 389, 48);
		frame.getContentPane().add(value2);
		value2.setColumns(10);

		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_13_1 = new JButton(".");
		btnNewButton_1_13_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1_13_1.setForeground(Color.WHITE);
		btnNewButton_1_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + '.');
			}
		});
		btnNewButton_1_13_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_13_1.setBounds(335, 476, 89, 61);
		frame.getContentPane().add(btnNewButton_1_13_1);
		// ______________________________________________________________________________________________________

		actionReceived = new JLabel(""); // variable global
		actionReceived.setFont(new Font("Consolas", Font.BOLD, 20));
		actionReceived.setForeground(SystemColor.control);
		actionReceived.setBackground(Color.LIGHT_GRAY);
		actionReceived.setBounds(138, 24, 89, 61);
		frame.getContentPane().add(actionReceived);
		// ______________________________________________________________________________________________________
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.DARK_GRAY);
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		editorPane.setBounds(10, 11, 414, 144);
		frame.getContentPane().add(editorPane);
		// ______________________________________________________________________________________________________
		JButton btnNewButton = new JButton("7");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 7);
			}
		});
		btnNewButton.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton.setBounds(10, 180, 89, 61);
		frame.getContentPane().add(btnNewButton);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 1);
			}
		});
		btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 324, 89, 61);
		frame.getContentPane().add(btnNewButton_1);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 4);
			}
		});
		btnNewButton_2.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_2.setBounds(10, 252, 89, 61);
		frame.getContentPane().add(btnNewButton_2);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_2 = new JButton("8");
		btnNewButton_1_2.setBackground(Color.DARK_GRAY);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 8);
			}
		});
		btnNewButton_1_2.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(109, 180, 89, 61);
		frame.getContentPane().add(btnNewButton_1_2);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_3 = new JButton("5");
		btnNewButton_1_3.setBackground(Color.DARK_GRAY);
		btnNewButton_1_3.setForeground(Color.WHITE);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 5);
			}
		});
		btnNewButton_1_3.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_3.setBounds(109, 252, 89, 61);
		frame.getContentPane().add(btnNewButton_1_3);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_4 = new JButton("2");
		btnNewButton_1_4.setBackground(Color.DARK_GRAY);
		btnNewButton_1_4.setForeground(Color.WHITE);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 2);
			}
		});
		btnNewButton_1_4.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_4.setBounds(109, 324, 89, 61);
		frame.getContentPane().add(btnNewButton_1_4);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_5 = new JButton("0");
		btnNewButton_1_5.setBackground(Color.DARK_GRAY);
		btnNewButton_1_5.setForeground(Color.WHITE);
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 0);
			}
		});
		btnNewButton_1_5.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_5.setBounds(109, 396, 89, 61);
		frame.getContentPane().add(btnNewButton_1_5);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_6 = new JButton("9");
		btnNewButton_1_6.setBackground(Color.DARK_GRAY);
		btnNewButton_1_6.setForeground(Color.WHITE);
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 9);
			}
		});
		btnNewButton_1_6.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_6.setBounds(208, 180, 89, 61);
		frame.getContentPane().add(btnNewButton_1_6);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_7 = new JButton("6");
		btnNewButton_1_7.setBackground(Color.DARK_GRAY);
		btnNewButton_1_7.setForeground(Color.WHITE);
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 6);
			}
		});
		btnNewButton_1_7.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_7.setBounds(208, 252, 89, 61);
		frame.getContentPane().add(btnNewButton_1_7);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_8 = new JButton("3");
		btnNewButton_1_8.setBackground(Color.DARK_GRAY);
		btnNewButton_1_8.setForeground(Color.WHITE);
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText() + 3);
			}
		});
		btnNewButton_1_8.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_8.setBounds(208, 324, 89, 61);
		frame.getContentPane().add(btnNewButton_1_8);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_9 = new JButton("=");
		btnNewButton_1_9.setBackground(Color.DARK_GRAY);
		btnNewButton_1_9.setForeground(Color.WHITE);
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double one = Double.parseDouble(value1.getText());
				double two = Double.parseDouble(value2.getText());

				if (actionReceived.getText().equals("sub")) {
					double sub = one - two;
					value2.setText(String.valueOf(sub));
				}
				if (actionReceived.getText().equals("add")) {
					double add = one + two;
					value2.setText(String.valueOf(add));
				}
				if (actionReceived.getText().equals("mult")) {
					double mult = one * two;
					value2.setText(String.valueOf(mult));

				}
				if (actionReceived.getText().equals("div")) {
					double div = one / two;
					value2.setText(String.valueOf(div));
				}
			}
		});
		btnNewButton_1_9.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_9.setBounds(208, 396, 89, 61);
		frame.getContentPane().add(btnNewButton_1_9);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_10 = new JButton("+");
		btnNewButton_1_10.setBackground(Color.DARK_GRAY);
		btnNewButton_1_10.setForeground(Color.WHITE);
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("add");
				value2.setText(null);
			}
		});
		btnNewButton_1_10.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_10.setBounds(335, 180, 89, 61);
		frame.getContentPane().add(btnNewButton_1_10);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_11 = new JButton("-");
		btnNewButton_1_11.setBackground(Color.DARK_GRAY);
		btnNewButton_1_11.setForeground(Color.WHITE);
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("sub");
				value2.setText(null);
			}
		});
		btnNewButton_1_11.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_11.setBounds(335, 252, 89, 61);
		frame.getContentPane().add(btnNewButton_1_11);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_12 = new JButton("/");
		btnNewButton_1_12.setBackground(Color.DARK_GRAY);
		btnNewButton_1_12.setForeground(Color.WHITE);
		btnNewButton_1_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("div");
				value2.setText(null);
			}
		});
		btnNewButton_1_12.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_12.setBounds(335, 324, 89, 61);
		frame.getContentPane().add(btnNewButton_1_12);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_13 = new JButton("x");
		btnNewButton_1_13.setBackground(Color.DARK_GRAY);
		btnNewButton_1_13.setForeground(Color.WHITE);
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionReceived.setText("mult");
				value2.setText(null);
			}
		});
		btnNewButton_1_13.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_13.setBounds(335, 396, 89, 61);
		frame.getContentPane().add(btnNewButton_1_13);
		// ______________________________________________________________________________________________________
		JButton btnNewButton_1_9_1 = new JButton("C");
		btnNewButton_1_9_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1_9_1.setForeground(Color.WHITE);
		btnNewButton_1_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText("0");
				actionReceived.setText(null);
			}
		});
		btnNewButton_1_9_1.setFont(new Font("Consolas", Font.BOLD, 20));
		btnNewButton_1_9_1.setBounds(10, 396, 89, 61);
		frame.getContentPane().add(btnNewButton_1_9_1);

	}

	private JLabel actionReceived;
}
