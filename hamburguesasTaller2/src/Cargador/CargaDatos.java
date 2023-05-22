package Cargador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CargaDatos {
	public static void cargarArchivo() throws FileNotFoundException, IOException
	{
		Map<String, Integer> ingredientes = new HashMap<>();
		Map<String, Integer> menu = new HashMap<>();
		Map<String, List<String>> combos = new HashMap<>();
		Map<String, Integer> bebidas = new HashMap<>();

		BufferedReader ingredienteRead = new BufferedReader(new FileReader("ingredientes.txt"));
		BufferedReader menuRead = new BufferedReader(new FileReader("menu.txt"));
		BufferedReader comboRead = new BufferedReader(new FileReader("combos.txt"));
		BufferedReader bebidaRead = new BufferedReader(new FileReader("bebidas.txt"));
		
		String lineaIngre = ingredienteRead.readLine(); 
		String lineaMenu = menuRead.readLine(); 
		String lineaCombo = comboRead.readLine(); 
		String lineaBebida = bebidaRead.readLine();
		
		//CARGA DE DATOS MENÚ 
		try
		{
		while (lineaIngre != null) 
		{
			
			String[] partes = lineaIngre.split(";");
			String nombreIngrediente = partes[0];
			String precioIngrediente1 = partes[1];
			Integer precioIngrediente = Integer.parseInt(precioIngrediente1);
	
			
			ingredientes.put(nombreIngrediente, precioIngrediente);
			lineaIngre = ingredienteRead.readLine();
		}

			//CARGA DE DATOS INGREDIENTES  
		while (lineaMenu != null) 
		{
			
			String[] partes2 = lineaMenu.split(";");
			String nombre = partes2[0];
			String precio1 = partes2[1];
			Integer precio = Integer.parseInt(precio1);
		
			ingredientes.put(nombre, precio);
			lineaMenu = menuRead.readLine(); 
					
		}		
				
				
				//CARGA DE DATOS COMBOS  
		while (lineaCombo != null) 
			{
				List<String> Combos = new ArrayList<>();
				String[] partes3 = lineaCombo.split(";");
				String nombreCombo = partes3[0];
				String descuento = partes3[1];
				String hamburgesa = partes3[2];
				String papas = partes3[3];
				String gaseosa = partes3[4];
					
					
				Combos.add(descuento);
				Combos.add(hamburgesa);
				Combos.add(papas);
				Combos.add(gaseosa);
					
			
				combos.put(nombreCombo, Combos);
				lineaCombo = comboRead.readLine();
					
					
			}
				
				//CARGA DE DATOS BEBIDAS SOLO 
		while (lineaBebida != null) 
			{

				String[] partes3 = lineaBebida.split(";");
				String nombreBebida = partes3[0];
				String precioBebida1 = partes3[1];
				Integer precioBebida = Integer.parseInt(precioBebida1);
			
					
				bebidas.put(nombreBebida, precioBebida);
				lineaBebida = bebidaRead.readLine();
				
					
			}

		bebidaRead.close();
		menuRead.close();
		ingredienteRead.close();
		comboRead.close();
		}
		catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());

		System.out.println(menu);
		System.out.println(ingredientes);
		System.out.println(combos);
		System.out.println(bebidas);
	}
	}
}
