/**
 * 
 */
package database;

import gui.AlertWindow;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author felipechapa
 *
 */
public class ExcelDatabase {
/**
 * This class creates the CSV files for each store, in case one is not found, a default file is created. 
 *
 * 
 * @param csvPath String Location for the CSV to be created
 * @param comboBoxContent String containing the selected comboBox element to search for it on the CSV
 * @param changeValue  int Input value to be added or subtracted
 * @param inventory List of string arrays used for reading the CSV file and manipulate its content before rewriting
 * @param listFiller Array of strings containing all the items on the inventory to fill the default CSV
 */
		
	public static void CSVEditor(String csvPath, String comboBoxContent, int changeValue){
		String[] listFiller = new String[]{"Disco en seco 7in", "Granito", "Marmol", "Porcelanato"
				,"Disco en seco 4.5in", "Granito", "Marmol", "Porcelanato",
				"Copa para desvaste", "Gruesa Milimetrica", "Gruesa Estandar", "Mediana Milimetrica", 
				"Mediana Estandar", "Fina Milimetrica", "Fina Estandar", "Broca 3/4in", "Milimetrica", "Estandar",
				"Respaldo para lijas","Milimetrica","Estandar",
				"Lijas Diamantadas (Seco)", "50", "100", "200", "400", "600", "800",
				"Lijas Diamantadas (Agua)", "50", "100", "200", "400", "600", "800",
				"Pegamento", "20kg", "4kg","1kg"};
		String line = "";
		String csvSplitBy = ",";
		BufferedReader br = null;
		FileWriter writer;
		List<String[]> inventory = new ArrayList<String[]>();
		String[] inventoryContent = new String[2];
		try{
		br = new BufferedReader(new FileReader(csvPath));
		while((line = br.readLine()) != null){
			inventoryContent = line.split(csvSplitBy);
			inventory.add(inventoryContent);
		}
			}catch(FileNotFoundException e){	
		try{	
			
		
				inventoryContent[0] = "Producto";
				inventoryContent[1] = "Cantidad";
				inventory.add(inventoryContent);
				
				String[] inventoryContent2 = new String[2];
				String[] inventoryContent3 = new String[2];
				String[] inventoryContent4 = new String[2];
				String[] inventoryContent5 = new String[2];
				String[] inventoryContent6 = new String[2];
				String[] inventoryContent7 = new String[2];
				String[] inventoryContent8 = new String[2];
				String[] inventoryContent9 = new String[2];
				String[] inventoryContent10 = new String[2];
				String[] inventoryContent11= new String[2];
				String[] inventoryContent12= new String[2];
				String[] inventoryContent13= new String[2];
				String[] inventoryContent14= new String[2];
				String[] inventoryContent15= new String[2];
				String[] inventoryContent16= new String[2];
				String[] inventoryContent17= new String[2];
				String[] inventoryContent18 = new String[2];
				String[] inventoryContent19=  new String[2];
				String[] inventoryContent20= new String[2];
				String[] inventoryContent21= new String[2];
				String[] inventoryContent22= new String[2];
				String[] inventoryContent23= new String[2];
				String[] inventoryContent24= new String[2];
				String[] inventoryContent25= new String[2];
				String[] inventoryContent26= new String[2];
				String[] inventoryContent27= new String[2];
				String[] inventoryContent28= new String[2];
				String[] inventoryContent29= new String[2];
				String[] inventoryContent30= new String[2];
				String[] inventoryContent31= new String[2];
				String[] inventoryContent32= new String[2];
				String[] inventoryContent33= new String[2];
				String[] inventoryContent34= new String[2];
				String[] inventoryContent35= new String[2];
				String[] inventoryContent36= new String[2];
				String[] inventoryContent37= new String[2];
				String[] inventoryContent38= new String[2];
				String[] inventoryContent39= new String[2];
				String[] inventoryContent40 = new String[2];
				
				inventoryContent2[0] = listFiller[0];
				inventoryContent2[1] = " ";
				inventory.add(inventoryContent2);
				inventoryContent3[0] = listFiller[1];
				inventoryContent3[1] = "0";
				inventory.add(inventoryContent3);
				inventoryContent4[0] = listFiller[2];
				inventoryContent4[1] = "0";
				inventory.add(inventoryContent4);
				inventoryContent5[0] = listFiller[3];
				inventoryContent5[1] = "0";
				inventory.add(inventoryContent5);
				inventoryContent6[0] = listFiller[4];
				inventoryContent6[1] = " ";
				inventory.add(inventoryContent6);
				inventoryContent7[0] = listFiller[5];
				inventoryContent7[1] = "0";
				inventory.add(inventoryContent7);
				inventoryContent8[0] = listFiller[6];
				inventoryContent8[1] = "0";
				inventory.add(inventoryContent8);
				inventoryContent9[0] = listFiller[7];
				inventoryContent9[1] = "0";
				inventory.add(inventoryContent9);
				inventoryContent10[0] = listFiller[8];
				inventoryContent10[1] = " ";
				inventory.add(inventoryContent10);
				inventoryContent11[0] = listFiller[9];
				inventoryContent11[1] = "0";
				inventory.add(inventoryContent11);
				inventoryContent12[0] = listFiller[10];
				inventoryContent12[1] = "0";
				inventory.add(inventoryContent12);
				inventoryContent13[0] = listFiller[11];
				inventoryContent13[1] = "0";
				inventory.add(inventoryContent13);
				inventoryContent14[0] = listFiller[12];
				inventoryContent14[1] = "0";
				inventory.add(inventoryContent14);
				inventoryContent15[0] = listFiller[13];
				inventoryContent15[1] = "0";
				inventory.add(inventoryContent15);
				inventoryContent16[0] = listFiller[14];
				inventoryContent16[1] = "0";
				inventory.add(inventoryContent16);
				inventoryContent17[0] = listFiller[15];
				inventoryContent17[1] = " ";
				inventory.add(inventoryContent17);
				inventoryContent18[0] = listFiller[16];
				inventoryContent18[1] = "0";
				inventory.add(inventoryContent18);
				inventoryContent19[0] = listFiller[17];
				inventoryContent19[1] = "0";
				inventory.add(inventoryContent19);
				inventoryContent20[0] = listFiller[18];
				inventoryContent20[1] = " ";
				inventory.add(inventoryContent20);
				inventoryContent21[0] = listFiller[19];
				inventoryContent21[1] = "0";
				inventory.add(inventoryContent21);
				inventoryContent22[0] = listFiller[20];
				inventoryContent22[1] = "0";
				inventory.add(inventoryContent22);
				inventoryContent23[0] = listFiller[21];
				inventoryContent23[1] = " ";
				inventory.add(inventoryContent23);
				inventoryContent24[0] = listFiller[22];
				inventoryContent24[1] = "0";
				inventory.add(inventoryContent24);
				inventoryContent25[0] = listFiller[23];
				inventoryContent25[1] = "0";
				inventory.add(inventoryContent25);
				inventoryContent26[0] = listFiller[24];
				inventoryContent26[1] = "0";
				inventory.add(inventoryContent26);
				inventoryContent27[0] = listFiller[25];
				inventoryContent27[1] = "0";
				inventory.add(inventoryContent27);
				inventoryContent28[0] = listFiller[26];
				inventoryContent28[1] = "0";
				inventory.add(inventoryContent28);
				inventoryContent29[0] = listFiller[27];
				inventoryContent29[1] = "0";
				inventory.add(inventoryContent29);
				inventoryContent30[0] = listFiller[28];
				inventoryContent30[1] = " ";
				inventory.add(inventoryContent30);
				inventoryContent31[0] = listFiller[29];
				inventoryContent31[1] = "0";
				inventory.add(inventoryContent31);
				inventoryContent32[0] = listFiller[30];
				inventoryContent32[1] = "0";
				inventory.add(inventoryContent32);
				inventoryContent33[0] = listFiller[31];
				inventoryContent33[1] = "0";
				inventory.add(inventoryContent33);
				inventoryContent34[0] = listFiller[32];
				inventoryContent34[1] = "0";
				inventory.add(inventoryContent34);
				inventoryContent35[0] = listFiller[33];
				inventoryContent35[1] = "0";
				inventory.add(inventoryContent35);
				inventoryContent36[0] = listFiller[34];
				inventoryContent36[1] = "0";
				inventory.add(inventoryContent36);
				inventoryContent37[0] = listFiller[35];
				inventoryContent37[1] = " ";
				inventory.add(inventoryContent37);
				inventoryContent38[0] = listFiller[36];
				inventoryContent38[1] = "0";
				inventory.add(inventoryContent38);
				inventoryContent39[0] = listFiller[37];
				inventoryContent39[1] = "0";
				inventory.add(inventoryContent39);
				inventoryContent40[0] = listFiller[38];
				inventoryContent40[1] = "0";
				inventory.add(inventoryContent40);
				
		} catch(Exception e2){
			e.printStackTrace();
		}
		}catch(IOException e){
			e.printStackTrace();
		}	
			try{
					int currentValue = 0;
					String[] temporal = new String[2];
					Boolean succes = false;
					String tempType = gui.Gui.productType;
					
					for(int i = 0 ; i < inventory.size() ; i++){
						if(inventory.get(i)[0].equals(tempType)){
							while(i < inventory.size()){
							if(inventory.get(i)[0].equals(comboBoxContent) && comboBoxContent != gui.Gui.productType ){//Checks for the wanted inventory item
								currentValue = Integer.parseInt(inventory.get(i)[1]);
							
								if( gui.Gui.typeOfOperation == false){
									currentValue = currentValue - changeValue;
								}
								else if(gui.Gui.typeOfOperation == true){
										currentValue = currentValue + changeValue;
								}
								if(changeValue < 0){//Displays a warning for a value lower than 0
									AlertWindow error = new AlertWindow();
									error.setVisible(true);
									error.setPreferredSize( new Dimension( 455, 200 ));
									error.pack();
									error.setTitle("Cantidad invalida.");
									error.setLocationRelativeTo( null );
									error.setWarning("No es posible realizar operación, por favor verifique el resultado: " + currentValue);
									break;
								}
								
								else if(currentValue <= 20 && changeValue >= 0 ){//Displays a warning for low stock
									AlertWindow lowStock = new AlertWindow();
									lowStock.setVisible(true);
									lowStock.setPreferredSize( new Dimension( 350, 200 ));
									lowStock.pack();
									lowStock.setTitle("Producto bajo");
									lowStock.setLocationRelativeTo( null );
									lowStock.setWarning( gui.Gui.productType + "(" + comboBoxContent + ")" + " quedan: " + currentValue);
								}
								temporal[0] = inventory.get(i)[0];
								temporal[1] = String.valueOf(currentValue);
								inventory.set(i, temporal);
								succes = true;
								break;
							}
							i++;
						}
						
						}
						writer = new FileWriter(csvPath);
								for(int p=0 ; p < inventory.size() ; p++){//The whole inventory list is rewritten with the changes
									writer.append(inventory.get(p)[0]);
									writer.append(',');
									writer.append(inventory.get(p)[1]);
									writer.append('\n');
								}
								writer.flush();
								writer.close();	
						
					}
					if(succes == false){
						System.out.println("no se encontró el producto");
					}	
			}catch (Exception e){
				System.out.println("Opcion incorrecta");
			}
			
			
		
	}
}

