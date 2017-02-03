public class Aplicacion
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ListaCompras a=new ListaCompras();

		a.AgregarProducto("Atun", 0, "Listo");
		a.AgregarProducto("Leche", 4, "Listo");
		a.AgregarProducto("Aceite", 0, " -- ");
		a.AgregarProducto("lb Arroz", 2, "Listo");
		a.AgregarProducto("lb Pollo ", 0, " -- ");
		a.AgregarProducto("Azucar", 4, "Listo");
		a.AgregarProducto("Mandarinas", 0, " -- ");

		System.out.println("<<-- Lista Completa-->>\n");
		System.out.println(" ~ Descripcion\t Cantidad\tEstado\n");
		a.MostrarListaDeCompras();
		System.out.println("\n<<-- Productos aun no comprados -->>\n"); 
		System.out.println(" ~ Descripcion\t Cantidad");
		a.MostrarNoComprados();
		//	a.MostrarListain();
		//	System.out.println("buscar por nombre el Atun"); 
		//	a.BuscarPorNombre("Atun");
		//	System.out.println("borrar por nombre el Atun");
		//	a.borrarPorProducto("Atun");
		//	a.MostrarLista();
	}
}