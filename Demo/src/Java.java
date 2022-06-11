import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.stream().map(i->i+2).forEach(System.out::println);
		
	}

}
