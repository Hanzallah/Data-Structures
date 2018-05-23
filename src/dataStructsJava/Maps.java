package dataStructsJava;
import java.awt.Color;
import java.util.*;


public class Maps {
	public static void main(String[] args) {
		Map<String, Color> map = new HashMap<>();
		
		map.put("Hanzallah", Color.BLUE);
		map.put("John", Color.BLACK);
		map.put("Alice", Color.GREEN);
		
		System.out.println(map.get("Alice"));
		System.out.println();
		map.remove("John");
		
		System.out.println(map);
		
		
		System.out.println();
		for (String key : map.keySet()) {
			System.out.println(key + map.get(key));
		}
	}
}
