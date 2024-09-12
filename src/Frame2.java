import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;
import javax.swing.*;

public class Frame2 {
	public static void main (String[] args) {
		JComboBox cm1;
		final String[]names= {"1. Show all items.","2. Display all users.","3. Change price of item.","4. Add new user.","5. Add copies to the items.","6. Quit."};
		final String[]names1= {"1. Add item to shopping cart.","2. View shopping cart.","4. Checkout.","5. List all items.","7. exit."}; 
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel); 
		panel.setLayout(null);
		

		JLabel Label = new JLabel("CHOOSE WHAT YOU ARE:");
		Label.setBounds(10,50,200,25);
		panel.add(Label);
		JButton adminbutton= new JButton("Admin.");
		adminbutton.setBounds(30,100,80, 30);
		
		JButton membutton= new JButton("Member.");
		membutton.setBounds(160,100,100, 30);
		
		adminbutton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				JComboBox cm1=new JComboBox(names);
				cm1.setMaximumRowCount(7);
				cm1.setVisible(true);
				cm1.setSize(160,30);
				cm1.setLocation(30, 140);
				membutton.setVisible(false);
				 panel.add(cm1);
				 
				 cm1.addItemListener(
						 new ItemListener() {
							 void state(ItemEvent event)
							 {
								 if (event.getItemSelectable().equals(names[0]))
									 EStore.admin_activities("1");
								 
									 
								 if (event.getItemSelectable().equals(names[1]))
									 {EStore.admin_activities("2");
								 JTextField shbText=new JTextField(EStore.user.toString());
								 shbText.setBounds(200,160,160,150);
									panel.add(shbText);
									 }
								 if (event.getItemSelectable().equals(names[2]))
									 EStore.admin_activities("3");
								 if (event.getItemSelectable().equals(names[3]))
									 EStore.admin_activities("4");
								 if (event.getItemSelectable().equals(names[4]))
									 EStore.admin_activities("5");
								 if (event.getItemSelectable().equals(names[5]))
									 EStore.admin_activities("6");
							
							 }

							@Override
							public void itemStateChanged(ItemEvent e) {
								// TODO Auto-generated method stub
								
							}							 
							 
							 
							 
						 } );
				 
				
			}
			
		});
	    panel.add(adminbutton);
	   
		
		
		membutton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JComboBox cm1=new JComboBox(names1);
				cm1.setMaximumRowCount(7);
				cm1.setVisible(true);
				cm1.setSize(200,30);
				cm1.setLocation(160, 140);
				adminbutton.setVisible(false);
				 panel.add(cm1);
				
			}
			
		});
	    panel.add(membutton);

	}


}
