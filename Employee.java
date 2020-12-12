import java.util.ArrayList;

public class Employee {

	String name; //lungime minima 5
	int age; //cuprinsa intre [18;65)
	int[] grades;
	Department department;
	ArrayList<String> managers = new ArrayList<>();

	public ArrayList<String> getManagers() {
		return managers;
	}

	public void setManagers(ArrayList<String> managers) {
		this.managers = managers;
	}

	public void addManager(String newManager) {
		managers.add(newManager);
	}
	
	public void removeManager() {
		managers.remove(managers.size()-1);
	}
	
	public Employee(String name, int age, Department department) throws CustomException {
		super();
		
		if(name.length() < 5 || age < 18 || age >= 65)
			throw new CustomException();
		
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws CustomException {
		if(age < 18 || age >= 65)
			throw new CustomException();
		this.age = age;
	}
	
	public int[] getGrades() {
		return grades;
	}
	
	public void setGrades(int[] grades) {
		this.grades = grades;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
