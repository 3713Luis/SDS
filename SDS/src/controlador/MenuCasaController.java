package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaDocsCasa;

public class MenuCasaController implements ActionListener{

	VistaDocsCasa casa =  new VistaDocsCasa();
	
	public MenuCasaController() {
		// TODO Auto-generated constructor stub
		casa.btnRegresar.addActionListener(this);
		casa.btnCerrar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	if (e.getSource()==casa.btnRegresar) {
				
				new MenuController(); 
	
			
		}else if (e.getSource()==casa.btnCerrar) {
			
			System.exit(1);
		}
	}
}
