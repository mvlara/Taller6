package modelo;

public class Combo implements Producto{

	private double descuento;
	private String nombreCombo;
	
	public Combo(String nombre, double descuento)
	{
		this.nombreCombo = nombre;
		this.descuento = descuento;
	}
	public static void agregarItem(Producto ItemCombo)
	{
		
	}
	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String generarTextoFactura() {
		// TODO Auto-generated method stub
		return null;
	}

}
