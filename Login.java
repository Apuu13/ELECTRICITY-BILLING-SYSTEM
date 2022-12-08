package Electricity;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Login extends JFrame implements ActionListener
{
	JLabel lb1,lb2,lb3,img;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2,b3;
	Container c;
	JSeparator sep1,sep2;
	JFrame frame;
	
	
	public Login()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		
		setBackground(Color.BLACK);
		getContentPane().setBackground(new Color(0, 153, 153));
		c=getContentPane();
		setTitle("Login Window");
		c.setLayout(null);
		

		
		lb1=new JLabel(" USER  LOGIN  FORM");
		lb1.setBackground(Color.WHITE);
		lb1.setIcon(null);
		lb1.setBounds(212,10,282,39);
		lb1.setForeground(SystemColor.WHITE);
		lb1.setFont(new Font("Lucida Fax", Font.BOLD, 22));
		c.add(lb1);
		
		sep1=new JSeparator();
		sep1.setForeground(new Color(139, 0, 0));
		sep1.setBounds(99,10,479,9);
		c.add(sep1);
		
		sep2 = new JSeparator();
		sep2.setForeground(new Color(139, 0, 0));
		sep2.setBounds(99,47,479,9);
		c.add(sep2);
		
		lb2=new JLabel("");
		lb2.setIcon(new ImageIcon("icon\\User.png"));
		lb2.setBounds(109,60,166,104);
		lb2.setToolTipText("Username");
		c.add(lb2);
		
		t1=new JTextField(30);
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBackground(SystemColor.scrollbar);
		t1.setToolTipText("You must be Enter Username");
		t1.setBounds(351,92,227,34);
		c.add(t1);
		
		lb3=new JLabel(new ImageIcon("icon\\Pass.png"));
		lb3.setBounds(99,179,156,87);
		lb3.setToolTipText("Password");
		c.add(lb3);

		p1=new JPasswordField(30);
		p1.setFont(new Font("Tahoma", Font.BOLD, 15));
		p1.setEchoChar('*');
		p1.setBackground(SystemColor.scrollbar);
		p1.setBounds(351,210,227,34);
		p1.setToolTipText("You must be Enter Password");
		c.add(p1);
		
		b1=new JButton("login");
		b1.setBackground(SystemColor.controlShadow);
		b1.setBounds(249,277,103,27);
		b1.setToolTipText("Login");
		b1.setFont(new Font("Tahoma", Font.BOLD, 15));
		b1.setForeground(new Color(0,0,0));
		c.add(b1);
		
		b3=new JButton("Exit");
		b3.setFont(new Font("Tahoma", Font.BOLD, 15));
		b3.setForeground(new Color(0,0,0));
		b3.setBackground(SystemColor.controlShadow);
		b3.setBounds(249,356,103,27);
		b3.setToolTipText("Exit");
		c.add(b3);
		
		b2= new JButton("Refersh");
		b2.setToolTipText("Refersh");
		b2.setBackground(SystemColor.controlShadow);
		b2.setForeground(new Color(0,0,0));
		b2.setFont(new Font("Tahoma", Font.BOLD, 15));
		b2.setBounds(249, 315, 103, 27);
		c.add(b2);
		
		
		img = new JLabel("");
		img.setIcon(new ImageIcon("icon\\wap5.jpg"));
		img.setBounds(-57, 0, 702, 398);
		getContentPane().add(img);
		
		
		setSize(641,433);
		setVisible(true);
		setLocation(400,100);
		setResizable(false);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent e) {	
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			
			if(e.getSource()==b1)
			{
				String Username=t1.getText();
				String password=p1.getText().toString();
				
				String sql="select*from logtable where Username='"+Username+"' and password='"+password+"'";
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				if(rs.next())
				{
					JOptionPane.showMessageDialog(null,"Login Successfully...");
						Welcome wel=new Welcome();
						setVisible(false);
						wel.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Login UnSuccessfully...");
					setVisible(false);
				}
			}
				
			con.close();
			
		
			if(e.getSource()==b2)
			{
			t1.setText("");
			p1.setText("");
			
			}
		}
		catch(Exception e1){}

		
		if(e.getSource()==b3)
		{
			frame=new JFrame();
			if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Exit Window", JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_CANCEL_OPTION)
			{
				System.exit(0);
			}
			
		}
		
	}
	
	
	public static void main (String[]args) 
	{
		Login log =new Login();
		log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}	

