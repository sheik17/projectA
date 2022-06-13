package com.chainsys.springproject.lifecycle;

public class LifeCycle {
		public void print()
		{
			System.out.println("print called");
		}
		public LifeCycle()
		{
			System.out.println("LifeCycleBean has Called");
		}
		public void setUp()
		{
			System.out.println("starting...");
		}
		public void close()
		{
			System.out.println("closing...");
		}
}
