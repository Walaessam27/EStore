import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;


public class Frame1  {

public static void main (String[] args) {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	frame.setSize(600,400);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.add(panel); 
	panel.setLayout(null);
	
	JLabel userLabel = new JLabel("User:");
	userLabel.setBounds(10,20,40,25);
	panel.add(userLabel);
	
	JTextField userText=new JTextField();
	userText.setBounds(100,20,160,25);
	panel.add(userText);
	
	JLabel passLabel = new JLabel("Password:");
	passLabel.setBounds(10,50,80,25);
	panel.add(passLabel);
	
	JPasswordField passText=new JPasswordField();
	passText.setBounds(100,50,160,25);
	panel.add(passText);
	
	JButton button= new JButton("login :)");
	button.setBounds(30,100,80, 30);
	button.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			EStore.authenticate_user(userText.getText(),passText.getText());
			Frame2 frame2=new Frame2();
			
		}
		
	});
    panel.add(button);

}


}
