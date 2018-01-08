
public class Talent {
	protected String name,first_name,level,specialization_course;
	protected int age;
	
	Talent(String name,String first_name,int age,String level,String specialization_course){
		this.name=name;
		this.first_name=first_name;
		this.age=age;
		this.level=level;
		this.specialization_course=specialization_course;
	}
	public void print() {
		System.out.println("name :"+name);
		System.out.println("First name :"+first_name);
		System.out.println("age :"+age);
		System.out.println("level :"+level);
		System.out.println("Specialization course :"+specialization_course);
	}
	public String getName() {
		return name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLevel() {
		return level;
	}
	public String getSpecialization_course() {
		return specialization_course;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
