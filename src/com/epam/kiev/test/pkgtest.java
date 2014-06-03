package com.epam.kiev.test;

import static org.junit.Assert.*;

import java.util.EmptyStackException;

//import com.epam.kiev.pkg.MyStack;
import testpkg.MyStack;

import org.junit.Test;

public class pkgtest {
	public MyStack ms=new MyStack();		   
	public MyStack m = new MyStack(5);
	@Test
	public void emptyTest() {
		assertTrue(ms.empty());
	}
	
	@Test
	public void negativeValueTest() {
		try	{
			MyStack d = new MyStack(-1);
		}
		catch (NegativeArraySizeException e) {
			fail();
		}	
		
	}
	
	@Test
	public void pushTest() {
		for (int i=0;;i++) {
			try {
				ms.push(i);
			}
			catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		assertTrue(ms.peek()==9);
	}
	@Test
	public void pushtestWithParam() {
		for (int i=0;;i++) {
			try	{
				m.push(i);
			}
			catch (IndexOutOfBoundsException e) {
				break;
			}
		}
		assertTrue(m.peek()==4);
	}
	
	@Test
	public void popTest() {
		for (int i=0;;i++) {
			try {
				ms.pop();
			}
			catch (EmptyStackException e) {
				break;
			}
		}
		assertTrue(ms.empty());
	}	
	@Test
	public void StackTest() {
		ms.push(1);
		ms.push(2);
		assertTrue(ms.peek()==2);
		assertTrue(ms.pop()==2);
		assertTrue(ms.peek()==1);
	
	}

}
