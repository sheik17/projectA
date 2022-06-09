package com.chainsys.projectA.startup;


import com.chainsys.projectA.beans.Calender;
import com.chainsys.projectA.getbeans.TestAnnotationConfig;
import com.chainsys.projectA.getbeans.TestClasspathXml;
public class Main {

	public static void main(String[] args) {
		TestClasspathXml.testSetterDi();
		//Calender c1=new Calender();
		//TestAnnotationConfig.testA();
	}
}
