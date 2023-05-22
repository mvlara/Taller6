package modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Cargador.CargaDatos;
public class Aplicacion {
	public Aplicacion() {
		// TODO Auto-generated constructor stub
	}

	/**
	MÉTODO PRINCIPAL 
	 */
	public static void main(String[] args)
	{
		Aplicacion consola = new Aplicacion();
		consola.ejecutarAplicacion();
	}
	


	public void ejecutarAplicacion()
	{
		System.out.println("\nHamburguesas\n");
		
		
		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int seleccion = Integer.parseInt(input("Seleccione una opción"));
				
				if (seleccion == 1)
					ejecutarCarga();
				else if (seleccion == 2)
					ejecutarMostrarMenu();
				else if (seleccion == 3)
					ejecutarIniciarNuevoPedido();
				else if (seleccion == 4)
					ejecutarAgregarElementoPedido();
				else if (seleccion == 5)
					ejecutarCerrarPedidoFactura();
				else if (seleccion == 6)
					ejecutarConsultarInfoPedido();	
				else if (seleccion == 7)
				{
					System.out.println("Cerrando sesión...\n");
					continuar = false;
				}
				else
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	private void ejecutarConsultarInfoPedido() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarCerrarPedidoFactura() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarAgregarElementoPedido() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarIniciarNuevoPedido() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarMostrarMenu() {
		// TODO Auto-generated method stub
		
	}

	private void ejecutarCarga() {
		// TODO Auto-generated method stub
		
	}

	private String input(String mensaje) {
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

	public void mostrarMenu()
	{
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Cargar archivos ");
		System.out.println("2. Mostrar Menú ");
		System.out.println("3. Iniciar Nuevo Pedido");
		System.out.println("4. Agregar elemento a pedido");
		System.out.println("5. Cerrar pedido y generar factura");
		System.out.println("6. Consultar info de un pedido");
		System.out.println("7. Salir de la aplicación\n");
		
		
		
	}
	
	
}
