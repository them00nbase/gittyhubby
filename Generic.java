package fileDirectory;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {

		ArrayList<String> al_s = new ArrayList<String>();
		ArrayList<Character> al_c = new ArrayList<Character>();
		ArrayList<Integer> al_i = new ArrayList<Integer>();

		al_s.add("Aaron Hernandez");
		al_s.add("Aaron Funiz");
		al_s.add("Aaron Manoz");
		System.out.println("=============================================");
		al_c.add('A');
		al_c.add('S');
		al_c.add('S');

		al_i.add(2);
		al_i.add(3);
		al_i.add(345345345);

		GenericPrintList(al_s);
		GenericPrintList(al_c);
		GenericPrintList(al_i);

	}
	
	public static <E> void GenericPrintList(ArrayList<E> listName) {

		for (E item : listName) {
			System.out.println(item);
		
		}
	}
}
