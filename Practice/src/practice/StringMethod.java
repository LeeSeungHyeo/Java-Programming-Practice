package practice;

import java.util.Scanner;

public class StringMethod {
		
		// Returns the string created by adding 's2' after position 'index' of 's1'.
		static String addString(String s1, int index, String s2) {
			int length = s1.length();
			String s3;
			s3=s1.substring(0,index+1);
			s3=s3.concat(s2);
			s3=s3.concat(s1.substring(index+1,length));
			return s3;
		}
		
		// Returns reversed string of 's'
		static String reverse(String s){
			int i=s.length();
			char[] s2=new char[i];
			
			for(int j=0;j<i;j++) {
				s2[j]=s.charAt(i-j-1);
			}
			
			String s3=String.valueOf(s2);
			
			return s3;
		}
		
		// Returns a string with all 's2's removed from 's1'
		static String removeString(String s1, String s2) {
			int len1=s1.length();
			int len2=s2.length();
			int i=0;
			String s3="";
			String s4="";
			while(i<=len1-len2) {
				s3=s1.substring(i,i+len2);
				if(s2.equals(s3)) {
					s4=s4.concat(s1.substring(0,i));
					s4=s4.concat(s1.substring(i+len2));
					s1=s4;
					s4="";
					len1-=len2;
				}
				
				i++;
			}
			
			return s1;
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String a1 = scanner.next();
			int index = scanner.nextInt();
			String a2 = scanner.next();
			
			String reverse = scanner.next();
			
			String remove1 = scanner.next();
			String remove2 = scanner.next();
			
			System.out.println(addString(a1,index,a2));
			System.out.println(reverse(reverse));
			System.out.println(removeString(remove1,remove2));
			scanner.close();
		}
}
