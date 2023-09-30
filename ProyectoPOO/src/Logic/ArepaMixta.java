package Logic;

public class ArepaMixta extends ArepaRellena{
	

	public enum IngredientesAreMix {

		POLLO("Pollo"), CARNE_MOLIDA("Carne_Desmechada"), MANTEQUILLA("Mantequilla"), MAIZ("Maiz"), SALSA_PICANTE("Salsa_Picante");
		private final String ingrediente;

		IngredientesAreMix(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}

	public IngredientesAreMix[] getIngredientes() {
		return IngredientesAreMix.values();
	}
	
	
	public ArepaMixta(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			boolean esPicante) {
		super(Tamaño.PEQUEÑO, precioCompra, precioVenta, codigo, nombre, esPicante);
		// TODO Auto-generated constructor stub
	}
}
