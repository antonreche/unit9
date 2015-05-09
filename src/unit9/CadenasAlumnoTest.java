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
import junit.framework.TestCase;

import junit.framework.*;
/**
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
	 *
	@Test
	public void testEsMayor() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#esMenor(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testEsMenor() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#comparaIgnorandoMayusculas(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testComparaIgnorandoMayusculas() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#reemplazaTodos(java.lang.String, java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testReemplazaTodos() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#reemplazaPrimero(java.lang.String, java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testReemplazaPrimero() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#muestraSplitLimite(java.lang.String, java.lang.String, int)}.
	 *
	@Test
	public void testMuestraSplitLimite() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#muestraSplit(java.lang.String, java.lang.String)}.
	 *
	@Test
	public void testMuestraSplit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#quitaEspacios(java.lang.String)}.
	 *
	@Test
	public void testQuitaEspacios() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#convertirMayusculas(java.lang.String)}.
	 *
	@Test
	public void testConvertirMayusculas() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link unit9.CadenasAlumno#convertirMinusculas(java.lang.String)}.
	 *
	@Test
	public void testConvertirMinusculas() {
		fail("Not yet implemented");
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
