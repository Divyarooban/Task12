package Task12;
import java.util.*;

public class TreemapEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> employee = new TreeMap<>();
		employee.put(102,"Dinesh");
		employee.put(104,"Raja");
		employee.put(101,"Praneeth");
		employee.put(103,"Divya");
		System.out.println("Employee details in the Alphabetical order");
		for (Map.Entry<Integer, String> entry : employee.entrySet()) {
            int employeeId = entry.getKey();
            String employeeName = entry.getValue();

            System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName);
        }
	}

}
