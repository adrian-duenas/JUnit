import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaNegra {

	@Test
	public void IntroducirNumerosSoloPositivos() {
		int[] ej= {1,2,3};
		int[] sol={1,3};
		assertArrayEquals(sol, MinMax.minMax(ej));
	}
	
	@Test
	public void IntroducirNumerosSoloNegativos() {
		int[] ej= {-1,-2,-3};
		int[] sol={-3,-1};
		assertArrayEquals(sol, MinMax.minMax(ej));
	}
	
	@Test
	public void IntroducirNumerosPositivosYNegativos() {
		int[] ej= {-1,2,-3};
		int[] sol={-3,2};
		assertArrayEquals(sol, MinMax.minMax(ej));
	}
	
	@Test
	public void IntroducirArrayVacio() {
		int[] ej= {};
		int[] sol= null;
		assertArrayEquals(sol, MinMax.minMax(ej));
	}
	
	@Test
	public void IntroducirNumerosIguales() {
		int[] ej= {1,1,1};
		int[] sol={1,1};
		assertArrayEquals(sol, MinMax.minMax(ej));
		
	}
}
