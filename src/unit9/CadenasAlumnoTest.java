/**
 * 
 */
package unit9;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Clase CadenasAlumnoTest, clase para realizar los test de la clase CadenasAlumno
 * @author Antonio Reche Ramal
 */
public class CadenasAlumnoTest {

	private CadenasAlumno cad;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp(){
		cad=new CadenasAlumno();		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown(){		
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#sonIguales(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testSonIguales() {
		
		String cad1="entornos";
		String cad2="entoroooo";
		String cad3="entornos";
		assertEquals(cad.sonIguales(cad1,cad3),cad1.equals(cad3));
		assertEquals(!cad.sonIguales(cad1,cad2),!cad1.equals(cad2));
		assertTrue(cad.sonIguales(cad1, cad3) && cad1.equalsIgnoreCase(cad3));
	}	

	/**
	 * Test method for {@link unit9.CadenasAlumno#esMayor(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testEsMayor() {
		String cad1="entornos";
		String cad2="entornos";
		String cad3="antornos";
		boolean iguales1_2=false;		
		boolean mayor=false;
		
		if(cad1.compareTo(cad2)==0)
			iguales1_2=true;		
		if(cad3.compareTo(cad1)<0)
			mayor=true;
		
		assertTrue(cad.esMayor(cad3, cad1) && mayor);
		assertEquals(cad.esMayor(cad1, cad2),iguales1_2);
		assertFalse(cad.esMayor(cad1,cad3));
		
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#esMenor(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testEsMenor() {
		String c1="alba";
		String c2="alba";
		String c3="cuen";
		boolean iguales1_2=false;		
		boolean menor=false;
		
		if(c1.compareTo(c2)==0)
			iguales1_2=true;		
		if(c3.compareTo(c1)>0)
			menor=true;
		
		assertTrue(cad.esMenor(c3, c1) && menor);
		assertEquals(cad.esMenor(c1, c2),iguales1_2);
		assertFalse(cad.esMenor(c1,c3));
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#comparaIgnorandoMayusculas(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testComparaIgnorandoMayusculas() {
		String c1="AlBa";
		String c2="alba";
		String c3="cuen";
		boolean iguales=false;
		
		if(c1.equalsIgnoreCase(c2))
			iguales=true;
		
		assertTrue(cad.comparaIgnorandoMayusculas(c1, c2));
		assertFalse(cad.comparaIgnorandoMayusculas(c1,c3));
		assertEquals(cad.comparaIgnorandoMayusculas(c1,c2),c1.equalsIgnoreCase(c2));
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#reemplazaTodos(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testReemplazaTodos() {
		String c1="Asignatura entornos de programación";
		String regla="a";
		String cambio="---";
		
		assertEquals(cad.reemplazaTodos(c1, regla, cambio),c1.replaceAll(regla, cambio));
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#reemplazaPrimero(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testReemplazaPrimero() {
		String c1="Asignatura entornos de programación";
		String regla="a";
		String cambio="---";
				
		assertEquals(cad.reemplazaPrimero(c1, regla, cambio),c1.replaceFirst(regla, cambio));
	}	

	/**
	 * Test method for {@link unit9.CadenasAlumno#quitaEspacios(java.lang.String)}.
	 */
	@Test
	public void testQuitaEspacios() {
		String c1="Asignatura entornos de programación";
				
		assertEquals(cad.quitaEspacios(c1),c1.trim());
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#convertirMayusculas(java.lang.String)}.
	 */
	@Test
	public void testConvertirMayusculas() {
		String c="Todo a mayusculas";
		
		assertEquals(cad.convertirMayusculas(c),c.toUpperCase());
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#convertirMinusculas(java.lang.String)}.
	 */
	@Test
	public void testConvertirMinusculas() {
		String c="TODO a MINUSculas";
		
		assertEquals(cad.convertirMinusculas(c),c.toLowerCase());
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#longitudCadena(java.lang.String)}.
	 *
	@Test
	public void testLongitudCadena() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#empiezaCon(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testEmpiezaCon() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#acabaEn(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testAcabaEn() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#posicionPrimeraCadena(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testPosicionPrimeraCadena() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#extraerSubstring(java.lang.String, int)}.
	 *
	@Test
	public void testExtraerSubstringStringInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#extraerSubstring(java.lang.String, int, int)}.
	 *
	@Test
	public void testExtraerSubstringStringIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#concatenaCadenas(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testConcatenaCadenas() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#main(java.lang.String[])}.
	 *
	@Test
	public void testMain() {
		fail("Not yet implemented");
	}
*/
}
