package com.lambda.main;

import java.util.List;

public class Main {

	@FunctionalInterface
	interface CheckPerson{
		boolean test(Person p);
	}
	
	static class CheckPersonEligibleForSelectiveSearch implements CheckPerson{

		@Override
		public boolean test(Person p) {
			
			return p.gender == Person.Sex.Male && 
					p.getAge()>=18 &&
					p.getAge()<=25;
		}
		
	}
	
	public static void printPersonOlderThan(List<Person> people,int age) {
		for(Person p: people) {
			if(p.getAge() >= age) {
				p.printperson();
			}
		}
	}
	
	public static void printpersonWithinAgeRange(List<Person> people,int low,int high) {
		for(Person p:people) {
			if(low <= p.getAge() && p.getAge()<high) {
				p.printperson();
			}
		}
	}
	
	public static void printPeople(List<Person> people,CheckPerson tester) {
		for(Person p:people) {
			
				if(tester.test(p)) {
					p.printperson();
				}
			}
		}
	
	
	
	public static void main(String[] args) {
		List<Person> people=Person.generateDefaultList();
		//printPersonOlderThan(people,20);
		//printpersonWithinAgeRange(people, 18,22);
	//	printPeople(people,new CheckPersonEligibleForSelectiveSearch() );
		
		printPeople(people, p ->  {
					
						return p.gender == Person.Sex.Male && 
						p.getAge()>=18 &&
						p.getAge()<=25;
			
		});
	}
}
