import static org.junit.Assert.*;

import org.junit.Test;


public class TestStudentConstructor {


	// Here we test the constructor of Student class
	
	
	// 1. We test that the object s is not null
	@Test
	public void testRight() {
		
		String name = "Gigel";
		int age = 20;
		Gender gender = Gender.M;
		
		Student s;
		
		try {
			s = new Student(name, age, gender);
			assertNotNull("Testing creating the object Student", s);
		} 
		catch (Exception e) {
			e.printStackTrace();
			fail("arunca exceptie chiar daca varsta este >=18");
		}
	}
	
	
	// 2. We test to see if the attributes have been correctly set
	@Test
	public void testRightSecond() {
		
		String name = "Gigel";
		int age = 20;
		Gender gender = Gender.M;
		
		Student s;
		try {
			s = new Student(name, age, gender);
			
			assertEquals("Testing setting the name ",name, s.getName());
			assertEquals("Testing setting the age ", age, s.getAge());
			assertEquals("Testing setting the gender ", gender, s.getGender());
		} 
		catch (Exception e) {
			e.printStackTrace();
			fail("arunca exceptie chiar daca input este corect");
		}
	}
	
	
	// 3. We test that the method is going to throw an exception
	@Test
	public void testThrowException() {
		
		String name = "Gigel";
		int age = 16; 
		Gender gender = Gender.M;
		
		try {
			Student s = new Student(name, age, gender);
			
			assertTrue(false); 
			
			//assertFalse(true); // This would also fail
			//fail();			 // And this
		} 
		catch (CustomException e) {
			e.printStackTrace();
			
			assertTrue(true);    // This will always pass
		}
	}
}
