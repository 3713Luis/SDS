package vista;

import java.awt.Font;


import javax.swing.JButton;
import javax.swing.JLabel;


public class VistaMenu {
	Ventana menu = new Ventana("Archivos");
	JLabel tituloMenu = new JLabel();
	public JButton btnDocsFamilia =  new JButton();
	public JButton btnDocCasa = new JButton();
	
	public VistaMenu() {

		
		menu.crearVentanaDefault();
		menu.modificarTamañoVentana(700, 500);
		menu.ventana.setLocation(350, 100);
		agregarLabe();
		agregarBotones();
		
		
	}
	
	 public void agregarLabe() {
		 
		tituloMenu.setBounds(150, 40, 500, 30);
		tituloMenu.setText("Opciones para gestión de Archivos");
		tituloMenu.setFont(new Font("Arial", 1, 25));
		menu.ventana.add(tituloMenu);
	 }
 
	public void agregarBotones() {
		
		btnDocsFamilia.setBounds(250, 150, 200, 30);
		btnDocsFamilia.setText("Documentos Familiares");
		menu.ventana.add(btnDocsFamilia);
		btnDocCasa.setBounds(250, 230, 200, 30);
		btnDocCasa.setText("Documentos Casa");
		menu.ventana.add(btnDocCasa);
				
	}
	
	public void cerrarVentana() {
		
		menu.ventana.dispose();
	}

	

}
