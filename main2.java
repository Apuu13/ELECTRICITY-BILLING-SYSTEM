package Electricity;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class main2 extends JFrame implements  ActionListener{
	Container f1;
	JMenuBar mb;
	JMenu std,sr,h,dis,tech;
	JMenuItem a,b,c,e,n,g,dt,h1,h2,d1,d2;
	JLabel Ele,img;
	JFrame frame;
	public main2()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\sdata.png"));
		setBackground(SystemColor.activeCaptionBorder);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		f1=getContentPane();
		setTitle(" Main Window");
		f1.setLayout(null);
		
		
		Ele=new JLabel(new ImageIcon("icon/pay.png"));
		Ele.setBackground(new Color(176, 196, 222));
		Ele.setBounds(330, 201, 161, 156);
		getContentPane().add(Ele);
		
		img = new JLabel("");
		img.setIcon(new ImageIcon("icon\\wap3.jpg"));
		img.setBounds(-12, 0, 833, 679);
		getContentPane().add(img);
		
		
		mb=new JMenuBar();
		mb.setBackground(SystemColor.activeCaptionBorder);
		std=new JMenu("File");
		std.setFont(new Font("Segoe UI", Font.BOLD, 14));
		std.setMnemonic('F');
		mb.add(std);
		
		tech=new JMenu("Search");
		tech.setFont(new Font("Segoe UI", Font.BOLD, 14));
		tech.setMnemonic('S');
		mb.add(tech);
		
		sr=new JMenu("Bill");
		sr.setFont(new Font("Segoe UI", Font.BOLD, 14));
		sr.setMnemonic('B');
		mb.add(sr);
		
		dis=new JMenu("Display");
		dis.setFont(new Font("Segoe UI", Font.BOLD, 14));
		dis.setMnemonic('D');
		mb.add(dis);
		
		h=new JMenu("Help");
		h.setFont(new Font("Segoe UI", Font.BOLD, 14));
		h.setMnemonic('H');
		mb.add(h);
		
		a=new JMenuItem("Adinfo");
		a.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,Event.CTRL_MASK));
		std.add(a);
		
		b=new JMenuItem("modify");
		b.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,Event.CTRL_MASK));
		std.add(b);
		
		c=new JMenuItem("delete");
		c.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,Event.CTRL_MASK));
		std.add(c);
		
		e=new JMenuItem("exit");
		e.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,Event.CTRL_MASK));
		std.add(e);
		
		g=new JMenuItem("Print");
		g.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,Event.CTRL_MASK));
		sr.add(g);
		
		dt=new JMenuItem("Miter no");
		dt.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T,Event.CTRL_MASK));
		tech.add(dt);
		
		d1=new JMenuItem("All details");
		d1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,Event.CTRL_MASK));
		dis.add(d1);
		
		h1=new JMenuItem("Shortcut Keys");
		h1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,Event.CTRL_MASK));
		h.add(h1);	
		
		h2=new JMenuItem("Help About Project");
		h2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,Event.CTRL_MASK));
		h.add(h2);
		
		setJMenuBar(mb);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		e.addActionListener(this);
		g.addActionListener(this);
		dt.addActionListener(this);
		d1.addActionListener(this);
		h1.addActionListener(this);
		h2.addActionListener(this);
		
		setSize(820,722);
		setLocation(250,10);
		setVisible(true);
		setResizable(false);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==a)
		{
			setVisible(true);
			adinfo ad=new adinfo();
			ad.setVisible(true);
		}
		if(ae.getSource()==b)
		{
			setVisible(true);
			modinfo md=new modinfo();
			md.setVisible(true);
		}
		if(ae.getSource()==c)
		{
			setVisible(true);
			delete dt=new delete();
			dt.setVisible(true);
		}
		if(ae.getSource()==e)
		{
			frame=new JFrame();
			if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Exit System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
			{
				System.exit(0);
			}
		}
		if(ae.getSource()==dt)
		{
			setVisible(true);
			Search s=new Search();
			s.setVisible(true);
		}
		if(ae.getSource()==d1)
		{
			setVisible(true);
			Display1 d=new Display1();
			d.setVisible(true);
		}
		if(ae.getSource()==h1)
		{
			setVisible(true);
			Help2 he=new Help2();
			he.setVisible(true);
		}
		if(ae.getSource()==h2)
		{
			setVisible(true);
			Projecthelp po=new Projecthelp();
			po.setVisible(false);
		}
		if(ae.getSource()==g)
		{
			setVisible(true);
			print e =new print();
			e.setVisible(true);
		}
	}
}