/**
 * 
 */
package Servicio;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author Heber
 *
 */
public class TestApi {

	/**
	 * Test method for {@link Servicio.SumaYFactorialServicio#sumaNumeros(int, int)}.
	 */
	@org.junit.Test
	public void testSumaNumeros() {
		assertTrue(9==new SumaYFactorialServicio().sumaNumeros(4, 5));
		assertTrue(9==new SumaYFactorialServicio().sumaNumeros(4, 5));
		assertTrue(-2==new SumaYFactorialServicio().sumaNumeros(3, -5));
		
	}

	/**
	 * Test method for {@link Servicio.SumaYFactorialServicio#factorial(int)}.
	 */
	@org.junit.Test
	public void testFactorial() {
		assertTrue(120==new SumaYFactorialServicio().factorial(5));
		assertTrue(120==new SumaYFactorialServicio().factorial(-5));
		assertTrue(1==new SumaYFactorialServicio().factorial(0));
		assertTrue(120==new SumaYFactorialServicio().factorial(500));
		
	}

}
