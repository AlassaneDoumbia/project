import java.util.ArrayList;

public class School {

	private static int numEff;
	School(ArrayList<Talent> list){
		
	}
	public static int getNumEff() {
		return numEff;
	}
	public void addTalent(Talent t) {
		ArrayList<Talent> listTalent= new ArrayList<Talent>();
		listTalent.add(t);
		numEff++;
	}
	public static void main(String[] args) {

	}

}
