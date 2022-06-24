import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.management.Query;

public class Main {

	public static void main(String[] args) {
		
		Ege.ageBreakOrNot(31);
	}
}


class Ege{
	
	public static void ageBreakOrNot(int flore) {
	
		
		for(int i=0;i<=100;i++) {
			if(i>=32 && i<=100) {
				System.out.println("eeg will break at the flore : "+i);
			}else {
				System.out.println("egg will not break at flore : "+i);
			}
		}
		
		
	}
}
