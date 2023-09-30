package Logic;

public abstract class Producto {
    public enum Tamaño {
        PEQUEÑO,
        MEDIANO,
        GRANDE
    }

    private Tamaño tamaño;
    private double precioCompra;
    private double precioVenta;
    private int codigo;
    private String nombre;
    
   

    public Producto(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre) {
        this.tamaño = tamaño;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Tamaño getTamaño() {
        return tamaño;
    }

    public void setTamaño(Tamaño tamaño) {
        this.tamaño = tamaño;
    }

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}
