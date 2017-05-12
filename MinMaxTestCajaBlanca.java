import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTestCajaBlanca {
	
	@Test
	public void statementCoverage() {
		int[] ej= {1,2,3};
		int[] sol={1,3};
		assertArrayEquals(sol, MinMax.minMax(ej));
		int[] ej2= {-1,2,-3};
		int[] sol2={-3,2};
		assertArrayEquals(sol2, MinMax.minMax(ej2));
	}
	
	@Test
	public void decisionCoverage() {
		int[] ej= {1,2,3};
		int[] sol={1,3};
		assertArrayEquals(sol, MinMax.minMax(ej));
		int[] ej3= {-1,2,-3};
		int[] sol3={-3,2};
		assertArrayEquals(sol3, MinMax.minMax(ej3));
		int[] ej4= {};
		int[] sol4= null;
		assertArrayEquals(sol4, MinMax.minMax(ej4));
		int[] ej5= {1,1,1};
		int[] sol5={1,1};
		assertArrayEquals(sol5, MinMax.minMax(ej5));
		int[] ej6= null;
		int[] sol6= null;
		assertArrayEquals(sol6, MinMax.minMax(ej6));	
	}
	
	@Test
	public void conditionCoverage() {
		int[] ej= {1,2,3};
		int[] sol={1,3};
		assertArrayEquals(sol, MinMax.minMax(ej));
		int[] ej2= {-1,2,-3};
		int[] sol2={-3,2};
		assertArrayEquals(sol2, MinMax.minMax(ej2));
		int[] ej3= {-1,2,-3};
		int[] sol3={-3,2};
		assertArrayEquals(sol3, MinMax.minMax(ej3));
		int[] ej4= {};
		int[] sol4= null;
		assertArrayEquals(sol4, MinMax.minMax(ej4));
		int[] ej5= {1,1,1};
		int[] sol5={1,1};
		assertArrayEquals(sol5, MinMax.minMax(ej5));
		int[] ej6= null;
		int[] sol6= null;
		assertArrayEquals(sol6, MinMax.minMax(ej6));
	}
    
	@Test
	public void decisionConditionCoverage() {
		int[] ej= {1,2,3};
		int[] sol={1,3};
		assertArrayEquals(sol, MinMax.minMax(ej));
		int[] ej2= {-1,2,-3};
		int[] sol2={-3,2};
		assertArrayEquals(sol2, MinMax.minMax(ej2));
		int[] ej3= {-1,2,-3};
		int[] sol3={-3,2};
		assertArrayEquals(sol3, MinMax.minMax(ej3));
		int[] ej4= {};
		int[] sol4= null;
		assertArrayEquals(sol4, MinMax.minMax(ej4));
		int[] ej5= {1,1,1};
		int[] sol5={1,1};
		assertArrayEquals(sol5, MinMax.minMax(ej5));
		int[] ej6= null;
		int[] sol6= null;
		assertArrayEquals(sol6, MinMax.minMax(ej6));
	}
}
	