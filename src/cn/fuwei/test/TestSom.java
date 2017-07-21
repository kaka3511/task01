package cn.fuwei.test;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

public class TestSom {
	
	@Test
	public void math(){
		  double a=35;
		  double b=20;
		  double c = a/b;
		  System.out.println(Math.ceil(c)); //2.0
		  System.out.println(Math.floor(c));  //1.0
	}
}
