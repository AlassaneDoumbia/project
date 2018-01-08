
public class TalentForeign extends Talent {
	
	private String country_of_Origin;
	TalentForeign(String name, String first_name, int age, String level, String specialization_course,String country_of_Origin) {
		super(name, first_name, age, level, specialization_course);
		this.country_of_Origin=country_of_Origin;
	}
	
	public void print() {
		super.print();
		//System.out.println("name :"+name);
		//System.out.println("First name :"+first_name);
		//System.out.println("age :"+age);
		//System.out.println("level :"+level);
		//System.out.println("Specialization course :"+specialization_course);
		System.out.println("Country of Origin :"+country_of_Origin);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
