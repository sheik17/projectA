package com.chainsys.projectA.startup;


import com.chainsys.projectA.beans.Calender;
import com.chainsys.projectA.test.TestAnnotationConfig;
import com.chainsys.projectA.test.TestClasspathXml;
import com.chainsys.projectA.test.TestXmlBeanFactory;
public class Main {

	public static void main(String[] args) {
		//TestClasspathXml.testSetterDi();
		//Calender c1=new Calender();
		//TestAnnotationConfig.testA();
		TestXmlBeanFactory.testA();
	}
}
