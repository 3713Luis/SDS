package Singleton;

import controlador.MenuFamiliaController;
import vista.VistaDocsFamilia;

public class LoggerVistaFamilia {
	
	private static LoggerVistaFamilia log;

	public LoggerVistaFamilia() {
		// TODO Auto-generated constructor stub
		
		
	}

	public  LoggerVistaFamilia getInstance() {
		
		
		if(log == null ){
			log = new LoggerVistaFamilia();
			abrirMenuFamilia();
		
		}
		
		return log; 
	}
	
	public void abrirMenuFamilia() {
		new MenuFamiliaController();

	}
	

}
