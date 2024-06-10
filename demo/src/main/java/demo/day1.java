package demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class day1 {
	public static void main(String [] args) {
		
		String str = "abc56xyz";
		
		//cba zyx
		
		//String [] strsplit = str.split(" ");
		 
		String [] strsplit2 = str.split("[a-zA-Z]+");
		System.out.println(strsplit2[0]);
		//String revH1 = reversestr(strsplit[0]);
		//String revH2 = reversestr(strsplit[1]);
		
		///System.out.println( revH1 + " " + revH2);
			}
	
	public static String reversestr(String strs) {
		
		int len = strs.length();
		String temp = "";
		for (int i=0; i<len; i++) {
			temp = strs.charAt(i) + temp;
		}
		return temp;
		
	}
}
