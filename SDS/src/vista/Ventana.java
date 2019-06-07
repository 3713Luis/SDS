package vista;

import javax.swing.*;

public class Ventana {
	
JFrame ventana = new JFrame();
String nombreVentana = null;

public Ventana (String nombreVentana) {
ventana.setLayout(null);
this.nombreVentana = nombreVentana;

}

public void crearVentanaDefault() {

//	System.out.print("Creando Ventana");
ventana.setSize(400, 300);	
ventana.setTitle(nombreVentana);
ventana.setLocationRelativeTo(null);
//ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setVisible(true);
ventana.setResizable(false);

}

public void modificarTamañoVentana(int x, int y) {
ventana.setSize(x,y);
}

}
