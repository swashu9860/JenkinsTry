package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public class trials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, String> hm = new HashMap<>();
hm.put("test", "One");
hm.put("test2", "Two");
hm.put("test3", "Three");
hm.put("test4", "Four");
hm.put("test5", "Five");
Set <String> keys = hm.keySet();

List<Map.Entry<String, String>> lst = new ArrayList<Map.Entry<String, String>>(hm.entrySet());
Collections.sort(lst, (i1,i2)->i1.getValue().compareTo(i2.getValue()));
HashMap<String, String> sortedhm = new LinkedHashMap<>();

for(Map.Entry<String, String> entry:lst) {
	sortedhm.put(entry.getKey(), entry.getValue());
}

System.out.println(sortedhm);

	}

}
