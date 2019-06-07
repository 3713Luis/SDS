package vista;

import javax.swing.*;
import java.awt.Font;

public class VistaLogin {

	public JTextField usuario = new JTextField();
	public JPasswordField password = new JPasswordField();
	public JButton entrar = new JButton();
	JLabel labelUsuario =  new  JLabel();
	JLabel labelPassword = new JLabel();
	JLabel labelTitulo =  new JLabel();
	Ventana login =  new Ventana("Login");

	public  VistaLogin() {
		
	}
	
	public void crearVentana() {
		login.crearVentanaDefault();
		login.modificarTamañoVentana(400, 250);
//		System.out.println("creando Ventana");
		agregarLabel();
		agregarCajasTexto();
		agregarBotones();
	}
	
	public void agregarLabel() {
		
		labelTitulo.setBounds(150, 20, 100, 20);
		labelTitulo.setText("LOGIN");
		labelTitulo.setFont(new Font("Arial", 1, 25));
		login.ventana.add(labelTitulo);
		labelUsuario.setBounds(50, 60, 100, 20);
		labelUsuario.setText("Usuario:");
		login.ventana.add(labelUsuario);
//		labelUsuario.setFont(new Font("Arial", 0, 18));
		login.ventana.add(labelUsuario);
		labelPassword.setText("Password:");
		labelPassword.setBounds(50, 100, 100, 20);
		login.ventana.add(labelPassword);
	}
	
	public void agregarCajasTexto() {
		
		usuario.setBounds(130, 60, 200, 20);
		login.ventana.add(usuario);
		password.setBounds(130, 100, 200, 20);
		login.ventana.add(password);
		
	}
	
	public void agregarBotones() {
		
		entrar.setBounds(150, 150, 100, 30);
		entrar.setText("Entrar");
		login.ventana.add(entrar);
//		
	}
	
	public void cerrarVentana() {
		login.ventana.dispose();
	}

}
