
public class Adress {

	public static void main(String[] args) {

		
		Person obj_1 = new Person();
		obj_1.setName("Nikola Siljanovski ");
		
		obj_1.setAddress("Goce Delcev br:5 ");
		
		obj_1.setPoBox(1000);
		
		
		System.out.println("Liceto " + obj_1.getName() + " po poteklo od Gostivar,so ulica na ziveenje " + obj_1.getAddress() + "So poBox " + obj_1.getPoBox() + " .  " );
		
	}



}
