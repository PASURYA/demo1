package org.com.program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Programming {
	public static void main(String[] args) {
//		int c=0;
//		for (int i = 1; i <=100; i++) {
//			if (i%2==0) {
//			c=	c+i;
//				
//			}
//			
//		
//		
//		}
//		System.out.println(c);  
		String s = "java application";
	
		String s1="";
		
//		String res = "";
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (res.indexOf(c)<0) {
//				res = res + c;
//			}
//		}
//		System.out.println(res);
		
//		for(int i=0;i<s.length();i++) {
//			count=0;
//			for(int j=i+1;j<s.length();j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					count++;
//				}
//				
//			}
//			if(count==0) {
//				s1=s1+s.charAt(i);
//			}
//			
//		}
//		System.out.println(s1);
//		
		Map<Character,Integer> ma = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char charAt = s.charAt(i);
			
			if(ma.containsKey(charAt)) {
				Integer integer = ma.get(charAt);
				ma.put(charAt, integer+1);
			}
			else {
				ma.put(charAt, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entrySet = ma.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Integer value = entry.getValue();
			if(value==1) {
				Character key = entry.getKey();
				s1=s1+key;
			}
			
		}
		System.out.println(s1);
		
		
		
	}

}
