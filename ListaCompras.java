public class ListaCompras 
{
	NodoProducto primero;
	NodoProducto ultimo;
	NodoProducto ver;

	ListaCompras()
	{
		primero=null;
		ultimo=null;
	}

	public boolean estavacio()
	{
		if(primero==null)
		{
			return true;
		}
		else{
			return false;
		}
	}
	////////Agregar al inicio --concatena---
	public ListaCompras AgregarProducto(String Descripci, int Cantid, String Mar)
	{
		//System.out.println(Descripci + Cantid + Mar);
		if(estavacio())
		{
			NodoProducto nuevo=new NodoProducto(Descripci,Cantid, Mar);
			primero=nuevo;
			//ultimo= primero;
			ultimo= nuevo;
		}
		else{
			NodoProducto nuevo=new NodoProducto(Descripci,Cantid, Mar);
			ultimo.Siguiente=nuevo;
			nuevo.Anterior=ultimo;
			ultimo=nuevo;
		}
		return this;
	}
	/////////borrar por Nombre
	public boolean borrarPorProducto(String Nom)
	{
		int a=NumeroElementos();
		a--;
		NodoProducto anterior=null;
		NodoProducto actual=primero;
		while(actual!=ultimo)
		{
			if(actual.Descripcion.equals(Nom))
			{
				if(anterior==null)
				{
					primero=actual.Siguiente;
					primero.Anterior=null;
				}
				else{
					anterior.Siguiente=actual.Siguiente;
					NodoProducto temporal;
					temporal=actual.Siguiente;
					temporal.Anterior=anterior;
				}
				return true;
			}
			anterior=actual;
			actual=actual.Siguiente;
		}
		System.out.println("Tamaño: "+a);
		if(Nom.equals(ultimo.Descripcion))
		{
			ultimo=actual.Anterior;
			return true;
		}
		return false;
	}
	/////////buscar por Nombre
	public boolean BuscarPorNombre(String Nom)
	{
		NodoProducto  aux =primero;
		boolean encontrado = false;
		while(aux != null )
		{
			if (Nom.equals(aux.getDescripcion()))
			{
				encontrado = true;
				System.out.print("[ " + aux.getDescripcion() + ","+aux.getCantidad()+","+aux.isEstado()+"]" + "\n");
			}
			aux = aux.getSiguiente();
		}
		return encontrado;
	}
	///////////imprimir normal de inico a fin
	public void MostrarNoComprados()
	{
		if (!estavacio()) 
		{
			System.out.println();
			NodoProducto aux = ultimo;
			int i = 1;
			while(aux!=null)
			{
				if(aux.getCantidad()==0){
					System.out.print(i + ".[ " + aux.getDescripcion() + "\t\t"+aux.getCantidad()+"\t]" + "\n");
				}
				aux = aux.getAnterior();
				i++;
			}	
		}
	}

	public void MostrarListaDeCompras()
	{
		if (!estavacio()) 
		{
			NodoProducto aux = ultimo;
			int i = 1;
			while(aux != null)
			{
				System.out.print(i + ".[ " + aux.getDescripcion() + "\t\t"+aux.getCantidad()+"\t"+aux.Marca+"\t]" + "\n");
				aux = aux.getAnterior();
				i++;
			}
		}
	}

	public void MostrarAunNoCompradosIn()
	{
		if (!estavacio()) 
		{
			System.out.println("no listo");
			NodoProducto aux = primero;
			int i = 1;
			while(aux!=null)
			{
				if(aux.getCantidad()==0){
					System.out.print(i + ".[ " + aux.getDescripcion() + "\t\t"+aux.getCantidad()+"\t]" + "\n");
				}
				aux = aux.getSiguiente();
				i++;
			}
		}
	}
	/////tamaño
	public int NumeroElementos()
	{
		NodoProducto aux;
		int numElementos=0;
		aux = primero;
		//Recorremos
		while(aux != null)
		{
			numElementos++;
			aux = aux.getSiguiente();
		}
		return numElementos;
	}
}