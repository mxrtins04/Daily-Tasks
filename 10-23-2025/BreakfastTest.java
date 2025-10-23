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
		String result = breakfast.getSentence("M");		
		assertEquals(result, "M");			

	}

/*	@Test
	public void testThatASentenceIsCollectedAndConvertedToUpperCase() {	
		Breakfast breakfast = new Breakfast();			
		String result = breakfast.convert("God is good.");		
		assertEquals(result, "GOD IS GOOD.");				

	}
*/
}

