package org.percholas;

import java.util.ArrayList;
import java.util.Collections;


public abstract class PrintUsingLambda implements AddTwoNumbers, SubtractTwoNumbers{
	public static void main(String[] args) {
		  ArrayList<String> names = new ArrayList<>();

		   String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};

		   Collections.addAll(names, firstName);
		      //question 1
		      names.forEach(y->{System.out.println(y);});
		      //question 2
		      names.forEach((x)->{System.out.println(x.toUpperCase());});
		      //question 3
		      names.forEach(name->System.out.println(names.indexOf(name)+" "+name));
		      int a=5;
		      int b=6;
		      //question 4
		      AddTwoNumbers p = (a1,b1)->System.out.println(a1+b1);
		      p.add(a, b);
		      //question 5
		      SubtractTwoNumbers s = (a2,b2)->System.out.println(a2-b2);
		      s.sub(a, b);
		      //question 2
		      TestStaticMethod t = new TestStaticMethod();
		      //methodone from interface cannot be called from the class declaration
		      StaticMethods.methodOne();
		      t.methodTwo();
		      
	}


}

interface StaticMethods{
static void methodOne() { System.out.println("m");}
abstract void methodTwo();
}


class TestStaticMethod implements StaticMethods{
	TestStaticMethod(){}

	@Override
	public void methodTwo() {
	System.out.println("M");
		
	}
	
}



@FunctionalInterface
interface AddTwoNumbers {
	void add(int a, int b);
     
}
@FunctionalInterface
 interface SubtractTwoNumbers {
 void sub(int a, int b);
}

