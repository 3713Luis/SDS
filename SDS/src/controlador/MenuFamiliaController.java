package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaDocsFamilia;

public class MenuFamiliaController implements ActionListener{
	VistaDocsFamilia familia = new VistaDocsFamilia();

	public MenuFamiliaController() {
		// TODO Auto-generated constructor stub
		familia.btnRegresar.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				
		if (e.getSource()==familia.btnRegresar) {
			
			new MenuController(); 

		
		}
	}
	
	

}
