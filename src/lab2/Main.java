package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		// Create array list of user-defined class objects
		List<Fruit> al=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101 ,"Kim",23);
		al.add(s1); // adding Fruit class object
		Fruit s2 = new Fruit(102,"Choi",21);
		al.add(s2);
		al.add(new Fruit(103,"Park",25));
		
		Collections.sort(al);
		for (Fruit s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for (int i=0; i<al.size();i++) {
			System.out.println(al.get(i).toString());
		}
	}
}