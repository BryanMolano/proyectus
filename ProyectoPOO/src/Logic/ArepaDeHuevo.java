package Logic;


public class ArepaDeHuevo extends ArepaRellena{
	

	public enum IngredientesAreHue {

		HUEVO("Huevo"), CARNE_MOLIDA("Carne_Molida"), QUESO("Queso"), MANTEQUILLA("Mantequilla");
		private final String ingrediente;

		IngredientesAreHue(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}

	public IngredientesAreHue[] getIngredientes() {
		return IngredientesAreHue.values();
	}
	
	
	public ArepaDeHuevo(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			boolean esPicante) {
		super(Tamaño.PEQUEÑO, precioCompra, precioVenta, codigo, nombre, esPicante);
		// TODO Auto-generated constructor stub
	}
}
