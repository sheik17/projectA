package com.chainsys.springproject.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class AnnotationLc {
		public AnnotationLc()
		{
			System.out.println("Annotaion object created : "+hashCode());
		}
		@PostConstruct
		public void start()
		{
			System.out.println("Start AnnotationLc..");
		}
		@PreDestroy
		public void close()
		{
			System.out.println("Close AnnotationLc...");
		}
		public void print()
		{
			System.out.println("AnnotationLc Called");
		}
}
