package Logic;

public abstract class Papas extends Producto{



private boolean esPicante;

public Papas(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre, boolean esPicante) {
	super(tamaño, precioCompra, precioVenta, codigo, nombre);
	this.esPicante = esPicante;
	// TODO Auto-generated constructor stub
}

public boolean getEsPicante() {
	return esPicante;
}

public void setEsPicante(boolean esPicante) {
	this.esPicante = esPicante;
}

}
