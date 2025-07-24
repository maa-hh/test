package stusy.one;

import java.io.File;
//import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


public class test {
	static final double PI = 3.14;
	public static void main(String[] args)throws Exception {
		File f=new File("D:\\commons-io-2.19.0-bin\\commons-io-2.19.0\\NOTICE.txt");
		File f2=new File("D:\\commons-io-2.19.0-bin\\commons-io-2.19.0\\NOTICE1.txt");
		try{
			FileUtils.copyFile(f,f2);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("PI:"+PI);
		String s[][]=new String[10][4];
		String s1[][]={{"123"}};
		System.out.println(s1[0][0].charAt(0));
	//	String s2[][]=new String[][]{{"123"},{"234"}};
		s[0][0]="1";
		System.out.println("Hello,World!");
		print("123");
		scanner();
		System.out.println(100f);
		Innertest ss=new Innertest("abc",12,13);
		ss.setA(13);
		System.out.println(ss.toString());
		ss.print();
	}
	static void print(String s){
		s.length();
		System.out.println(s);
	}
	public static void print(char s){
		System.out.println(s);
	}
	public static void print(int s){
		System.out.println(s);
	}
	public static void scanner() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String c=sc.nextLine();
		char sex= sc.next().charAt(0); 
		print(s);
		print(c);
		print(sex);
		sc.close();
	}
	Innertest in=new Innertest("1",3,7);
}
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of={"s1","a","b"})
class Innertest {
	String s1;
	int a;
	int b;

public void print(){
		System.out.println("innertest");
	}
public int sum(){
	return a+b;
}
	
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class stu{
	private String id;
	private int age;
	private String name;
}