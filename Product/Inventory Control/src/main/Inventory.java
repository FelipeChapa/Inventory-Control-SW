/**
 * 
 */
package main;

import java.awt.Dimension;

import javax.swing.JFrame;

import gui.AlertWindow;
import gui.Gui;

/**
 * @author felipechapa
 *
 */
public class Inventory {

	/**
	 * Main class which runs the program at a standard size of 575,400
	 * @param objectGui Gui first window to be displayed
	 */
	public static void main(String[] args) {
		Gui objectGui = new Gui();
		objectGui.setVisible(true);
		objectGui.setPreferredSize( new Dimension( 575, 400 ));
		objectGui.pack();
		objectGui.setTitle("Company");
		objectGui.setLocationRelativeTo( null );
		objectGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
