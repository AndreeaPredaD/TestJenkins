
public class Student implements IEvaluable{
	
	private String name;
	private int age;
	private Gender gender;
	private int[] points;
	
	public Student(String name, int age, Gender gender) throws CustomException {
		
		super();
		
		if(age < 18) throw new CustomException();
			this.name = name;		
		this.age = age;
		this.gender = gender;
	}

	public int[] getPoints() {
		return points;
	}

	public void setPoints(int[] points) {
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setNume(String name) {
		this.name = name;
	}

	public void setAge(int age) throws CustomException {
		this.age = age;
	}

	public void setGender(Gender gen) {
		this.gender = gen;
	}

	@Override
	public int[] getScore() {
		return points;
	}

}
