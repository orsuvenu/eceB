package Restaurent_bill_generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 789, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(202, 27, 179, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(107, 152, 96, 49);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(107, 248, 96, 32);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "coffee-Rs.40", "dosa-Rs.50", "idli-Rs.30", "vada-Rs.70", "tea-Rs.10", "ice-cream-Rs.80"}));
		c1.setBounds(239, 164, 172, 32);
		frame.getContentPane().add(c1);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("coffee-Rs.40"))
				{
					bill=q*40;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("dosa-Rs.50"))
				{
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("idli-Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("vada-Rs.70"))
				{
					bill=q*70;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("tea-Rs.10"))
				{
					bill=q*10;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				else if(item.equals("ice-cream-Rs.80"))
				{
					bill=q*80;
					JOptionPane.showMessageDialog(btnNewButton,"hello\n Selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
				}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(151, 337, 121, 49);
		frame.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(239, 252, 86, 32);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
	}
}
