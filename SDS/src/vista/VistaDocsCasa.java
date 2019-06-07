package vista;

import javax.swing.JLabel;

public class VistaDocsCasa {

	Ventana ventana =  new Ventana("Documentos Casa");

	JLabel labelTitulo = new JLabel();

	public VistaDocsCasa() {
		// TODO Auto-generated constructor stub
		ventana.crearVentanaDefault();
		ventana.modificarTamañoVentana(1300,600);
		ventana.ventana.setLocation(30, 80);

	}

}
