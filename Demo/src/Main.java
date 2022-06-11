import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(13);
		list.add(14);
		list.add(18);
		list.add(14);
		
		List<Integer> list2 = list.stream().filter(i->(i%2==0)).collect(Collectors.toList());
		
		list2.forEach(System.out::println);
		
	}

}
