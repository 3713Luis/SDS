package Singleton;

import controlador.MenuCasaController;
import vista.VistaDocsCasa;

public class LoggerVistaCasa {
	private static LoggerVistaCasa log;

	public LoggerVistaCasa() {
		// TODO Auto-generated constructor stub
		
		
	}

	public  LoggerVistaCasa getInstance() {
		
		if(log == null ){
			log = new LoggerVistaCasa();
			System.out.println("validando logger");
			abrirMenuCasa();
		}
		
		return log; 
	}
	
	public void abrirMenuCasa() {
		new MenuCasaController();

	}

}
