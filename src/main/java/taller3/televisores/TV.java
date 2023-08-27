package taller3.televisores;

public class TV {
	
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	
	public Marca getMarca() {
		return marca;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen(int volumen) {
		return volumen;
	}
	
	public 	Control getControl() {
		return control;
	}
	
	static public int getNumTV() {
		return numTV;
	}
	
	static public void agregarTV() {
		numTV++;
	}
	
	static public void quitarTV() {
		numTV--;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		
		if (estado) {
	
			if (canal == 120) {
			
			} else {
				canal++;
			}
			
		}
	}
	
	public void canalDown() {
		
		if (estado) {
			
			if (canal == 1) {
			
			} else {
				canal--;
			}
			
		}
	}
	
	public void volumenUp() {
		
		if (estado) {
			
			if (volumen == 7) {
			
			} else {
				volumen++;
			}
			
		}
	}
	
	public void volumenDown() {
		
		if (estado) {
			
			if (volumen == 0) {
			
			} else {
				volumen--;
			}
			
		}
	}
	
	
	
	

}