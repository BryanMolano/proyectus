package Logic;

public class Cajero {
private String nombre;
private int cedula;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCedula() {
	return cedula;
}
public void setCedula(int cedula) {
	this.cedula = cedula;
}
public Cajero(String nombre, int cedula) {
	this.nombre = nombre;
	this.cedula = cedula;
}

}
