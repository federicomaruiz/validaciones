/**
 * 
 */
package validaciones;

/**
 * @author federicoruiz 23 feb 2023 18:46:36
 */
public class Validar {

	/**
	 * Sirve para unicamente <b>LETRAS</b>sin importar la cantidad de cadenas que
	 * incluya
	 * 
	 * @param texto : Entrada de texto que se quiere validar que solamente contenga
	 *              <b>LETRAS</b>sin importar el n&uacute;mero de cadenas que pueda
	 *              contener separadas por un espacio.
	 * @return True o False
	 */
	public static boolean soloLetras(String texto) {
		if (texto.matches("[a-zA-Zá-úÁ-Ú\s\t]+")) {
			return true;
		}
		return false;
	}

	/**
	 * Sirve para unicamente <b>LETRAS</b>con una cantidad de cadenas especificada
	 * que est&aacute; separadas por espacios.
	 * 
	 * @param texto          : Entrada de texto que se quiere validar que solamente
	 *                       contenga <b>LETRAS</b> .
	 * @param numeroPalabras : el n&uacute;mero de cadenas que pueda contener el
	 *                       texto separadas por un espacio.
	 * @return True o False
	 */
	public static boolean soloLetras(String texto, int numeroPalabras) {
		if ((texto.trim().replaceAll("[\s\t]", " ").split(" ").length) == numeroPalabras) {
			if (texto.matches("[a-zA-Zá-úÁ-Ú\s]+")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sirve para unicamente <b>NU&acute;MEROS</b> sin importar la cantidad de
	 * cadenas que incluya
	 * 
	 * @param texto : Entrada de texto que se quiere validar que solamente contenga
	 *              <b>N&Uacute;MEROS</b> sin importar el n&uacute;mero de cadenas
	 *              que pueda contener separadas por un espacio.
	 * @return True o False
	 */
	public static boolean soloNumeros(String texto) {
		if (texto.matches("[0-9\s\t]+")) {
			return true;
		}
		return false;
	}

	/**
	 * Sirve para unicamente <b>NU&acute;MEROS</b> con una cantidad de cadenas
	 * especificada que est&aacute; separadas por espacios.
	 * 
	 * @param texto           : Entrada de texto que se quiere validar que solamente
	 *                        contenga <b>N&Uacute;MEROS</b>.
	 * @param cantidadNumeros : el n&uacute;mero de cadenas que pueda contener el
	 *                        texto separadas por un espacio.
	 * @return True o False
	 */
	public static boolean soloNumeros(String texto, int cantidadNumeros) {
		if ((texto.trim().replaceAll("[\s\t]", " ").split(" ").length) == cantidadNumeros) {
			if (texto.matches("[0-9\s]+")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Sirve para unicamente <b>ALFANUM&Eacute;RICOS</b> sin importar la cantidad de
	 * cadenas que incluya.
	 * 
	 * @param texto : Entrada de texto que se quiere validar que solamente contenga
	 *              caracteres <b>ALFANUM&Eacute;RICOS</b> sin importar el
	 *              n&uacute;mero de cadenas que pueda contener separadas por un
	 *              espacio.
	 * @return True o False
	 */
	public static boolean soloAlfanumericos(String texto) {
		if (texto.matches("[0-9a-zA-Zá-úÁ-Ú\s\t]+")) {
			return true;
		}
		return false;
	}

	/**
	 * Sirve para unicamente <b>ALFANUM&Eacute;RICOS</b> con una cantidad de cadenas
	 * especificada que est&aacute; separadas por espacios.
	 * 
	 * @param texto         : Entrada de texto que se quiere validar que solamente
	 *                      contenga caracteres <b>ALFANUM&Eacute;RICOS</b>.
	 * @param cantidadDatos : el número de cadenas que pueda contener el texto
	 *                      separadas por un espacio.
	 * @return True o False
	 */
	public static boolean soloAlfanumericos(String texto, int cantidadDatos) {
		if ((texto.trim().replaceAll("[\s\t]", " ").split(" ").length) == cantidadDatos) {
			if (texto.matches("[0-9a-zA-Zá-úÁ-Ú\\s]+")) {
				return true;
			}
		}
		return false;
	}
}