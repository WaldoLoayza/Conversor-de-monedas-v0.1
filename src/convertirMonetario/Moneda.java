package convertirMonetario;

public class Moneda {

	private String paisOrigen;
	private String monedaResultante;
	private Double cantidad;
	
	
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen (String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getMonedaResultante() {
		return monedaResultante;
	}
	public void setMonedaResultante(String monedaResultante) {
		this.monedaResultante = monedaResultante;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double obtenerCambio() {
		return cantidad * obtenerConstante();
	}
	
	public Float obtenerConstante() {
		Float dato =1f;
		
		switch (paisOrigen) {
			case "peru": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.27f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.25f;
						} else {
							dato = 25.59f; 
						} 
						break;
			case "ecuador": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 1f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.90f;
						} else {
							dato = 92.0f; 
						} 
						break;
			case "brasil": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.21f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.19f;
						} else {
							dato = 19.47f; 
						}
						break;
			case "venezuela": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.0340f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.0309f;
						} else {
							dato = 3.13f; 
						}
						break;
			case "colombia": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.00025f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.00023f;
						} else {
							dato = 0.0233f; 
						}
						break;
			case "chile": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.0012f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.0010f;
						} else {
							dato = 0.1112f; 
						}
						break;
			case "uruguay": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.0265f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.0241f;
						} else {
							dato = 2.43f; 
						}
						break;
			case "paraguay": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.00013f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.00012f;
						} else {
							dato = 0.0126f; 
						}
						break;
			case "argentina": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.0036f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.0033f;
						} else {
							dato = 0.3383f; 
						}
						break;
			case "bolivia": if(monedaResultante.equalsIgnoreCase("dolares")) {
							dato = 0.14f;
						} else if(monedaResultante.equalsIgnoreCase("euros")) {
							dato = 0.13f;
						} else {
							dato = 13.37f; 
						}
						break;
		}
		return dato;
	}
}
