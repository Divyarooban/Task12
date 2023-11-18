package Task12;
import java.util.ArrayList;

public class Arraylistelements {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Honda");
		list.add("BMW");
		list.add("Ford");
		list.add("Hyundai");
		System.out.println("The Elements in the list before removal are "+list);
		list.clear();
		System.out.println("The Elements in the list after removal are "+list);

	}

}
