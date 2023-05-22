package modelo;

public class ProductoMenu {

	private String nombre;
	private Integer precioBase;
	
	public ProductoMenu(String  nombre1, int precioBase1)
	{
		this.nombre = nombre1;
		this.precioBase = precioBase1;
	}
	public String getNombre()
	{
		return nombre;
	}
	public Integer getPrecio()
	{
		return precioBase;
	}
	public String generarTextoFactura()
	{
		return null;
		
	}
}
