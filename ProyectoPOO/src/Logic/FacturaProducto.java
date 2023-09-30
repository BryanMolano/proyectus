package Logic;

public class FacturaProducto {
private int cantidad;

private Combo combo;
private Producto producto;
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public Combo getCombo() {
	return combo;
}


public Producto getProducto() {
	return producto;
}

public FacturaProducto(int cantidad, Combo combo, Producto producto) {
	this.cantidad = cantidad;
	
	this.combo = combo;
	this.producto = producto;
}


public void setProducto(Producto producto) {
    if(combo != null) {
        throw new IllegalStateException("No puede asignar un producto si ya tiene un combo.");
    }
    this.producto = producto;
}

public void setCombo(Combo combo) {
    if(producto != null) {
        throw new IllegalStateException("No puede asignar un combo si ya tiene un producto.");
    }
    this.combo = combo;
}

}

//this.facturaProductos = new ArrayList<FacturaProducto>();