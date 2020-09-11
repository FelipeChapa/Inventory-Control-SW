/**
 * 
 */
package gui;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import database.ExcelDatabase;

/**
 * @author felipechapa
 *
 */
public class Gui extends JFrame{
	/**
	 * @param storesOption JPanel panel for the store selection
	 * @param salesArrivals JPanel panel for choosing to input sales or arrivals
	 * @param backPanel JPanel panel containing the other panels
	 * @param specificProduct JPanel contains the comboBoxes and JLabels
	 * @param backButton JPanel contains the back button
	 * @param panelTracker int Keeps track of the current panel
	 * @param storeTracker int keeps track of the selected store
	 * @param productType String used for saving and reusing the product type selected for change
	 * @param typeOfOperation Boolean used for saving the arrivals or sales decision
	 * @param quantity1 JTextField Text field for entering the changing amount
	 * @param quantity2 JTextField Text field for entering the changing amount
	 * @param quantity3 JTextField Text field for entering the changing amount
	 * @param quantity4 JTextFieldText field for entering the changing amount
	 * @param quantity5 JTextField Text field for entering the changing amount
	 * @param quantity6 JTextFieldText field for entering the changing amount
	 * @param quantity7 JTextField Text field for entering the changing amount
	 * @param quantity8 JTextField Text field for entering the changing amount
	 * @param comboBoxDiscoSiete JComboBox contains the product names on this category
	 * @param comboBoxDiscoCuatro JComboBox contains the product names on this category
	 * @param comboBoxCopa JComboBox contains the product names on this category
	 * @param comboBoxBroca JComboBox contains the product names on this category
	 * @param comboBoxRespaldo JComboBox contains the product names on this category
	 * @param comboBoxLijasAgua JComboBox contains the product names on this category
	 * @param comboBoxLijasSeco JComboBox contains the product names on this category
	 * @param comboBoxPegamento JComboBox contains the product names on this category
	 */

	private static final long serialVersionUID = 1L;

	private JPanel storesOption = new JPanel (new GridLayout(2,3));
	private JPanel salesArrivals = new JPanel(new GridLayout());
	private JPanel backPanel = new JPanel(new GridBagLayout());
	private JPanel specificProduct = new JPanel(new GridLayout(8,2));
	private JPanel backButton = new JPanel(new GridLayout());
	private int panelTracker = 0;
	private int storeTracker = 0;
	public static String productType;
	public static boolean typeOfOperation;
	public JTextField quantity1 = new JTextField();
	private JTextField quantity2 = new JTextField();
	private JTextField quantity3 = new JTextField();
	private JTextField quantity4 = new JTextField();
	private JTextField quantity5 = new JTextField();
	private JTextField quantity6 = new JTextField();
	private JTextField quantity7 = new JTextField();
	private JTextField quantity8 = new JTextField();
	private JComboBox comboBoxDiscoSiete;
	private JComboBox comboBoxDiscoCuatro;
	private JComboBox comboBoxCopa;
	private JComboBox comboBoxBroca;
	private JComboBox comboBoxRespaldo;
	private JComboBox comboBoxLijasAgua;
	private JComboBox comboBoxLijasSeco;
	private JComboBox comboBoxPegamento;
	private File path;
	
	public Gui(){

		JButton store1 = new JButton("Principal");
		store1.addActionListener(new ListenToStore());
		
		JButton store2 = new JButton("Santa Catarina");
		store2.addActionListener(new ListenToStore());
		
		JButton store3 = new JButton("Vasconcelos");
		store3.addActionListener(new ListenToStore());

		JButton store4 = new JButton("Cancun");
		store4.addActionListener(new ListenToStore());

		JButton back = new JButton("Atras");
		back.addActionListener(new ListenToBack());
		
		JButton arrivals = new JButton("Llegadas");
		arrivals.addActionListener(new ListenToArrivals());
		
		JButton sales = new JButton("Ventas");
		sales.addActionListener(new ListenToSales());
		
		String[] tiposDiscoSiete = new String[]{"Disco en seco 7in", "Granito", "Marmol", "Porcelanato"};
		String[] tiposDiscoCuatro = new String[]{"Disco en seco 4.5in", "Granito", "Marmol", "Porcelanato"};
		String[] tiposEntradaCopa = new String[]{"Copa para desvaste", "Gruesa Milimetrica", "Gruesa Estandar", "Mediana Milimetrica", 
				"Mediana Estandar", "Fina Milimetrica", "Fina Estandar"};
		String[] tiposBroca = new String[]{"Broca 3/4in", "Milimetrica", "Estandar"};
		String[] tiposRespaldo = new String[]{"Respaldo para lijas", "Milimetrica", "Estandar"};
		String[] tiposLijasSeco = new String[]{"Lijas Diamantadas (Seco)", "50", "100", "200", "400", "600", "800"};
		String[] tiposLijasAgua = new String[]{"Lijas Diamantadas (Agua)", "50", "100", "200", "400", "600", "800"};
		String[] tiposPegamento = new String[]{"Pegamento", "20kg", "4kg","1kg"};
		
		comboBoxDiscoSiete = new JComboBox(tiposDiscoSiete);
		comboBoxDiscoCuatro = new JComboBox(tiposDiscoCuatro);
		comboBoxCopa = new JComboBox(tiposEntradaCopa);
		comboBoxBroca = new JComboBox(tiposBroca);
		comboBoxRespaldo = new JComboBox(tiposRespaldo);
		comboBoxLijasAgua = new JComboBox(tiposLijasAgua);
		comboBoxLijasSeco = new JComboBox(tiposLijasSeco);
		comboBoxPegamento = new JComboBox(tiposPegamento);
		
		quantity1.addActionListener(new ListenToTextQuantity1());
		quantity2.addActionListener(new ListenToTextQuantity2());
		quantity3.addActionListener(new ListenToTextQuantity3());
		quantity4.addActionListener(new ListenToTextQuantity4());
		quantity5.addActionListener(new ListenToTextQuantity5());
		quantity6.addActionListener(new ListenToTextQuantity6());
		quantity7.addActionListener(new ListenToTextQuantity7());
		quantity8.addActionListener(new ListenToTextQuantity8());
		
		specificProduct.add(comboBoxDiscoSiete);
		specificProduct.add(quantity1);
		
		specificProduct.add(comboBoxDiscoCuatro);
		specificProduct.add(quantity2);

		specificProduct.add(comboBoxCopa);
		specificProduct.add(quantity3);

		specificProduct.add(comboBoxBroca);
		specificProduct.add(quantity4);

		specificProduct.add(comboBoxRespaldo);
		specificProduct.add(quantity5);

		specificProduct.add(comboBoxLijasSeco);
		specificProduct.add(quantity6);

		specificProduct.add(comboBoxLijasAgua);
		specificProduct.add(quantity7);

		specificProduct.add(comboBoxPegamento);
		specificProduct.add(quantity8);
		
		store1.setPreferredSize(new Dimension(150, 75));
		store2.setPreferredSize(new Dimension(150, 75));
		store3.setPreferredSize(new Dimension(150, 75));
		store4.setPreferredSize(new Dimension(150, 75));
		storesOption.add(store1);
		storesOption.add(store2);
		storesOption.add(store3);
		storesOption.add(store4);
		
		back.setPreferredSize(new Dimension(125, 50));
		backButton.add(back);

		arrivals.setPreferredSize(new Dimension(150, 75));
		sales.setPreferredSize(new Dimension(150, 75));
		salesArrivals.add(arrivals);
		salesArrivals.add(sales);
		
		storesOption.setSize(400,500);
				backPanel.add(storesOption);
		add(backPanel);
		
	}
	/**
	 * Resets comboBoxes to their first value
	 */
public void resetComboBox(){
	comboBoxDiscoSiete.setSelectedIndex(0);
	comboBoxDiscoCuatro.setSelectedIndex(0);
	comboBoxCopa.setSelectedIndex(0);
	comboBoxBroca.setSelectedIndex(0);
	comboBoxRespaldo.setSelectedIndex(0);
	comboBoxLijasAgua.setSelectedIndex(0);
	comboBoxLijasSeco.setSelectedIndex(0);
	comboBoxPegamento.setSelectedIndex(0);
}
	 
class ListenToStore implements ActionListener{
	/**
	 * Listener for the first window of the program containing the storesOption buttons
	 * @param e ActionEvent Gets the command from the buttons on the storesOption panel
	 * @param panelTracker int used for keeping track of the current panel
	 * @param storeTracker int used for keeping track of the selected store
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Principal")){
			backPanel.remove(storesOption);
			backPanel.add(backButton);
			backPanel.add(salesArrivals);
			backPanel.revalidate();
			backPanel.repaint();
			panelTracker = 1;
			storeTracker = 1;
			pack();
		}
		if(e.getActionCommand().equals("Vasconcelos")){
			backPanel.remove(storesOption);
			backPanel.add(backButton);
			backPanel.add(salesArrivals);
			backPanel.revalidate();
	        backPanel.repaint();
	        panelTracker = 1;
	        storeTracker = 2;
	        pack();
		}
		if(e.getActionCommand().equals("Santa Catarina")){
			backPanel.remove(storesOption);
			backPanel.add(backButton);
			backPanel.add(salesArrivals);
			backPanel.revalidate();
	        backPanel.repaint();
	        panelTracker = 1;
	        storeTracker = 3;
	        pack();
		}
		if(e.getActionCommand().equals("Cancun")){
			backPanel.remove(storesOption);
			backPanel.add(backButton);
			backPanel.add(salesArrivals);
			backPanel.revalidate();
	        backPanel.repaint();
	        panelTracker = 1;
	        storeTracker = 4;
	        pack();
		}
	}
}
class ListenToBack implements ActionListener{
	/**
	 * Listener for the back button which depending on the panel sets the previous panel.
	 * @param e ActionEvent Gets the command from the back button
	 * @param panelTracker int used for keeping track of the current panel
	 */
	public void actionPerformed(ActionEvent e) {
		if(panelTracker == 1){
			backPanel.remove(salesArrivals);
			backPanel.remove(backButton);
			backPanel.add(storesOption);
			backPanel.revalidate();
	        backPanel.repaint();
	        panelTracker = 0;
	        pack();
		}
		if(panelTracker == 2){
			backPanel.remove(specificProduct);
			backPanel.add(salesArrivals);
			backPanel.revalidate();
	        backPanel.repaint();
	        panelTracker = 1;
	        pack();
		}
	}
}
class ListenToArrivals implements ActionListener{
	/**
	 * Listener for the sales button which shows the next panel and sets a boolean to add inventory
	 * @param e ActionEvent Gets the command from the arrivals button
	 * @param panelTracker int used for keeping track of the current panel
	 */
	public void actionPerformed(ActionEvent e) {
		backPanel.remove(salesArrivals);
		backPanel.add(specificProduct);
		backPanel.revalidate();
        backPanel.repaint();
        panelTracker = 2;
        resetComboBox();
       gui.Gui.typeOfOperation = true;
        pack();
	}
}
class ListenToSales implements ActionListener{
	/**
	 * Listener for the sales button which shows the next panel and sets a boolean to subtract inventory 
	 * @param e ActionEvent Gets the command from the sales button
	 * @param panelTracker int used for keeping track of the current panel
	 */
	public void actionPerformed(ActionEvent e) {
		backPanel.remove(salesArrivals);
		backPanel.add(specificProduct);
		backPanel.revalidate();
        backPanel.repaint();
        panelTracker = 2;
        resetComboBox();
        gui.Gui.typeOfOperation = false;
        pack();
	}

}
class ListenToTextQuantity1  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity1 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Disco en seco 7in";
		
		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoSiete.getSelectedItem() , Integer.parseInt(quantity1.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoSiete.getSelectedItem() , Integer.parseInt(quantity1.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoSiete.getSelectedItem() , Integer.parseInt(quantity1.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoSiete.getSelectedItem() , Integer.parseInt(quantity1.getText()));
			
		}
		quantity1.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity2  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity2 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Disco en seco 4.5in";
		
		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoCuatro.getSelectedItem() , Integer.parseInt(quantity2.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoCuatro.getSelectedItem() , Integer.parseInt(quantity2.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoCuatro.getSelectedItem() , Integer.parseInt(quantity2.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxDiscoCuatro.getSelectedItem() , Integer.parseInt(quantity2.getText()));
			
		}
		quantity2.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity3  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity3 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Copa para desvaste";

		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxCopa.getSelectedItem() , Integer.parseInt(quantity3.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxCopa.getSelectedItem() , Integer.parseInt(quantity3.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxCopa.getSelectedItem() , Integer.parseInt(quantity3.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxCopa.getSelectedItem() , Integer.parseInt(quantity3.getText()));
			
		}
		quantity3.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity4  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity4 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Broca 3/4in";

		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxBroca.getSelectedItem() , Integer.parseInt(quantity4.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxBroca.getSelectedItem() , Integer.parseInt(quantity4.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxBroca.getSelectedItem() , Integer.parseInt(quantity4.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxBroca.getSelectedItem() , Integer.parseInt(quantity4.getText()));
			
		}
		quantity4.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity5  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity5 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Respaldo para lijas";

		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxRespaldo.getSelectedItem() , Integer.parseInt(quantity5.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxRespaldo.getSelectedItem() , Integer.parseInt(quantity5.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxRespaldo.getSelectedItem() , Integer.parseInt(quantity5.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxRespaldo.getSelectedItem() , Integer.parseInt(quantity5.getText()));
			
		}
		quantity5.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity6  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity6 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Lijas Diamantadas (Seco)";

		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasSeco.getSelectedItem() , Integer.parseInt(quantity6.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasSeco.getSelectedItem() , Integer.parseInt(quantity6.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasSeco.getSelectedItem() , Integer.parseInt(quantity6.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasSeco.getSelectedItem() , Integer.parseInt(quantity6.getText()));
			
		}
		quantity6.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity7  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity7 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Lijas Diamantadas (Agua)";

		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasAgua.getSelectedItem() , Integer.parseInt(quantity7.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasAgua.getSelectedItem() , Integer.parseInt(quantity7.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasAgua.getSelectedItem() , Integer.parseInt(quantity7.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxLijasAgua.getSelectedItem() , Integer.parseInt(quantity7.getText()));
			
		}
		quantity7.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
class ListenToTextQuantity8  implements ActionListener{
	/**
	 * Listener for the input of changes for the inventory, sends a CSV path depending on the store selected
	 * @param e ActionEvent Gets the command from the quantity8 button
	 * @param storeTracker int used for keeping track of the selected store
	 * @param invalidInput AlertWindow creates and alert window object displaying an error in case an invalid character is entered
	 */
	public void actionPerformed(ActionEvent e) {
		try{
		gui.Gui.productType = "Pegamento";
		
		if(storeTracker == 1){
			path = new File(new File("Principal.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxPegamento.getSelectedItem() , Integer.parseInt(quantity8.getText()));
		}
		else if(storeTracker == 2){
			path = new File(new File("Vasconcelos.csv").getAbsolutePath());
			String csvPath = path.toString();			
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxPegamento.getSelectedItem() , Integer.parseInt(quantity8.getText()));
		}
		else if(storeTracker == 3){
			path = new File(new File("SantaCatarina.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxPegamento.getSelectedItem() , Integer.parseInt(quantity8.getText()));
		}
		else if(storeTracker == 4){
			path = new File(new File("Cancun.csv").getAbsolutePath());
			String csvPath = path.toString();
			ExcelDatabase.CSVEditor(csvPath, (String) comboBoxPegamento.getSelectedItem() , Integer.parseInt(quantity8.getText()));
			
		}
		quantity8.setText("");
		}catch (Exception e1){
			AlertWindow invalidInput = new AlertWindow();
			invalidInput.setPreferredSize(new Dimension(250 , 150));
			invalidInput.setLocationRelativeTo(null);
			invalidInput.setVisible(true);
			invalidInput.setTitle("Error");
			invalidInput.setWarning("Se introdujo una cantidad invalida");
			invalidInput.pack();
		}
	}
}
}
