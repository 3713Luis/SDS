package vista;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Singleton.LoggerVistaFamilia;
import controlador.MenuController;
import controlador.MenuFamiliaController;

public class VistaDocsFamilia {

	Ventana ventana =  new Ventana("Documentos Familiares");
	
	JLabel labelTitulo = new JLabel();
	JLabel labelBuscador =  new JLabel();
	JTextField jtxtBuscador =  new JTextField();
	public JButton btnRegresar = new JButton();
	
	public VistaDocsFamilia() {
		// TODO Auto-generated constructor stub
		ventana.crearVentanaDefault();
		ventana.modificarTamañoVentana(1300,600);
		ventana.ventana.setLocation(30, 80);
		agregarLabel();
		agregarCajasTexto();
		agregarBoton();
		
		
	}
	
	public void agregarLabel() {
		
		labelTitulo.setBounds(500, 30, 300, 30);
		labelTitulo.setText("Documentos Familiares");
		labelTitulo.setFont(new Font("Arial", 1, 25));
		ventana.ventana.add(labelTitulo);
		labelBuscador.setBounds(50, 100, 100, 30);
		labelBuscador.setText("Buscar: ");
		labelBuscador.setFont(new Font("Arial", 1, 15));
		ventana.ventana.add(labelBuscador);
	}
	
	public void agregarCajasTexto() {
		
		jtxtBuscador.setBounds(120, 100, 200, 30);
		ventana.ventana.add(jtxtBuscador);
	}
	
	public void agregarBoton() {
		
		btnRegresar.setBounds(1100, 30, 100, 30);
		btnRegresar.setText("Regresar");
		ventana.ventana.add(btnRegresar);
		
	}
	
	
	
public void cerrarFrame() {
		
	ventana.ventana.dispose();
	

}

}
