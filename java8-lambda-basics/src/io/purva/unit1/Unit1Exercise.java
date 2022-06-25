package io.purva.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.purva.Person;

import java.util.Comparator;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charu","Ammu",30),
					new Person("Sri","Sree",60),
					new Person("Seetha","Chandra",40),
					new Person("Ram","Char",50)
				);
		
		// step 1: sort list by last name
		// step 2: create a method that prints all elements in the list
		// step 3: create a method that prints all people that have ;ast name beginning with C
		
		// to achieve above approach using java 7
		//step 1: java 7 way
		Collections.sort(people, new Comparator<Person>() {
			
			@Override
			public int compare(Person obj1, Person obj2) {
				return obj1.getLastName().compareTo(obj2.getLastName());
			}
			
		});
		
		//step 2: java 7 way
		printAll(people);
		
		System.out.println();
		
		//step 3: java 7 way
		printLastnameBeginningWithC(people);
		
		//step 3: java 7 way - second solution using anonmous inner class
		System.out.println("print all person with last name beginning with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		});
		
		System.out.println("print all person with first name beginning with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
			
		});
	}
	
	public static void printConditionally(List<Person> people, Condition c) {
		for(Person p : people) {
			if(c.test(p)) {
				System.out.println(p);
			}
		}
	}

	public static void printLastnameBeginningWithC(List<Person> people) {
		for(Person p : people) {
			if(p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}
	
	
	public static void printAll(List<Person> people) {
		for(Person p: people) {
			System.out.println(p);
		}
	}
	
	interface Condition {
		boolean test(Person p);
	}
}
