import static org.junit.Assert.*;

import org.junit.Test;

public class TestSetDepartment {

	@Test
	public void testRight() throws CustomException {
		Employee e = new Employee("Gigel",20,Department.HR);
		e.setDepartment(Department.PR);
		assertEquals("testare set specializare",Department.PR, e.getDepartment());
	}
	
	@Test
	public void testInverseRelationship() throws CustomException {
		//testez cu ce nu mai trebuie sa fie
		Employee e = new Employee("Gigel",20,Department.HR);
		e.setDepartment(Department.PR);
		
		//s-a produs o modificare
		assertNotEquals("testare set specializare",Department.HR, e.getDepartment());
	}
	
	@Test
	public void testInersePeAddProf() throws CustomException {
		Employee e = new Employee("Gigel",20,Department.HR);
		e.addManager("Prof1");
		e.removeManager();
		assertEquals("dim array prof",0,e.getManagers().size());
	}

}
