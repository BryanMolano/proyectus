package Logic;



public class HamburguesaRanchera extends Hamburguesa{
	

	public enum IngredientesHamRan {

		PAPAS_FOSFORITO("Papas_Fosforito"), CHORIZO("Chorizo"), PEPINILLOS("Pepinillos"), SALSA_DE_TOMATE("Salsa_De_Tomate"),
		MOSTAZA("Mostaza"), SALSABBQ("Salsa_BBQ"), CARNE("Carne"), PAN("Pan"),QUESO("Queso"),SALSA_PICANTE("Salsa_Picante");

		private final String ingrediente;

		IngredientesHamRan(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}

	public IngredientesHamRan[] getIngredientes() {
		return IngredientesHamRan.values();
	}
	
	public HamburguesaRanchera(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			String tipoPan, boolean esPicante) {
		super(tamaño, precioCompra, precioVenta, codigo, nombre, tipoPan, esPicante);
		// TODO Auto-generated constructor stub
	}
	
}
