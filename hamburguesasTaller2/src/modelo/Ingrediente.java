package modelo;

public class Ingrediente {
	private String nombre;
	private Integer costoAdicional;
	
	public Ingrediente (String nombre1, int costoAdicional1)
	{
		this.nombre = nombre1;
		this.costoAdicional = costoAdicional1;
				
	}
	public String getNombre()
	{
		return nombre;
	}
	
	public Integer getCostoAdicional()
	{
		return costoAdicional;
	}
	
	
	
	

}
