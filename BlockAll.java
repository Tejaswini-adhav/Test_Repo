package com.allBlock5;

class BlockAll
{
	static
	{
		System.out.println("---Static Block---");
	}

	{
		System.out.println("---Non Static Block---");
	} 

	BlockAll()
	{
		System.out.println("--Default Constructor---");
	}

	public void m1()
	{
		System.out.println("--M1 method---");
	}

	public static void main(String [] args)
	{
		System.out.println("-----Main method---");
		BlockAll a=new BlockAll();
		a.m1();
	} 
}