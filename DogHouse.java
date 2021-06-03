
public class DogHouse {
	Dogs a;
	
	public DogHouse() {
		a = new Dogs();
		a.setName("Max!!!");
	}
	public String getOwner() {
		return a.getName();
	}
	public static void main(String[] args) {
		DogHouse doggy = new DogHouse();
		doggy.a.talk();
	}
}
