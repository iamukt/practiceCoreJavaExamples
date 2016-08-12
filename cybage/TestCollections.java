package cybage;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestCollections 
{
	public static void main(String[] args) 
	{
		Map<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		tmap.put(1, 2);
		tmap.put(2, 3);
		tmap.put(4, 5);
		tmap.put(5, 5);
		Set<Entry<Integer, Integer>> entry = tmap.entrySet();
		System.out.println(entry.iterator().next().getKey());
	}
}
