package sef.module9.activity.

//Needs to be completed
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetActivity {

	public static void main(String[] args) {
//1 - Type code to create a set of names.
//Names must be sorted by their natural order.
//Do research to find if you already have such a class.
// Also try adding a few duplicate entries to this set.
		Set nameSet = new HashSet();

		nameSet.add("Olivia");
		nameSet.add("Mia");
		nameSet.add("Charlotte");
		nameSet.add("Anna");
		nameSet.add("Sophia");

//2 - Call print method to print the set passed as its parameter.
		print(nameSet);
	}

	static void print(Set set)
	{
//3 - Type code to print this set
//Notice the order in which elements get printed.

		HashMap<Object, Object> list = new HashMap<>();
		list.forEach(System.out::println);

	}