package com.pure.roxy.normandy;

import java.util.ArrayList;
import java.util.List;

public class CombinedClass <T extends Comparable, U>
{
	U instanceField;
	Number instanceNumberField;
	<V extends Number> CombinedClass(U instanceField, V instanceNumber)
	{
		this.instanceField = instanceField;
		this.instanceNumberField = instanceNumber;
		System.out.println("CombinedClass:instanceField>>"+this.instanceField.getClass().getName()+"::"+this.instanceField);
		System.out.println("CombinedClass:instanceNumberField>>"+this.instanceNumberField.getClass().getClass()+"::"+this.instanceNumberField);
	}
	
	public <X, W extends List<X>> X getComparisonResult(T t, T s, W definitions)
	{
		int result = s.compareTo(t);
		if(result != 0)
		{
			result = result<0? -1: 1;
		}
		result++;
		
		return definitions.get(result);
	}
}

class Lola
{
	static List<String> l = new ArrayList<>();
	public static void main(String[] args)
	{
		String s1 = "Anne";
		String s2 = "bob";
		l.add("COME AFTER");
		l.add("EQULAS");
		l.add("IS LISTED BEFORE");
		
		CombinedClass<String, Byte> c1 = new CombinedClass<>(Byte.valueOf("1"), 2);
		String compareString = c1.getComparisonResult(s1, s2, l);
		System.out.println(s1+" "+compareString+" "+s2);
		Integer i1 = 1;
		Integer i2 = 2;
		CombinedClass<Integer, String> c2 = new CombinedClass<>("A combined class", Byte.valueOf("5"));
		c2.getComparisonResult(i1, i2, l);
	}
}
