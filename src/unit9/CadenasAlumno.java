/**
 * 
 */
package unit9;

/**
 * @author Antonio Reche Ramal*****
 * clase CadenasAlumno con diversos métodos para el tratamiento de String, realizados sin usar los métodos
 * de la clase String.
 */
public class CadenasAlumno {

	/**
	 * método que compara dos cadenas y te dice si son iguales
	 * @param cadena1 primera cadena a comparar
	 * @param cadena2 segunda cadena a comparar
	 * @return true si son iguales, false si no lo son 
	 */	 	
	public boolean sonIguales(String cadena1, String cadena2){
		
		boolean sonIguales=false;
		
		if(cadena1.length()==cadena2.length()){
			for(int i=0;i<cadena1.length();i++){
				if(cadena1.charAt(i)!=cadena2.charAt(i)){
					sonIguales=false;
					break;
				}
				else sonIguales=true;
			}
			
		}
		
		else 
			sonIguales=false;
		
		return sonIguales;
	}
	
	/**
	 *  método que compara	dos cadenas y te indica si la primera de ellas es mayor o no
	 * @param cadena1 primera cadena a comparar
	 * @param cadena2 segunda cadena a comparar
	 * @return true si la primera cadena es mayor o son iguales, false si la segunda cadena es mayor
	 */
	public boolean esMayor(String cadena1, String cadena2){
		
		boolean esMayor=false;
		
		if(sonIguales(cadena1, cadena2))
			esMayor=true;
		else{
			for(int i=0;i<cadena1.length();i++){
				if(cadena1.charAt(i)<cadena2.charAt(i)){
					esMayor=true;
					break;
				}				
			}
		}
		return esMayor;
	}
	
	/**
	 * método que compara	dos cadenas y te indica si la primera de ellas es menor o no
	 * @param cadena1 primera cadena a comparar
	 * @param cadena2 segunda cadena a comparar
	 * @return true si la primera cadena es menor o son iguales, false si la primera cadena es mayor
	 */
	public boolean esMenor(String cadena1, String cadena2){
		
		boolean esMenor=false;
		
		if(sonIguales(cadena1, cadena2))
			esMenor=true;
		else{
			for(int i=0;i<cadena1.length();i++){
				if(cadena1.charAt(i)<cadena2.charAt(i)){
					esMenor=true;
					break;
				}				
			}
		}
		return esMenor;
	}
	
	/**
	 * método que compara dos cadenas y te dice si son iguales ignorando las mayúsculas que pueda haber
	 * @param cadena1 primera cadena a comparar
	 * @param cadena2 segunda cadena a comparar
	 * @return true si son iguales ignorando mayúsculas
	 * @return false si no son iguales al compararlas ignorando mayúsculas
	 */
	public boolean comparaIgnorandoMayusculas(String cadena1, String cadena2){
		
		boolean sonIguales=true;
		char c1,c2;
		
		if(cadena1.length()==cadena2.length()){
			for(int i=0;i<cadena1.length();i++){
				c1=cadena1.charAt(i);
				c2=cadena2.charAt(i);
				if(c1>='a' && c1<='z')
					c1-=32;
				if(c2>='a'&& c2<='z')
					c2-=32;
				if(c1!=c2){
					sonIguales=false;
					break;
				}
			}
		}
		else 
			sonIguales=false;
		return sonIguales;
	}
	
	/**
	 * método que reemplaza de la cadena: cadena todos los regla/expresión que	hay por cambio
	 * @param cadena dónde se reemplazarán trozos de texto
	 * @param regla cadena que será reemplazada
	 * @param cambio cadena que se sustituirá a "regla"
	 * @return	String cadena con la regla sustituida, o la misma cadena recibida si no se encuentra la regla 
	 */
	public String reemplazaTodos(String cadena, String regla, String cambio){
		
		String nuevaCadena="";
		String temporal="";
		int lonRegla=regla.length();
		int i=0;
		
		while(i<cadena.length()){			
				temporal=extraerSubstring(cadena,i,i+lonRegla);			
				if(sonIguales(temporal,regla)){					
					nuevaCadena+=cambio;
					i+=lonRegla;
				}
				else{
					nuevaCadena+=String.valueOf(cadena.charAt(i));
					i++;
				}			 
		}
		return nuevaCadena;
	}
	
	/**
	 * método que reemplaza en la cadena: cadena la primera regla/expresión que hay por cambio
	 * @param cadena donde se reemplazará "regla"
	 * @param regla cadena que será reemplazada la primera vez que aparezca
	 * @param cambio cadena que sustituirá a "regla" 
	 * @return String cadena con la primera aparición de "regla" por cambio o la misma cadena que recibe 
	 * si la cadena no contiene a "regla"
	 */
	public String reemplazaPrimero(String cadena, String regla, String	cambio){
					
		String nuevaCadena="";
		String temporal="";		
		int lonRegla=regla.length();
		int i=0;
		boolean encontrado=false;
		
		while(i<cadena.length()){
			if(!encontrado){
				temporal=extraerSubstring(cadena,i,i+lonRegla);				
				if(sonIguales(temporal,regla)){
					nuevaCadena+=cambio;
					i+=lonRegla;
					for(;i<cadena.length();i++){
						nuevaCadena+=String.valueOf(cadena.charAt(i));
					}
					encontrado=true;
				}
				else{
					nuevaCadena+=String.valueOf(cadena.charAt(i));
					i++;
				}
			}
		}
		return nuevaCadena;
	}
	
	/**
	 * método que nos divide una cadena en base a una regla/expresión y un límite que será el número total de cadenas que queremos que nos muestre
	 * @param cadena cadena de texto que será dividida 
	 * @param regla cadena que indicará la posición división
	 * @param limite numero de subcadena que queremos que nos dé 
	 */
	public void muestraSplitLimite(String cadena, String regla, int limite){
		
		int lonRegla=regla.length();		
		boolean salir=false;
		
		while(limite>0 && !salir &&cadena.length()>0){
			String cadenaMostrar="";
			String temporal="";
			boolean encontrado=false;
					
			for(int i=0;i<=cadena.length()-lonRegla;i++){
				if(limite<=1){
					for(int j=i;j<cadena.length();j++){
						cadenaMostrar+=cadena.charAt(j);
					}
				}else{
				temporal=extraerSubstring(cadena,i,i+lonRegla);
				if(sonIguales(temporal,regla)){
					if(cadena.length()>1){
						for(int j=0;j<i;j++){
							cadenaMostrar+=cadena.charAt(j);							
						}
					}
					else{
						for(int j=0;j<cadena.length();j++){
							cadenaMostrar+=cadena.charAt(j);
						}
					}						
					if(cadena.length()>lonRegla){							
						cadena=extraerSubstring(cadena,i+lonRegla,cadena.length());
					}
					else{ 
						cadenaMostrar+=cadena;							
						salir=true;
					}
					if(cadenaMostrar!="")
						System.out.println(cadenaMostrar);
					limite--;
					encontrado=true;
					break;
					}
				}
			}
			if(!encontrado){					
				System.out.println(cadena);
				salir=true;					
			}
			
			if(limite<1) 
				System.out.println(cadena);			
		}		
	}
	
	/**
	 * método que nos divide una cadena en base a una regla/expresión
	 * @param cadena cadena a dividir
	 * @param regla cadena que sirve de división
	 */
	public void muestraSplit(String cadena, String regla){
				
		boolean salir=false;
		int lonRegla=regla.length();		
						
		while(!salir && cadena.length()>0){
			String cadenaMostrar="";
			String temporal="";
			boolean encontrado=false;
					
			for(int i=0;i<=cadena.length()-lonRegla;i++){
				
				temporal=extraerSubstring(cadena,i,i+lonRegla);
				if(sonIguales(temporal,regla)){
					if(cadena.length()>1){
						for(int j=0;j<i;j++){
							cadenaMostrar+=cadena.charAt(j);							
						}
					}
					else{
						for(int j=0;j<cadena.length();j++){
							cadenaMostrar+=cadena.charAt(j);
						}
					}						
					if(cadena.length()>lonRegla){							
						cadena=extraerSubstring(cadena,i+lonRegla,cadena.length());
					}
					else{ 
						cadenaMostrar+=cadena;							
						salir=true;
					}
					if(cadenaMostrar!="")
						System.out.println(cadenaMostrar);
					encontrado=true;
					break;
					}
				}
			
			if(!encontrado){					
				System.out.println(cadena);
				salir=true;					
			}				
		}
	}		
		
	/**
	 * método que devuelve un String sin espacios previos/posteriores
	 * @param cadena cadena que será devuelta sin espacios al principio/final
	 * @return String cadena recibida sin espacios al principio ni final
	 */
	public String quitaEspacios(String cadena){
		
		String nuevaCadena="";
		int delante=0;
		int detras=0;
		
		while(cadena.charAt(delante)==' ' ){
			delante++;				
		}
		
		while(cadena.charAt((cadena.length()-1)-detras)==' '){
			detras++;
		}
		
		for(int i=0;i<(cadena.length())-detras;i++)
		{
			if(i>=delante)
				nuevaCadena+=cadena.charAt(i);
		}
		
		return nuevaCadena;
	}
	
	/**
	 * método que dado un String te devuelve ese mismo pero en mayúsculas
	 * @param cadena cadena para convertir en mayusculas
	 * @return String cadena recibida en mayúsculas
	 */
	public String convertirMayusculas(String cadena){
		
		String nuevaCadena="";
		for(int i=0;i<cadena.length();i++)
		{
			if(cadena.charAt(i)>='a' && cadena.charAt(i)<='z'){
				char c=cadena.charAt(i);
				c-=32;
				nuevaCadena+=c;
		}
			else
				nuevaCadena+=cadena.charAt(i);
		}
		return nuevaCadena;
	}
	
	/**
	 * método que te convierte	un string todo a minúsculas
	 * @param cadena cadena para convertir en minúsculas
	 * @return String cadena recibida convertida a minúsculas
	 */
	public String convertirMinusculas(String cadena){
		
		String nuevaCadena="";
		for(int i=0;i<cadena.length();i++)
		{
			if(cadena.charAt(i)>='A' && cadena.charAt(i)<='Z'){
				char c=cadena.charAt(i);
				c+=32;
				nuevaCadena+=c;
				
			}
			else
				nuevaCadena+=cadena.charAt(i);
		}
		return nuevaCadena;
		
	}
		
	/**
	 * método que te devuelve la longitud de una cadena
	 * @param cadena cadena de texto de la que se devolverá su longitud
	 * @return long devuelve un número "long" correspondiente a la longitud de la cadena
	 */
	public long longitudCadena(String cadena){
		
		char[] c;
		
		c=cadena.toCharArray();
		return (long)c.length;		
	}
	
	/**
	 * método que te indica si la cadena comienza con el prefijo dado
	 * @param cadena cadena de texto
	 * @param prefijo letra o texto para comprobar si está al inicio de la cadena
	 * @return true si la cadena comienza por "prefijo", false si no empieza o el prefijo es más largo que la cadena
	 * @return frase sin la cadena no comienza por "prefijo"
	 */
	public boolean empiezaCon(String cadena, String prefijo){
		
		boolean empiezaCon=false;
		int lonPrefijo;
		String aux="";
		
		lonPrefijo=prefijo.length();
		
		if(lonPrefijo>cadena.length())
			System.out.println("El prefijo es demasiado largo");
		
		else{
			for(int i=0;i<lonPrefijo;i++){
				aux+=cadena.charAt(i);
			}
		
			if(sonIguales(prefijo,aux))
				empiezaCon=true;
		}
		
		return empiezaCon;
	}
	
	/**
	 * método que te indica si la cadena acaba con el sufijo dado
	 * @param cadena cadena de texto
	 * @param sufijo cadena de texto con el contenido para comprobar que si es la terminación
	 * @return true si la cadena termina con "sufijo"
	 * @retrun false si la cadena no termina con "sufijo"
	 */
	public boolean acabaEn(String cadena, String sufijo){
		
		boolean acabaEn=false;
		int lonSufijo;
		String aux="";
		
		lonSufijo=sufijo.length();
		
		if(lonSufijo>cadena.length())
			System.out.println("El prefijo es demasiado largo");
		
		else{
			for(int i=cadena.length()-lonSufijo;i<cadena.length();i++){
				aux+=cadena.charAt(i);
			}
		
			if(sonIguales(sufijo,aux))
				acabaEn=true;
		}
		
		return acabaEn;
	}
		
	/**
	 * método que te devuelve la posición en la que se encuentra una letra/conjunto de letras en un string
	 * @param cadena cadena de texto
	 * @param letra letra o cadena a buscar
	 * @return long devuelve un entero largo con la posición inicial de "letra"
	 * @return -1 si no se encuentra "letra" en la cadena
	 */
	public long posicionPrimeraCadena(String cadena, String letra){
		
		int posicion=-1;
		int lonLetra;
		String aux;
		
		lonLetra=letra.length();
		
		for(int i=0;i<cadena.length()-lonLetra;i++){
			aux=extraerSubstring(cadena,i,i+lonLetra);
			if(sonIguales(aux,letra)){
				posicion=i;
				break;
			}
		}
		return (long)posicion;
	}
	
	/**
	 * método que te devuelve una parte del string, para ello deberás de indicarle desde donde quieres que te devuelva
	 * @param cadena cadena de texto
	 * @param posicionInicio posición a partir de la cual extraerá la nueva cadena (valores entre 0 y length-1)
	 * @return cadena si el índice no es válido, devuelve la cadena pasada como parámetro 
	 * @return String cadena de texto extraida de "cadena", desde "posicionInicio" hasta el final
	 */
	public String extraerSubstring(String cadena, int posicionInicio){
		
		String nuevaCadena="";
		
		if(posicionInicio<0 || posicionInicio>=cadena.length()){ 
			System.out.println("Posición de inicio incorreta");
			return cadena;
		}
		
		else{
			for(int i=posicionInicio;i<cadena.length();i++){
				nuevaCadena+=String.valueOf(cadena.charAt(i));
			}
			return nuevaCadena;
		}
	}
	
	/**
	 * función que te devuelve una parte del string, para ello deberás de indicarle desde dónde quieres que te devuelva y hasta dónde
	 * @param cadena
	 * @param posicionInicio posición desde la que se extraerá la cadena a devolver, valores entre 0 y length-1
	 * @param posicionFinal posición hasta donde se extraerá la cadena a devolver, valores entre posicionInicio+1 y length-1
	 * @return String una cadena de texto extraida de "cadena", o  si las posiciones no son correctas devuelve la cadena original	 
	 */
	public String extraerSubstring(String cadena, int posicionInicio, int posicionFinal){
		
		String nuevaCadena="";
		
		if(posicionInicio<0 || posicionInicio>=cadena.length() || posicionFinal<posicionInicio ||posicionFinal>cadena.length()){
			if(posicionInicio<0 || posicionInicio>=cadena.length())
				System.out.println("Posición de inicio incorreta");
			if(posicionFinal<posicionInicio || posicionInicio>=cadena.length())
					System.out.println("Posición final incorreta");				
			return cadena;
		}
		else{
			for(int i=posicionInicio;i<=posicionFinal-1;i++){
				nuevaCadena+=String.valueOf(cadena.charAt(i));
			}
			return nuevaCadena;
		}
	}
	
	/**
	 * método que te permite concatenar dos cadenas 
	 * @param cadena1 cadena inicila para unir
	 * @param cadena2 cadena que se unirá a cadena1
	 * @return String cadena de texto formado por cadena1 y cadena2
	 */
	public String concatenaCadenas(String cadena1, String cadena2){
		
		String nuevaCadena=cadena1;
		
		for(int i=0;i<cadena2.length();i++){
			nuevaCadena+=cadena2.charAt(i);
		}
		
		return nuevaCadena;
		
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CadenasAlumno c=new CadenasAlumno();
		String c1="hola hola";
		String c2="adios";
		String sal;
		String regla="ol";
		String cambio="si";
		int limite=2;
		//char[] caracter= {'a','B','c','D'};
		
		System.out.println("SonIguales: "+c1+" "+c2);
		System.out.println(c.sonIguales(c1,c2));
		
		System.out.println("Es Mayor: "+c1+" "+c2);
		System.out.println(c.esMayor(c1,c2));
				
		System.out.println("esMenor: "+c1+" "+c2);
		System.out.println(c.esMayor(c1,c2));
				
		System.out.println("comparaIgnorando mayúsculas: "+c1+" "+c2);
		System.out.println(c.comparaIgnorandoMayusculas("h","H"));
		
		System.out.println("reemplazaTodos: "+c1+" "+regla+" "+cambio);		
		System.out.println(c.reemplazaTodos(c1,regla,cambio));
				
		System.out.println("reemplaza primero: "+c1+" "+c2);
		sal=c.reemplazaPrimero(c1,regla,cambio);
		System.out.println(sal);
		
		System.out.println("muestraSplitLimite: "+c1+" "+regla+" "+limite);
		c.muestraSplitLimite(c1,regla,limite);
				
		System.out.println("muestraSplit: "+c1+" "+regla);
		c.muestraSplit(c1,regla);
				
		System.out.println("quita espacios: "+c1);
		System.out.println("**"+c.quitaEspacios(" "+c1+" ")+"**");
				
		System.out.println("convertirMayusculas: "+c1);
		System.out.println(c.convertirMayusculas(c1));
				
		System.out.println("convertirMinusculas: HOLAS");
		System.out.println(c.convertirMinusculas("HOLAS"));
				
		System.out.println("longitudCadena: "+c1+" "+c2);
		System.out.println(c.longitudCadena(c1));
		
		System.out.println("empieza con: ho"+c1);
		System.out.println(c.empiezaCon(c1,"ho"));
		
		System.out.println("acabaEn: la "+c1);
		System.out.println(c.acabaEn(c1,"la"));
		
		
		System.out.println("posicionPrimeraCadena: "+c1+" "+regla);
		System.out.println(c.posicionPrimeraCadena(c1,regla));
		
		System.out.println("extraerSubString: 3,6"+c1 );
		System.out.println(c.extraerSubstring(c1,3,6));
		
		System.out.println("extraerSubstring: 3"+c1);
		System.out.println(c.extraerSubstring(c1,3));
				
				
		System.out.println("concatenaCadenas: "+c1+" "+c2);
		System.out.println(c.concatenaCadenas(c1,c2));
		

	}

}

