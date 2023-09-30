package Logic;



public class PapasFrancesas extends Papas{
	public enum IngredientesPapFra {

		MOSTAZA("Mostaza"), QUESO("Queso"), SALSA_PICANTE("Salsa_Picante");

		private final String ingrediente;

		IngredientesPapFra(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}
	public IngredientesPapFra[] getIngredientes() {
		return IngredientesPapFra.values();
	}
	
	public PapasFrancesas(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			boolean esPicante) {
		super(tamaño, precioCompra, precioVenta, codigo, nombre, esPicante);
		// TODO Auto-generated constructor stub
	}
	
}
