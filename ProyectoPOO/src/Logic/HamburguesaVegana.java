package Logic;


public class HamburguesaVegana extends Hamburguesa{
	

	

	public enum IngredientesHamVeg {

		PAPAS_FOSFORITO("Papas_Fosforito"), AGUACATE("Aguacate"), CEBOLLA("Cebolla"), PEPINILLOS("Pepinillos"), SALSA_DE_TOMATE("Salsa_De_Tomate"), MAYONESA("Mayonesa"), 
		CARNE_VEGANA("Carne_Vegana"), PAN("pan");
		private final String ingrediente;

		IngredientesHamVeg(String ingrediente) {
			this.ingrediente = ingrediente;
		}

		public String getIngrediente() {
			return ingrediente;
		}
	}

	public IngredientesHamVeg[] getIngredientes() {
		return IngredientesHamVeg.values();
	}
	public HamburguesaVegana(Tamaño tamaño, double precioCompra, double precioVenta, int codigo, String nombre,
			String tipoPan, boolean esPicante) {
		super(tamaño, precioCompra, precioVenta, codigo, nombre, tipoPan, esPicante);
		// TODO Auto-generated constructor stub
	}
	
}
