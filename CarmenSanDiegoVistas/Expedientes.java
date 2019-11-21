package CarmenSanDiegoVistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Expedientes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expedientes frame = new Expedientes();
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
	public Expedientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JScrollPane scrollPaneVillanos = new JScrollPane();
		scrollPaneVillanos.setBounds(10, 53, 173, 183);
		contentPane.add(scrollPaneVillanos);
		
		JLabel lblVillanos = new JLabel("VILLANOS");
		lblVillanos.setHorizontalAlignment(SwingConstants.CENTER);
		lblVillanos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblVillanos.setBounds(10, 11, 173, 31);
		contentPane.add(lblVillanos);
		
		JLabel lblSeniasParticulares=new JLabel("Se�ales Particulares");
		lblSeniasParticulares.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeniasParticulares.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblSeniasParticulares.setBounds(200, 11, 173, 31);		
		contentPane.add(lblSeniasParticulares);
		
		JScrollPane scrollPaneSenias = new JScrollPane();
		scrollPaneSenias.setBounds(220, 53, 183, 140);
		contentPane.add(scrollPaneSenias);
		
		JLabel lblHobbies=new JLabel("Hobbies");
		lblHobbies.setHorizontalAlignment(SwingConstants.SOUTH_EAST);
		lblHobbies.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblHobbies.setBounds(160, 200, 173, 31);		
		contentPane.add(lblHobbies);
		
		JScrollPane scrollPaneHobbies = new JScrollPane();
		scrollPaneHobbies.setBounds(220, 225, 183, 100);
		contentPane.add(scrollPaneHobbies);
		
		JButton bAtras = new JButton("Atras");
		bAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		bAtras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bAtras.setBounds(300,350, 89, 23);
		contentPane.add(bAtras);
		
	}
}