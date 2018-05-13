import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MainFrame {

	private JFrame frame;
	private JTextField textA;
	private JTextField textB;
	private JTextField textC;
	private JTextField textX1;
	private JTextField textX2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Клієнт-серверна система з розв'язку квадратних рівняннь");
		frame.setBounds(100, 100, 514, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEq = new JLabel("Рівняння виду ");
		lblEq.setHorizontalAlignment(SwingConstants.LEFT);
		lblEq.setIcon(new ImageIcon("D:\\Projects\\CSGalik\\Client\\res\\res1.PNG"));
		lblEq.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblEq.setBounds(19, 11, 470, 50);
		frame.getContentPane().add(lblEq);
		
		JRadioButton radioSlow = new JRadioButton("Повільний обрахунок");
		radioSlow.setBounds(10, 68, 157, 23);
		frame.getContentPane().add(radioSlow);
		
		JRadioButton radioNormal = new JRadioButton("Нормальний обрахунок");
		radioNormal.setBounds(169, 68, 172, 23);
		frame.getContentPane().add(radioNormal);
		
		JRadioButton radioFast = new JRadioButton("Швидкий обрахунок");
		radioFast.setBounds(343, 68, 155, 23);
		frame.getContentPane().add(radioFast);
		
		JLabel lblA = new JLabel("Значення \"а\":");
		lblA.setBounds(13, 98, 96, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblB = new JLabel("Значення \"b\":");
		lblB.setBounds(177, 98, 96, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblC = new JLabel("Значення \"с\":");
		lblC.setBounds(341, 98, 99, 14);
		frame.getContentPane().add(lblC);
		
		textA = new JTextField();
		textA.setBounds(122, 95, 42, 20);
		frame.getContentPane().add(textA);
		textA.setColumns(10);
		
		textB = new JTextField();
		textB.setBounds(286, 95, 42, 20);
		frame.getContentPane().add(textB);
		textB.setColumns(10);
		
		textC = new JTextField();
		textC.setBounds(453, 95, 42, 20);
		frame.getContentPane().add(textC);
		textC.setColumns(10);
		
		JLabel lblX1 = new JLabel("Перший корінь:");
		lblX1.setBounds(145, 129, 99, 14);
		frame.getContentPane().add(lblX1);
		
		JLabel lblX2 = new JLabel("Другий корінь:");
		lblX2.setBounds(145, 154, 93, 14);
		frame.getContentPane().add(lblX2);
		
		textX1 = new JTextField();
		textX1.setBounds(248, 126, 86, 20);
		frame.getContentPane().add(textX1);
		textX1.setColumns(10);
		
		textX2 = new JTextField();
		textX2.setBounds(248, 151, 86, 20);
		frame.getContentPane().add(textX2);
		textX2.setColumns(10);
		
		JButton btnCalc = new JButton("Рахувати");
		btnCalc.setBounds(209, 182, 89, 23);
		frame.getContentPane().add(btnCalc);
	}
}
