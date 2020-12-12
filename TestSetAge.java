import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestSetAge {

	@Test
	public void testRight() {
		Employee e;
		try {
			e = new Employee("Gigel",20,Department.HR);
			e.setAge(24);
			assertEquals("verif set varsta",24,e.getAge());
		} catch (CustomException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			fail("set nu arunca exceptie pentru varsta normala");
		}
	}
	
	@Test
	public void testBoundary1() {
		//testare daca limitele sunt definite corect 
		Employee e;
		
		try {
			
			e = new Employee("Gigel",20,Department.HR);
			e.setAge(18);
			assertEquals("verif set varsta minima",18,e.getAge());
			
		} catch (CustomException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			fail("arunca exceptie pe varsta min acceptata");
			
		}
	}
	

}
