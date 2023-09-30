package Logic;

public class Combo {
private double descuento;
public enum AgregadosDeCombo {

	AROS_DE_CEBOLLA("Aros_De_Cebolla"), BONELESS("Boneless"), SALSADE_AJO("Salsa_De_Ajo");

	private final String agregado;

	AgregadosDeCombo(String agregado) {
		this.agregado = agregado;
	}

	public String getAgregado() {
		return agregado;
	}
}
public AgregadosDeCombo[] getAgregado() {
	return AgregadosDeCombo.values();
}
public double getDescuento() {
	return descuento;
}
public void setDescuento(double descuento) {
	this.descuento = descuento;
}
}
