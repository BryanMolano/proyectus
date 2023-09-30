package Logic;

public abstract class Hamburguesa extends Producto{
	 
	private String tipoPan;
	 private boolean esPicante;
	 
	 public Hamburguesa(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre, String tipoPan, boolean esPicante) {
			super(tamaño, precioCompra, precioVenta, codigo, nombre);
			this.esPicante = esPicante;
			this.tipoPan = tipoPan;
		}

	public String getTipoPan() {
		return tipoPan;
	}

	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}

	public boolean getEsPicante() {
		return esPicante;
	}

	public void setEsPicante(boolean esPicante) {
		this.esPicante = esPicante;
	}
	 
}
