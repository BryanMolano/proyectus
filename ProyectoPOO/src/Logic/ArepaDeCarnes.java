package Logic;


public class ArepaDeCarnes extends ArepaRellena{
	

	public enum IngredientesAreCar {

		POLLO("Pollo"), CARNE_MOLIDA("Carne_Desmechada"), MANTEQUILLA("Mantequilla"), MAIZ("Maiz"), SALSA_PICANTE("Salsa_Picante");
		private final String ingrediente;

		IngredientesAreCar(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}

	public IngredientesAreCar[] getIngredientes() {
		return IngredientesAreCar.values();
	}
	
	public ArepaDeCarnes(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			boolean esPicante) {
		super(Tamaño.PEQUEÑO, precioCompra, precioVenta, codigo, nombre, esPicante);
		// TODO Auto-generated constructor stub
	}
}
