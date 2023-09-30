package Logic;

import java.util.ArrayList;




public class Factura {
	private ArrayList<FacturaProducto> facturaProductos;
	private int codigo;
	private double iva;
	private double valorTotal;
	private String fecha;
	private Cajero cajero;
	public Factura(ArrayList<FacturaProducto> facturaProductos, int codigo, double iva, double valorTotal, String fecha) {
		
		this.facturaProductos = new ArrayList<FacturaProducto>();
		this.codigo = codigo;
		this.iva = iva;
		this.valorTotal = valorTotal;
		this.fecha = fecha;
	}
	public ArrayList<FacturaProducto> getFacturaProductos() {
		return facturaProductos;
	}
	public void setFacturaProductos(ArrayList<FacturaProducto> facturaProductos) {
		this.facturaProductos = facturaProductos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getIva() {
		return iva;
	}
	public void setIva(double iva) {
		this.iva = iva;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Cajero getCajero() {
		return cajero;
	}
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}
	

	
	
	
}
