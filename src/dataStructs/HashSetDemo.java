package dataStructs;

import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set = new HashSet(100);
		set.add("Harry");
		set.add("Sue");
		set.add("Nina");
		set.add("Susannah");
		set.add("Larry");
		set.add("Eve");
		set.add("Sarah");
		set.add("Adam");
		set.add("Tony");
		set.add("Katherine");
		set.add("Juliet");
		set.add("Romeo");
		set.remove("Romeo");
		set.remove("George");
		
		Iterator<String> iter = set.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
