package Logic;

public abstract class ArepaRellena extends Producto{

	 private boolean esPicante;
	 public ArepaRellena(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre, boolean esPicante) {
			super(tamaño, precioCompra, precioVenta, codigo, nombre);
			this.esPicante = esPicante;
		}
	public boolean getEsPicante() {
		return esPicante;
	}
	public void setEsPicante(boolean esPicante) {
		this.esPicante = esPicante;
	}
	 
}
