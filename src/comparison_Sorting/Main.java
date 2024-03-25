package comparison_Sorting;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		test1();
		test2();

	}

	private static void test1() {
		
		Name n1 = new Name ("AB", "Ryan");
		Name n2 = new Name ("AB", "Ryan");
		
		System.out.println(n1);
		System.out.println(n2);
		
		System.out.println(n1.equals(n2));
		
	}
	
	private static void test2() {
		
		ArrayList <Name> names = new ArrayList<>();
		names.add(new Name("AB", "Ryan"));
		names.add(new Name("Audri", "Udash"));
		names.add(new Name("Ashraful", "Mahim"));
		names.add(new Name("Mukhlesur", "Rahman"));
		names.add(new Name("Mosfeq", "Anik"));
		names.add(new Name("Jamal", "Kudu"));
		
		
		for(Name n: names)
			System.out.println(n);
		Collections.sort(names);
	}
	

}
