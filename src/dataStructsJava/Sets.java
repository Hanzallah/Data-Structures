package dataStructsJava;

import java.util.*;

public class Sets {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>(); // arranges randomly, fasts search
		TreeSet<String> treeSet = new TreeSet<>(); //  arranges in ascending order
		
		hashSet.add("Hanzallah");
		hashSet.add("Manaal");
		hashSet.add("Alice");
		hashSet.add("Hanzallah");
		
		treeSet.add("Hanzallah");
		treeSet.add("Manaal");
		treeSet.add("Alice");
		treeSet.add("Hanzallah");
		
		System.out.println("===============HashSet===============");
		Iterator<String> iterate = hashSet.iterator();
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		System.out.println(hashSet.contains("David"));
		
		System.out.println("===============TreeSet===============");
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(treeSet.contains("Hanzallah"));
	}
}
