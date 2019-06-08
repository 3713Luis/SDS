package vista;

import javax.swing.JButton;
import javax.swing.JLabel;

public class VistaDocsCasa {

	Ventana ventana =  new Ventana("Documentos Casa");

	JLabel labelTitulo = new JLabel();
	public JButton btnRegresar =  new JButton();	
	public JButton btnCerrar =  new JButton();

	public VistaDocsCasa() {
		// TODO Auto-generated constructor stub
		ventana.crearVentanaDefault();
		ventana.modificarTamañoVentana(1300,600);
		ventana.ventana.setLocation(30, 80);
		ventana.ventana.setDefaultCloseOperation(ventana.ventana.DO_NOTHING_ON_CLOSE);
		agregarBoton();

	}
	
	public void agregarLabel() {
		
	}
	
	public void agregarBoton() {
		
		btnRegresar.setBounds(1020, 30, 100, 30);
		btnRegresar.setText("Regresar");
		ventana.ventana.add(btnRegresar);
		btnCerrar.setBounds(1125, 30, 140, 30);
		btnCerrar.setText("Cerrar Sesión");
		ventana.ventana.add(btnCerrar);
	}
	
	
}
