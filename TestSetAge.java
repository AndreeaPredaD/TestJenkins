import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
			ex.printStackTrace();
			fail("arunca exceptie pe varsta min acceptata");
			
		}
	}
	

	@Test
	public void testBoundary2() {
		//testare daca limitele sunt definite corect 
		Employee e;
		try {
			e = new Employee("Gigel",20,Department.HR);
			e.setAge(64);
			assertEquals("verif set varsta maxima",64,e.getAge());
			
		} catch (CustomException ex) {
			ex.printStackTrace();
			fail("arunca exceptie pe varsta max acceptata");
		}
	}
	
	@Test
	public void testBoundary3() {
		//testare daca limitele sunt definite corect 
		Employee s;
		try {
			s = new Employee("Gigel",20,Department.IT);
			s.setAge(17);
			fail("nu arunca exceptie pe varsta in afara intervalului");
			
		} catch (CustomException ex) {
			//ex.printStackTrace();
			assertTrue(true);
		}
	}
	
	@Test
	public void testBoundary4() {
		//testare daca limitele sunt definite corect 
		Employee s;
		try {
			s = new Employee("Gigel",20,Department.IT);
			s.setAge(65);
			fail("nu arunca exceptie pe varsta in afara intervalului");
			
		} catch (CustomException e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = CustomException.class) //"assertul"
	public void testErrors() throws CustomException {
		
		//testare situatii care genereaza exceptii
		
		Employee s = new Employee("Gigel",20,Department.IT);
		s.setAge(80);
	}
	

}
