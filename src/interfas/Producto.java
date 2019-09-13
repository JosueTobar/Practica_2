package interfas;

public class Producto implements ProductoInterfas {
	private Integer numpreProducto ;
	private String categoria;
	private float precio; 
	
	
	public Integer getNumpreProducto() {
		return numpreProducto;
	}


	public void setNumpreProducto(Integer numpreProducto) {
		this.numpreProducto = numpreProducto;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public void calcularEnvio() { // TODO Auto-generated method stub
	
		System.out.println("Metodo implementedo desde una interface");
	}
	
}
