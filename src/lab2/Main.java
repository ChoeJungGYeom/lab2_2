package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		// Create array list of user-defined class objects
		List<Fruit> al=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1 = new Fruit(101 ,"Apple",1000);
		al.add(s1); // adding Fruit class object
		Fruit s2 = new Fruit(102,"Orange",1500);
		al.add(s2);
		al.add(new Fruit(103,"Kiwi",2000));
		al.add(new Fruit(104,"Grape",3000));
		al.add(new Fruit(105,"Melon",4000));
		al.add(new Fruit(106,"Watermelon",5000));
		al.add(new Fruit(107,"DrangonFruit",7000));
		al.add(new Fruit(108,"Tomato",8000));
		al.add(new Fruit(109,"Banana",9000));
		al.add(new Fruit(110,"Peach",9500));
		
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