import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Java {

	public static void main(String[] args) {

		Map<String, Integer> map=new HashMap<>();
		
		map.put("saurabh", 10);
		map.put("parbhani", 20);
		map.put("latur", 30);
		map.put("pune", 40);
		map.put("mumbai", 50);
		
		//Entry<String, Integer> entry=(Entry<String, Integer>) map.entrySet();
		
		Set<Entry<String, Integer>> set=map.entrySet();
	 
		for(Entry<String, Integer> s:set) {
			System.out.println(s.getKey()+"  "+s.getValue());
		}
		
	
		
	}

}
