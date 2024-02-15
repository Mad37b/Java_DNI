import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorRedex {

	// Patrones de expresiones regulares

	private Pattern nombre = Pattern.compile("^[A-Za-z]{3,}+$");
	private Pattern NIF = Pattern.compile("^\\d{8}[TRWAGMYFPDXBNJZSQVHLCKE]$");
	private Pattern NIE = Pattern.compile("^([XYZ])\\d{7}([A-Z,a-z])$");
	private Pattern IBAN = Pattern.compile("^([A-Z]{2}\\d{2}-\\d{4}-\\d{4}-\\d{4}-\\d{4}-\\d{4})$");
	private Pattern tarjeta = Pattern.compile("^\\d{4}-\\d{4}-\\d{4}-\\d{4}$");

	// Metodos de validacion para campos de texto

	public boolean validarNombre(String nombreCliente) {
		Matcher matcherNombre = nombre.matcher(nombreCliente);
		return matcherNombre.matches();
	}

	public boolean validarNIF(String NIFCliente) {
		Matcher matcherNIF = NIF.matcher(NIFCliente);
		return matcherNIF.matches();

	}

	public boolean validarNIE(String nieCliente) {

		Matcher matcherNIE = NIE.matcher(nieCliente);
		return matcherNIE.matches();
	}

	public boolean validarIBAN(String ibanCliente) {

		Matcher matcherIBAN = IBAN.matcher(ibanCliente);
		return matcherIBAN.matches();
	}

	public boolean validarTarjeta(String tarjetaCliente) {

		Matcher matchertarjeta = tarjeta.matcher(tarjetaCliente);
		return matchertarjeta.matches();
	}
	
	public boolean validarDatos(String nombreCliente, String NIFCliente,String nieCliente) {
		 return validarNombre(nombreCliente) && validarNIF(NIFCliente) && validarNIE(nieCliente);
		
	}

}
