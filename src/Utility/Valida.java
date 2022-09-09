package Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valida {

	public static Boolean validaSoloChar(String a) {

		Boolean flag;
		String expresionRegular = "[^A-z]";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = !m.find();
		return flag;

	}

	public static Boolean validaDia(String a) {

		Boolean flag;

		switch (a) {

		case "Lunes":
			flag = true;
			break;
		case "Martes":
			flag = true;
			break;
		case "Miércoles":
			flag = true;
			break;
		case "Jueves":
			flag = true;
			break;
		case "Viernes":
			flag = true;
			break;
		case "Sábado":
			flag = true;
			break;
		case "Domingo":
			flag = true;
			break;
		default:
			System.out.println("Ingrese día correcto");
			flag = false;
		}

		return flag;

	}

	public static Boolean validaHora(String a) {

		Boolean flag;
		String expresionRegular = "^([01]?[0-9]|2[0-3]):[0-5][0-9]$";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = m.find();
		return flag;

	}

	public static Boolean validaLugar(String a) {

		Boolean flag;
		String expresionRegular = "[a-zA-Z0-9_]";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = m.find();
		return flag;

	}

	public static Boolean validaEsNumero(String a) {

		Boolean flag = true;

		for (int i = 0; i < a.length(); i++) {
			if (!Character.isDigit(a.charAt(i))) {
				flag = false;
			}
		}
		return flag;

	}

	public static Boolean validaRut(String a) {

		Boolean flag;
		String expresionRegular = "([0-9]{1,3}(?:(.?)[0-9]{3}){2}(-?)[[0-9]kK])";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = m.find();
		return flag;

	}

	public static Boolean validaTelefono(String a) {

		Boolean flag;
		String expresionRegular = "(9)[0-9]{8}";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = m.find();
		return flag;

	}
	
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

	public static Boolean validaNota(String a) {

		Boolean flag;
		String expresionRegular = "[1-7]{1}";

		Pattern patron = Pattern.compile(expresionRegular);
		Matcher m = patron.matcher(a);

		flag = m.find();
		return flag;

	}
}
