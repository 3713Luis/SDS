package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

public class Conexion {
	
	String url = "jdbc:mysql://localhost/sds";
	String  usuario = "root";
	String password = "";
	Connection conn = null;

	
	public Connection getConnection() {
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			
			conn = (Connection) DriverManager.getConnection(url, usuario, password);
			
//			if (conn != null) {
//				
//				System.out.println("Conexión establecida");
//			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al cargar el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos, "
					+ "porfavor verifique su conexión", "Error de conexión", 0);
			
			e.printStackTrace();
		}
		 
		
		
		return null;
	}
	
	public ResultSet getQuery(String query) {
		
		Statement state = null;
		ResultSet resultado = null;
		
		try {
			
			state = (Statement) conn.createStatement();
			resultado = state.executeQuery(query);
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return resultado;
		
	}
	
	
	public void setQuery(String query) {
		
		Statement state = null;
		
		try {
			state = (Statement) conn.createStatement();
			state.execute(query);
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
