package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Week10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		//여기서부터 while문 시작하시면 됩니다.
		//while(1){
			String method = scanner.nextLine();
			
			if(method.charAt(0)!='f' && method.charAt(0)!='s') {
				String[] b = method.split(" ");
				if(method.charAt(0)=='a'){
					if(map.get(b[1])!= null)
						System.out.println("error");
					else
						map.put(b[1], b[2]);
				}
				else if(method.charAt(0)=='d'){
					if(map.get(b[1])==null)
						System.out.println("error");
					else
						map.remove(method.split(" ")[1]);
				}
			}
			else {
				String[] b = method.split(" ");
				if(method.charAt(0)=='f') { 
					if(map.get(b[1])== null)
						System.out.println("error");
					else
						System.out.println(map.get(b[1]));;
				}
				else if(method.charAt(0)=='s')	{
					if(map.isEmpty())
						System.out.println("error");
					else {
						for(Entry<String,String> ent: map.entrySet()){
							System.out.println(ent.getKey()+" "+ent.getValue());
						}		
					}
				}
			}
		//}	
		//여기까지입니다.
		scanner.close();
	}

}
