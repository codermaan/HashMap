package hashMap;

import java.util.HashMap;
//import java.util.Map;
import java.util.Scanner;

public class CharFrequencyByHashMap {
	static void findFrequency(String str) {
		HashMap<Character, Integer> hmap = new HashMap<>();
		
		char arr[] = str.toCharArray();
		for(char val : arr) {
			if(hmap.containsKey(val)) {
				int preFreq = hmap.get(val);
				preFreq++;
				hmap.put(val, preFreq);
			}
			else
				hmap.put(val, 1);
		}
		
		//print elements in order of occurance
		for(char val : arr) {
			if(hmap.get(val)!=0)System.out.print(val+""+hmap.get(val)+" ");
			hmap.put(val, 0);
		}
		
		//hmap.forEach((key,value) -> System.out.print(key+""+value+" "));
		
		/*for (Map.Entry me : hmap.entrySet()) {
	    **    System.out.println(me.getKey() + " " + me.getValue());
	    }*/
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		findFrequency(str);
		s.close();
	}
}
