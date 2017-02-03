public class NodoProducto
{
	String Descripcion;
	int Cantidad;
	String Marca;
	boolean Estado;

	NodoProducto Siguiente;
	NodoProducto Anterior;

	NodoProducto (String n, int c, String m )
	{  
		this.Descripcion=n;
		this.Cantidad=c;
		this.Marca=m;
		if (this.Marca=="Listo")
		{	
			this.Estado= true;	
		}
		else{
			this.Estado=false;
		}
		this.Siguiente=null;
		this.Anterior=null;
	}

	public String getDescripcion() 
	{
		return Descripcion;
	}


	public void setDescripcion(String descripcion) 
	{
		this.Descripcion = descripcion;
	}


	public int getCantidad() 
	{
		return Cantidad;
	}


	public void setCantidad(int cantidad) 
	{
		this.Cantidad = cantidad;
	}


	public boolean isEstado() 
	{
		return Estado;
	}


	public void setEstado(boolean estado) 
	{
		this.Estado = estado;
	}

	public NodoProducto getSiguiente()
	{
		return Siguiente;
	}

	public void setSiguiente(NodoProducto siguiente) 
	{
		this.Siguiente = siguiente;
	}

	public NodoProducto getAnterior()
	{
		return Anterior;
	}

	public void setAnterior(NodoProducto anterior) 
	{
		this.Siguiente = anterior;
	}

}
