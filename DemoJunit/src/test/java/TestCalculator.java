import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.AJDG.DemoJunit.CalculatorService;
import com.AJDG.DemoJunit.Claculator;
import static org.mockito.Mockito.when;

public class TestCalculator {

	Claculator c =null;
	CalculatorService  serv = Mockito.mock(CalculatorService.class);

	
	@Before
	public void setup()
	{
	c=	new Claculator(serv);

	}
	
	@Test
public void testAdd()
{
	when(serv.add(4, 3)).thenReturn((long) 7);	
	assertEquals(28,c.perform(4, 3));
}

	
}
