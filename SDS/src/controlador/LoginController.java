package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import interfaces.Observador;
import vista.VistaLogin;
import vista.VistaMenu;
import modelo.UsuarioModel;

public class LoginController implements ActionListener, Observador{

VistaLogin login =  new VistaLogin();
UsuarioModel usuario =  new UsuarioModel();

	public LoginController() {
		// TODO Auto-generated constructor stub
		login.crearVentana();
		login.entrar.addActionListener(this);
	}

	public boolean validarDatos() {
		
		boolean tipo = false;
		
        if (login.usuario.getText().length() == 0 || login.password.getText().length() == 0) {
			
        	JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios", 
        			"Validación de Datos", 0);
		}else {
			
			tipo = true;
		}
		
        return tipo;
	}
	
	@SuppressWarnings("deprecation")
	public void getDatosLogin() {
		
        usuario.setUsuario(login.usuario.getText());
        usuario.setPassword(login.password.getText());

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==login.entrar) {

			if (validarDatos() == true) {
				getDatosLogin();
				usuario.enlazarObservador(this);
				usuario.getUser();
			} 
        }
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		login.cerrarVentana();
		 new MenuController();

	}

	
}
