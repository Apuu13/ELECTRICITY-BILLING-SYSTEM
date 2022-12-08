package Electricity;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Projecthelp extends JDialog implements ActionListener
{
	JButton btnok=new JButton("OK");
	JLabel lblhead,lblcreator,lbladd,lbltel,lblfax,lblemail,lblsite;
	JLabel lblhead1,lblcreator1,lbladd1,lbltel1,lblfax1,lblemail1,lblsite1;
	JLabel lblsupport,lblonlinesupport;
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	Projecthelp()
	{
		super((JFrame)null,"About Project",true);
		Container c=getContentPane();
		c.setLayout(null);
		btnok.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnok.setBounds(177,435,107,35);
		btnok.addActionListener(this);

		lblhead=new JLabel("''PAY BILL SYSTEM''");
		lblhead.setBounds(149,27,227,30);
		lblhead.setFont(new Font("MS Sans Serif",Font.BOLD,20));
		lblhead.setForeground(Color.red);
		
		JSeparator s1=new  JSeparator();
		s1.setForeground(Color.RED);
		s1.setBackground(Color.BLACK);
		s1.setBounds(96,21,316,47);
		s1.setBorder(BorderFactory.createEtchedBorder());
		
		
		Font f1=new Font("Times New Roman",Font.BOLD,16);
		lblcreator=new JLabel("Created By :",JLabel.RIGHT);
		lblcreator.setFont(f1);
		lblcreator.setForeground(new Color(0, 0, 0));
	
		lbladd=new JLabel("Address :",JLabel.RIGHT);
		lbladd.setFont(f1);
		lbladd.setForeground(new Color(0, 0, 0));
		
		lbltel=new JLabel("Contact No. :",JLabel.RIGHT);
		lbltel.setFont(f1);
		lbltel.setForeground(new Color(0, 0, 0));
		
		lblfax=new JLabel("Fax :",JLabel.RIGHT);
		lblfax.setFont(f1);
		lblfax.setForeground(new Color(0, 0, 0));
		
		lblemail=new JLabel("E-Mail :",JLabel.RIGHT);
		lblemail.setFont(f1);
		lblemail.setForeground(new Color(0, 0, 0));
		
		lblsite=new JLabel("Web Site :",JLabel.RIGHT);
		lblsite.setFont(f1);
		lblsite.setForeground(new Color(0, 0, 0));
		
		JPanel headpane=new JPanel();
		headpane.setForeground(new Color(255, 255, 255));
		headpane.setBounds(20,100,115,150);
		headpane.setLayout(new GridLayout(6,1,5,10));
		headpane.add(lblcreator);
		headpane.add(lbladd);
		headpane.add(lbltel);
		headpane.add(lblfax);
		headpane.add(lblemail);
		headpane.add(lblsite);

	
		Font f2=new Font("Times New Roman",Font.BOLD,16);
		lblcreator1=new JLabel("Aparna Thakur");
		lblcreator1.setFont(f2);
		lblcreator1.setForeground(Color.BLACK);
	
		lbladd1=new JLabel("Bhadus,Betul (mp).");
		lbladd1.setFont(f2);
		lbladd1.setForeground(Color.BLACK);
		
		lbltel1=new JLabel("7440554248");
		lbltel1.setFont(f2);
		lbltel1.setForeground(Color.BLUE);
		
		lblfax1=new JLabel("07141-054367");
		lblfax1.setFont(f2);
		lblfax1.setForeground(Color.BLUE);
		
		lblemail1=new JLabel("aparnathakur1311@gmail.com");
		lblemail1.setFont(f2);
		lblemail1.setForeground(Color.BLUE);
		
		lblsite1=new JLabel("www.java.com");
		lblsite1.setFont(f2);
		lblsite1.setForeground(Color.BLUE);
		
		JPanel headpane1=new JPanel();
		headpane1.setBounds(180,100,300,150);
		headpane1.setLayout(new GridLayout(6,1,5,10));
		headpane1.add(lblcreator1);
		headpane1.add(lbladd1);
		headpane1.add(lbltel1);
		headpane1.add(lblfax1);
		headpane1.add(lblemail1);
		headpane1.add(lblsite1);

		JSeparator s2=new  JSeparator();
		s2.setBounds(20,281,460,2);
		s2.setBackground(Color.red);
		s2.setBorder(BorderFactory.createEtchedBorder());
	
		JLabel lbltecsup=new JLabel("Technical Support:-");
		lbltecsup.setBounds(20,288,460,42);
		lbltecsup.setFont(new Font("Arial Black",Font.BOLD,20));
		lbltecsup.setForeground(Color.blue);
		
		JLabel tel=new JLabel("Telphone Numbers:");
		tel.setBounds(15,330,165,25);
		tel.setFont(f1);
		tel.setForeground(Color.BLACK);
		
		JLabel onsup=new JLabel("Online Support:");		
		onsup.setBounds(20,360,145,25);
		onsup.setFont(f1);
		onsup.setForeground(Color.BLACK);
		
		
		JLabel tel1=new JLabel("8817505629,9406537474,9981845676");
		tel1.setBounds(190,330,266,25);
		tel1.setFont(f2);
		tel1.setForeground(Color.BLUE);
		
		JLabel onsup1=new JLabel("aparnathakur1311@gmail.com");
		onsup1.setBounds(190,360,250,25);
		onsup1.setFont(f2);
		onsup1.setForeground(Color.BLUE);
		
		JLabel onsup2=new JLabel("aparnathakur1311yahoo.com");
		onsup2.setBounds(190,380,250,25);
		onsup2.setFont(f2);
		onsup2.setForeground(Color.BLUE);
		
		JLabel onsup3=new JLabel("www.java.com");
		onsup3.setBounds(190,400,250,25);
		onsup3.setFont(f2);
		onsup3.setForeground(Color.BLUE);
		
		
		
		c.add(lblhead);
		c.add(s1);
		c.add(headpane);
		c.add(headpane1);
		c.add(s2);
		c.add(lbltecsup);
		c.add(tel);
		c.add(onsup);
		c.add(tel1);
		c.add(onsup1);
		c.add(onsup2);
		c.add(onsup3);
		c.add(btnok);
		getRootPane().setDefaultButton(btnok);
		setSize(510,517);
	
		setLocation(350,100);
		setResizable(false);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnok)
			dispose();
	}
	public static void main (String args[])
	{
		Projecthelp po=new Projecthelp();
		po.setVisible(false);
	}
}