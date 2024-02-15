import java.util.*;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class Fichero {

	// Atributos de la clase

	String salidaFichero;

	// Crear fichero

	public void crearFichero(String cliente) {
		FileWriter fichero;

		try {
			fichero = new FileWriter("clientes.VDA", true);

			fichero.write(cliente);
			fichero.close();
		} catch (Exception ex) {

			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}