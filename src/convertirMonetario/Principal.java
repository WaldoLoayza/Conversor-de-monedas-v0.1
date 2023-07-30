package convertirMonetario;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String[] pais = {"peru", "ecuador","bolivia", "argentina", "brasil", "uruguay", "paraguay", "chile", "colombia", "venezuela"};
		String[] moneda = {"dolares" , "euros" , "rublos"};
		
		Integer respuesta2 = 1;
			
		Moneda m1 = new Moneda();
		
		do {
			String respuesta1 = null;
			boolean bandera1 = false;
			boolean bandera2 = false;
			String paisLocal = null;
			Double montoInicial = null;
			String monedaDeseada = null;
			
			JOptionPane.showMessageDialog(null, "BIENVENIDO A SU CONVETIDOR\n\n" 
					+ "NOTA: Solo valido para paises de america del sur"
					+ "\n Por favor no use tildes");
	
			while (bandera1 == false) {
				
				paisLocal = JOptionPane.showInputDialog("Indiquenos el PAÍS de procedencia de su moneda");
				for(int i=0; i<pais.length; i++) {
					if(paisLocal.equalsIgnoreCase(pais[i])) {
						bandera1 = true;
						break;
					}
				}
				
				if(bandera1 == false) {
					JOptionPane.showMessageDialog(null, "PAIS INVALIDO\n Por favor escriba el nombre de un pais de America del sur");
				}
			}
			m1.setPaisOrigen(paisLocal);
			
			
			while (montoInicial == null) {
				try {
					montoInicial = Double.parseDouble(JOptionPane.showInputDialog("DIGITE LA CANTIDAD MONETARIA\n"
							+ "Escriba solo el numero correspondiente a el dinero que desea cambiar"));
					
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Escriba solo el numero porfavor");
					ex.getStackTrace();
				}
			}
			m1.setCantidad(montoInicial);
			
			
			while (bandera2 == false) {
				
				monedaDeseada = JOptionPane.showInputDialog("USTED OBTENDRÁ:\n - Dolares\n - Euros\n - Rublos\n\n Escoja una opcion");
				for(int i=0; i<moneda.length; i++) {
					if(monedaDeseada.equalsIgnoreCase(moneda[i])) {
						bandera2 = true;
						break;
					}
				}
				
				if(bandera2 == false) {
					JOptionPane.showMessageDialog(null, "MONEDA INVALIDA\n Por favor escoja: dolares, euros o rublos");
				}
			}
			m1.setMonedaResultante(monedaDeseada);
					
			
			JOptionPane.showMessageDialog(null, "Su cambio es: " + (double)Math.round(m1.obtenerCambio()*1000d)/1000 + " " + m1.getMonedaResultante());
			
			
			while (respuesta1 == null) {
				try {
					
					respuesta1 = JOptionPane.showInputDialog("ESCOJA UNA OPCION:\n\n 1.- Deseo buscar otro cambio de moneda\n 2.- Salir");

					} catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "Escriba solo el numero correspondiente a la opcion");
						ex.getStackTrace();
					 
					}
					if(!respuesta1.equals("1") && !respuesta1.equals("2")) {
						JOptionPane.showMessageDialog(null, "Opcion incorrecta");
						respuesta1 = null;
					} else if (respuesta1.equals("1")) {
						respuesta2 = 1;
					} else if (respuesta1.equals("2")) {
						respuesta2 = 2;
					}
				}
			
		} while(respuesta2 == 1);
		
	}
}
