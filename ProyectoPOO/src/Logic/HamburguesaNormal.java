package Logic;



public class HamburguesaNormal extends Hamburguesa {

	public enum IngredientesHamNor {

		LECHUGA("Lechuga"), TOMATE("Tomate"), CEBOLLA("Cebolla"), PEPINILLOS("Pepinillos"),
		SALSA_DE_TOMATE("Salsa de tomate"), MOSTAZA("Mostaza"), MAYONESA("Mayonesa"), CARNE("Carne"), PAN("Pan"),
		QUESO("Queso");

		private final String ingrediente;

		IngredientesHamNor(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}
	public IngredientesHamNor[] getIngredientes() {
		return IngredientesHamNor.values();
	}
	

	public HamburguesaNormal(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			String tipoPan, boolean esPicante) {
		super(tamaño, precioCompra, precioVenta, codigo, nombre, tipoPan, esPicante);
		// TODO Auto-generated constructor stub
	}
	

}
