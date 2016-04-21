package pers.test3;
//1.此处引入Scanner类
import java.util.Scanner;

class ReadStringClass{
	private Scanner scan;
	
	public   ReadStringClass(){
		 //2.此处并为scan赋值：引用实例化Scanner类的对象
		scan=new Scanner(System.in);
	}
	
	public String readString(){
		String input;
		System.out.println("please input a string: ");
		input=scan.nextLine();
		//3.此处返回所读取的字符串
		return input;
	}
	
}

class EstimateStringClass{
	private int numberOfUppercase;
	private int numberOfLowercase;
	
	public void estimateString(String str){
		//4.此处为多行代码，用以判断字符串中大小写个数，并存入变量
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c>='a' && c<='z'){
				numberOfLowercase++;
			}
			if(c>='A' && c<='Z'){
				numberOfUppercase++;
			}
		}
	}
	
	public void printResults(){
		System.out.println("Number of uppercase: "+numberOfUppercase);
		System.out.println("Number of lowercase: "+numberOfLowercase);
	}
}

public class Question3{
	public static void main(String[] args){
		//5.此处为多行代码以实现对上述方法的测试：用户输入字符串，输出判断结果
		String  s;
		
		ReadStringClass test=new ReadStringClass();
		EstimateStringClass test2=new EstimateStringClass();
		
		s=test.readString();
		
		test2.estimateString(s);
		test2.printResults();
		
	}
}
