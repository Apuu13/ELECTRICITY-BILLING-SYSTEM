package Electricity;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Welcome extends JFrame implements ActionListener
{
	Container c;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,img;
	JButton b1;
	JSeparator s1;
	Font f;
	public Welcome()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		getContentPane().setBackground(new Color(51, 204, 204));
		c=getContentPane();
		setTitle("Welcome Window");
		c.setLayout(null);
		
		
		l1=new JLabel("     WELCOME ");
		l1.setForeground(new Color(0, 0, 0));
		l1.setBounds(197,20,279,60);
		l1.setFont(new Font("Arial",Font.BOLD,35));
		c.add(l1);
		
		l2=new JLabel("TO");
		l2.setForeground(new Color(0,0,0));
		l2.setBounds(314,66,53,60);
		l2.setFont(new Font("Arial", Font.BOLD, 35));
		c.add(l2);
		
		l3=new JLabel("ELECTRICITY PAY BILL");
		l3.setForeground(new Color(0,0,0));
		l3.setBounds(146,106,483,65);
		l3.setFont(new Font("Arial", Font.BOLD, 35));
		
		s1 =new JSeparator();
		s1.setBackground(new Color(0, 0, 139));
		s1.setBounds(25,176,729,-14);
		c.add(s1);
		c.add(l3);
		
		l4=new JLabel("DEVELOPED BY ");
		l4.setBounds(45,522,242,34);
		l4.setFont(new Font("Arial",Font.BOLD,25));
		c.add(l4);
		
		l5=new JLabel ("GUIDED  BY");
		l5.setBounds(453,511,176,45);
		l5.setFont(new Font("Arial",Font.BOLD,25));
		c.add(l5);
		
		l6=new JLabel("  APARNA THAKUR");
		l6.setBounds(35,548,176,40);
		l6.setFont(new Font ("Arial",Font.PLAIN,18));
		c.add(l6);
		
		l7=new JLabel("Prashant Shukla");
		l7.setBounds(453,548,200,34);
		l7.setFont(new Font ("Arial",Font.PLAIN,20));
		c.add(l7);
		
		b1=new JButton("Press Here To Continue...");
		b1.setBackground(UIManager.getColor("Button.shadow"));
		b1.setMnemonic('G');
		b1.setBounds(74,600,520,45);
		b1.setFont(new Font("Arial",Font.ITALIC+Font.BOLD,20));
		c.add(b1);
		b1.addActionListener(this);
		
		l8=new JLabel (new ImageIcon("icon/Ele.png"));
		l8.setBounds(35,152,612,351);
		c.add(l8);
		
		img = new JLabel("");
		img.setIcon(new ImageIcon("icon\\bac.jpg"));
		img.setBounds(0, 0, 685, 661);
		getContentPane().add(img);
		
		
		setSize(701,700);
		setLocation(320,30);
		setResizable(false);
		setVisible(true);
		
	}
	public void  actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			JOptionPane.showMessageDialog(null,"Welcome to main Menu");
			main2 ma=new main2();
			setVisible(false);
			ma.setVisible(true);
			
		}
	}
	public static void main(String args[])
	{
		Welcome wo=new Welcome();
		wo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
	
	
}