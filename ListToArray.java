package Task12;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>(); 
		list.add("Honda");
		list.add("BMW");
		list.add("Ford");
		list.add("Hyundai");
		String[] stringArray = list.toArray(new String[0]);

        // Print the original list
        System.out.println("List: " +list);

        // Print the array
        System.out.println("Array: " +Arrays.toString(stringArray));
	}

}
