package com.pure.roxy.normandy;

import java.util.ArrayList;
import java.util.List;

public class hanck 
{
	public static void main(String[] args)
	{
		GenericClass<Number> g1 = new GenericClass(Integer.valueOf(10));
		GenericClass<ArrayList<String>> g2 = new GenericClass(new ArrayList(List.of("a", "b")));
		
		NonGeneric ng1 = new NonGeneric(Double.valueOf(20));
		NonGeneric ng2 = new NonGeneric(new ArrayList(List.of("a", "b")));
		NonGeneric ng3 = new <ArrayList<String>> NonGeneric(new ArrayList(List.of("a", "b")));
		NonGeneric.<String>genericStaticMethod(new String("sushil"));
		NonGeneric.<Exception>genericStaticMethod(new Exception("hi"));
		ng2.genericInstanceMethod(new ArrayList(List.of("a", "b")));
		
	}
}

class GenericClass<T>
{
	T data;
	static T i;
	
	GenericClass(T t)
	{
		this.data = t;
		System.out.println("genric class ctr:"+data.getClass().getName());
	}
	
	public T getData()
	{
		return this.data;
	}
	
}

class NonGeneric
{
	<T> NonGeneric(T data)
	{
		System.out.println("NonGeneric ctr:"+data.getClass().getName());
	}
	
	public static <T> void genericStaticMethod(T data)
	{
		System.out.println("Non generic Static Method:"+data.getClass().getName());
	}
	
	public static <T> T nonGenericMethodWithReturnTypeT(T t)
	{
		return t;
	}
	
	public static <U> U nonGenericMethodWithReturnTypeU(U u)
	{
		return u;
	}

	public <T> void genericInstanceMethod(T data)
	{
		System.out.println("Non generic instance method:"+data.getClass().getName());
	}
}


class Bond<T extends Number, Comparable>
{
	T number;
	Comparable c;
	
	public int getValue(Comparable c1)
	{
		//return this.compareTo(c);
		return 5;
	}
	
	public <T> int getVal()
	{
		return 5;
	}
}
