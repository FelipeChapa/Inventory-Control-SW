package gui;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 */
import javax.swing.SwingConstants;

/**
 * @author felipechapa
 *
 */
public class AlertWindow extends JFrame implements ActionListener {
	/**
	 * Alert window generator for the different types of warnings or errors to be displayed on the graphic interface
	 * @param alertWindow JPanel GridBagLayout. The panel containing the buttons. 
	 * @param warningTitle JLabel set to be centered. Contains the top line of text on the window
	 * @param warning JLabel set to be centered.Contains the next line on the window
	 */
	private static final long serialVersionUID = 1L;
	private JPanel alertWindow = new JPanel(new GridBagLayout());
	public JLabel warningTitle = new JLabel(" ", SwingConstants.CENTER);
	public JLabel warning = new JLabel(" ", SwingConstants.CENTER);
	
	public AlertWindow(){
		JPanel alert = new JPanel(new GridLayout(3,1));
		JButton ok = new JButton("Ok");
		ok.addActionListener(this);
		alert.add(warningTitle);
		alert.add(warning);
		alert.add(ok);
		alertWindow.add(alert);
		getContentPane().add(alertWindow);
	}
	/**
	 * Sets the window as invisible when clicking the "Ok" button
	 * @param e ActionEvent registers the actions of a button
	 */
	public void actionPerformed(ActionEvent e){
	if(e.getActionCommand().equals("Ok")){
		this.setVisible(false);
		}
	}
	/**
	 * Setter for the characteristic of the alert window
	 * @param labelTitle String to change the characteristic of the alert window
	 */
	public void setTitle(String labelTitle){
		warningTitle.setText(labelTitle);
	}
	/**
	 * Setter for the explanation on the alert window
	 * @param title String to change the explanation of the alert window
	 */
	public void setWarning(String title){
		warning.setText(title);
	}
}
