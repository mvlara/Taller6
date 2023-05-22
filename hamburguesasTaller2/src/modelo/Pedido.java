package modelo;

import java.io.File;

public class Pedido {
	private Integer numeroPedidos;
	private Integer idPedido;
	private String nombreCliente;
	private String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente)
	{
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
	}
	public Integer getIdPedido()
	{
		return idPedido;
	}
	public final void agregarProducto(Producto ProductoNuevoItem)
	{
		
	}
	public Integer getPrecioNetoPedido()
	{
		return null;
	}
	public Integer getPrecioTotalPedido()
	{
		return null;
	}
	public Integer getPrecioIVAPedido()
	{
		return null;
	}
	public String generarTextoFactura()
	{
		return null;
	}
	private void guardarFactura (File archivo)
	{
		
	}
}
