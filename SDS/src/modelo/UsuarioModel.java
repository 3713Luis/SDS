package modelo;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import conexion.Conexion;
import interfaces.Observable;
import interfaces.Observador;


public class UsuarioModel implements Observable {
	
	
	Conexion con = new Conexion();
	ResultSet resultado;
	
	private String usuario = null;
	private String password = null;
	
	private ArrayList<Observador> observadores;
	
	public UsuarioModel() {
		// TODO Auto-generated constructor stub
		
		observadores = new ArrayList<Observador>();
	}
	
	public void enlazarObservador(Observador o) {
		
		observadores.add(o);
	}
	
	
	

	

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public void getUser() {
		
		String usuario = getUsuario();
		String password = getPassword();
		
		con.getConnection();
		resultado =  con.getQuery("Select * from usuario "
				+ "where nombreUsuario ="
				+ "'"+usuario+"' and passwordUsuario ="
				+ "'"+password+"'");
		
		try {
			if (resultado.next()) {
				
				notificar();
			} else {
				JOptionPane.showMessageDialog(null, "El Usuario o Contraseña son incorrectos");

			}
			
			
				
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void notificar() {
		// TODO Auto-generated method stub
		for (Observador o : observadores) {

			o.update();
		}
	}
	
	
}
