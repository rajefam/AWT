package SampleApp;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.*;

import javax.swing.*;

public class Pro3 extends Applet implements ActionListener{
	private double  cd=0;

	public Pro3()
	{
		Frame f=new Frame();
		Font font=new Font("Dialog",Font.BOLD,30);
		Font font1=new Font("Dialog",Font.BOLD,20);
		Choice h=new Choice();
		Button add=new Button("Add");
		Button tv=new Button("Total Value");
		Button exit=new Button("Exit");
		Button ok=new Button("Menu");
		List kart=new List();
		
		
		Label l1,l2,l3,l4,l5,l6,end,ci,gst,amount,d,ta;  
		TextField t1,t2,t3,gstv,av,dv,fv;
		
	    l1=new Label("Hello,Welcome To User..!."); 
	    l1.setFont(font);
	    l1.setBounds(700,100, 1000,30);  
	    l2=new Label("Enter Your Name:"); 
	    l2.setFont(font);
	    l2.setBounds(50,150, 500,30);
	    l3=new Label("Enter Your Mobile No:"); 
	    l3.setFont(font);
	    l3.setBounds(50,200, 500,30);
	    l4=new Label("Enter Your Email:"); 
	    l4.setFont(font);
	    l4.setBounds(50,250, 500,30);
	    l5=new Label("Select Your Hotel:"); 
	    l5.setFont(font);
	    l5.setBounds(50,300, 500,30);
	    l6=new Label("Select Your Items:"); 
	    l6.setFont(font);
	    l6.setBounds(50,350, 500,30);
	   
	    
	    t1=new TextField(30);
	    t1.setFont(font1);
	    t1.setBounds(550, 150, 150, 30);
	    t2=new TextField(30);
	    t2.setFont(font1);
	    t2.setBounds(550, 200, 150, 30);
	    t3=new TextField(30);
	    t3.setFont(font1);
	    t3.setBounds(550, 250, 150, 30);
	    
	    h.add("-Select Hotel-");
	    h.add("Sitara");
	    h.add("Paradise");
	    h.add("Mephfil");
	    h.setFont(font1);
	    h.setBounds(550, 300, 150, 30);
	    
	   	    
	    Checkbox c1=new Checkbox("Chicken Biryani");
	    Checkbox c2=new Checkbox("Mutton Biryani");
	    Checkbox c3=new Checkbox("Veg Biryani");
	    Checkbox c4=new Checkbox("Chicken Burger");
	    Checkbox c5=new Checkbox("Veg Burger");
	    Checkbox c6=new Checkbox("Chicken Biryani Combo");
	    Checkbox c7=new Checkbox("Chicken Biryani Family Pack");
	    Checkbox c8=new Checkbox("Pepsi");
	    
	    c1.setFont(font1);
	    c2.setFont(font1);  
	    c3.setFont(font1);
	    c4.setFont(font1);
	    c5.setFont(font1);
	    c6.setFont(font1);
	    c7.setFont(font1);
	    c8.setFont(font1);


	/*    c1.setBounds(600, 350, 200, 25);
	    c2.setBounds(600, 400, 200, 25);
	    c3.setBounds(600, 450, 200, 25);
	    c4.setBounds(600, 500, 200, 25);
	    c5.setBounds(600, 550, 200, 25);
	    c6.setBounds(600, 600, 200, 25);
	    c7.setBounds(600, 650, 200, 25);
	    c8.setBounds(600, 700, 200, 25);			*/
	    
	     
	    ok.setFont(font1);
	    ok.setBounds(750, 300, 200, 35);
	    
	    ok.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	add.enable();
	        	if(h.getSelectedItem().equals("Sitara"))
	         	{
	        		//c1.setBounds(600, 350, 200, 25);
	        		c1.setBounds(600, 350, 200, 25);
	        		c2.setBounds(600, 400, 200, 25);
	        		c3.setBounds(600, 450, 200, 25);
	        		c6.setBounds(600, 500, 300, 25);
	        		c7.setBounds(600, 550, 300, 25);
	        		c8.setBounds(600, 600, 200, 25);
	        		
	         		f.add(c1);
	         		f.add(c2);
	         		f.add(c3);
	         		c4.setState(false);
	         		c4.hide();
	         		c5.setState(false);
	         		c5.hide();
	         		c6.show();
	         		f.add(c6);
	         		c7.show();
	         		f.add(c7);
	         		f.add(c8);
	         		
	           	}  
	        	
	        	if(h.getSelectedItem().equals("Paradise"))
	         	{
	        		//c1.setBounds(600, 350, 200, 25);
	        		c1.setBounds(600, 350, 200, 25);
	        		c2.setBounds(600, 400, 200, 25);
	        		c3.setBounds(600, 450, 200, 25);
	        		c4.setBounds(600, 500, 200, 25);
	        		c5.setBounds(600, 550, 200, 25);
	        		c6.setBounds(600, 600, 300, 25);
	        		c7.setBounds(600, 650, 300, 25);
	        		c8.setBounds(600, 700, 200, 25);
	        		
	         		f.add(c1);
	         		f.add(c2);
	         		f.add(c3);
	         		c4.show();
	         		f.add(c4);
	         		c5.show();
	         		f.add(c5);
	         		c6.show();
	         		f.add(c6);
	         		c7.show();
	         		f.add(c7);
	         		f.add(c8);
	         		
	         	}  
	        	
	        	if(h.getSelectedItem().equals("Mephfil"))
	         	{
	        		//c1.setBounds(600, 350, 200, 25);
	        		c1.setBounds(600, 350, 200, 25);
	        		c2.setBounds(600, 400, 200, 25);
	        		c3.setBounds(600, 450, 200, 25);
	        		c4.setBounds(600, 500, 200, 25);
	        		c5.setBounds(600, 550, 200, 25);
	        		c8.setBounds(600, 600, 200, 25);
	        		
	         		f.add(c1);
	         		f.add(c2);
	         		f.add(c3);
	         		c4.show();
	         		f.add(c4);
	         		c5.show();
	         		f.add(c5);
	         		c6.setState(false);
	         		c6.hide();
	         		c7.setState(false);
	         		c7.hide();
	         		f.add(c8);
	         		
	         	}  
	         }  
	    });
	    
	    
	    
	    add.setFont(font1);
	    add.setBounds(700, 750, 200, 35);
	    add.disable();
	       
	    
	    kart.setBounds(50, 400, 400, 400);
	    kart.setFont(font1);
	    
	    add.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){  
	        	tv.enable();
	        	String s="NULL";
	        	    if(c1.getState()==true)
	                {
	                	s="200";
	                	cd=cd+200;
	                	kart.add("Chicken Biryani"+"@"+s);
	                	//disable,hide,show
	                	c1.setState(false);
	                }
	                if(c2.getState()==true)
	                {
	                	s="250";
	                	cd=cd+250;
	                	kart.add("Mutton Biryani"+"@"+s);
	                	c2.setState(false);
	                }
	                if(c3.getState()==true)
	                {
	                	s="150";
	                	cd=cd+150;
	                	kart.add("Veg Biryani"+"@"+s);
	                	c3.setState(false);
	                }
	                if(c4.getState()==true)
	                {
	                	s="80";
	                	cd=cd+80;
	                	kart.add("Chicken Burger"+"@"+s);
	                	c4.setState(false);
	                }
	                if(c5.getState()==true)
	                {
	                	s="50";
	                	cd=cd+50;
	                	kart.add("Veg Burger"+"@"+s);
	                	c5.setState(false);
	                }
	                if(c6.getState()==true)
	                {
	                	s="350";
	                	cd=cd+350;
	                	kart.add("Chicken Biryani Combo"+"@"+s);
	                	c6.setState(false);
	                }  
	                if(c7.getState()==true)
	                {
	                	s="275";
	                	cd=cd+275;
	                	kart.add("Chicken Biryani Family"+"@"+s);
	                	c7.setState(false);
	                }  
	                if(c8.getState()==true)
	                {
	                	s="58";
	                	cd=cd+58;
	                	kart.add("Pepsi"+"@"+s);
	                	c8.setState(false);
	                }               
	                
	            }  
	    });
	    	    
	    
	    final TextField bill=new TextField(); 
	    bill.setBounds(1250,150,200,35); 
	    bill.setFont(font1);
	    /////
	    ci=new Label("Cost of Items:");
	    ci.setFont(font1);
	    ci.setBounds(1000,150, 200, 35);
	    
	    gst=new Label("GST (5%)");
	    gst.setBounds(1000, 200, 200, 35);
	    gst.setFont(font1);
	    
	    gstv=new TextField(30);
	    gstv.setFont(font1);
	    gstv.setBounds(1250, 200, 200, 35);
	    
	    amount=new Label("Amount:");
	    amount.setBounds(1000, 250, 200, 35);
	    amount.setFont(font1);
	    
	    av=new TextField(30);
	    av.setFont(font1);
	    av.setBounds(1250, 250, 200, 35);
	    
	    d=new Label("Discount(10%):");
	    d.setFont(font1);
	    d.setBounds(1000, 300, 200, 35);
	    
	    dv=new TextField();
	    dv.setFont(font1);
	    dv.setBounds(1250, 300, 200, 35);
	    
	    ta=new Label("Total Amount:");
	    ta.setFont(font1);
	    ta.setBounds(1000, 350, 200, 35);
	    
	    fv=new TextField();
	    fv.setFont(font1);
	    fv.setBounds(1250, 350, 200, 35);
	    
	    
	    /////
	       
	    tv.setFont(font1);
	    tv.setBounds(50, 825, 200, 35);
	    tv.disable();
	    tv.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	
	        	String cc=String.valueOf(cd);
	        	bill.setText(cc);
	        	
	        	/////
	        	f.add(ci);
	        	f.add(bill);
	        	
	        	f.add(gst);
	        	double g=((cd/100)*5);
	        	String gc=String.valueOf(g);
	        	gstv.setText(gc);
	        	
	        	f.add(gstv);
	        	f.add(amount);
	        	
	        	double avi=cd+((cd/100)*5);
	        	String avis=String.valueOf(avi);
	        	av.setText(avis);
	        	f.add(av);
	        	
	        	f.add(d);
	        	double dvi=((cd+g)/100)*10;
	        	String dvs=String.valueOf(dvi);
	        	dv.setText(dvs);
	        	f.add(dv);
	        	
	        	f.add(ta);
	        	
	        	double fvi=avi-dvi;
	        	String fvs=String.valueOf(fvi);
	        	fv.setText(fvs);
	        	f.add(fv);
	        	
	        	
	        	/////
	        	
	        }  
	    });
	    
	    
	    end=new Label("Thank You For Visit us!"); 
	    end.setFont(font);
	    end.setBounds(700,475,1000,30);
	    
	    
	    exit.setFont(font1);
	    exit.setBounds(550, 850, 200, 35);
	    exit.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	
	        	
	     	    f.removeAll();
	     	   
	         	f.add(end);
	        	
	        	Thread t=new Thread();
	        	try 
	        	{
					t.sleep(2000);
				}
	        	catch (InterruptedException e1)
	        	{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	System.exit(0);
	        	
	        }
	        });
	   
	        
	    
	    f.add(l1);
	    f.add(l2);
	    f.add(t1);
	    f.add(l3);
	    f.add(t2);
	    f.add(l4);
	    f.add(t3);
	    f.add(l5);
	    f.add(h);
	    f.add(ok);
	    f.add(l6);
	    f.add(add);
	    f.add(kart);
	    f.add(tv);
	    
	    f.add(exit);
	    
	    f.setSize(1800,1000);  
	    f.setLayout(null);  
	    f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

