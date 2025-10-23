import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BreakfastTest {

		
	@Test
	public void testThatItConvertsAnAlphabetToUppercase(){
		Breakfast breakfast = new Breakfast();
		String result = breakfast.convert("A");
		
		assertEquals(result, "A");
	}


	@Test
	public void testThatItDoesntAffectAlphabetsThatAreAlreadyInUppercase() {	
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.convert("M");
	
		assertEquals(result, "M");			

	}

	@Test
	public void testThatItReturnsItsOutputInUppercaseEvenWhenTheInputIsInMixedCases(){
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.convert("MarTinS");
	
		assertEquals(result, "MARTINS");			

	}

	@Test
	public void testThatItReturnsAllItsOutputInUppercaseEvenWhenThereIsSpaceInTheString(){
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.convert("MarTinS is really tall");
	
		assertEquals(result, "MARTINS IS REALLY TALL");			

	}


}

