package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Singleton.LoggerVistaCasa;
import Singleton.LoggerVistaFamilia;
import vista.VistaMenu;

public class MenuController implements ActionListener {
	
	VistaMenu menu =  new VistaMenu();
	LoggerVistaFamilia log = new LoggerVistaFamilia();
	LoggerVistaCasa logs =  new LoggerVistaCasa();


	
	

	public MenuController() {
		// TODO Auto-generated constructor stub
		menu.btnDocsFamilia.addActionListener(this);
		menu.btnDocCasa.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource()==menu.btnDocsFamilia) {
			
			menu.cerrarVentana();
			log.getInstance();

        }else if (e.getSource()==menu.btnDocCasa) {
        	
        	menu.cerrarVentana();
        	logs.getInstance();

		}
	}
	
	
}
