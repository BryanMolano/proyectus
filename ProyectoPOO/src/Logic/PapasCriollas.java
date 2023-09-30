package Logic;



public class PapasCriollas extends Papas{
	
	
	public enum IngredientesPapCri {

		MOSTAZA("Mostaza"), QUESO("Queso"), SALSA_PICANTE("Salsa_Picante");

		private final String ingrediente;

		IngredientesPapCri(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}
	public IngredientesPapCri[] getIngredientes() {
		return IngredientesPapCri.values();
	}
	
	public PapasCriollas(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			boolean esPicante) {
		super(tamaño, precioCompra, precioVenta, codigo, nombre, esPicante);
		// TODO Auto-generated constructor stub
	}
	
}
