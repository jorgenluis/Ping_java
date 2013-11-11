package pingJava;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;


public class ping {

	public static void main(String[] args) {
		
		vec();
	
	}
	
	public static void vec(){
		
		String b[]={"z","a","m","b","r"};
		String a[]={"2","3","1","5","9","3"};
		int size=5;
		Vector elements;
		Vector sets=new Vector();
		
		for (int i=0; i<size; i++){
			elements=new Vector();
			elements.add(a[i]);
			elements.add(b[i]);
			sets.add(elements);
		}
		
		System.out.println(sets);
		for(int i=0;i<sets.size()-1;i++){
			
			for(int j=i+1;j<sets.size();j++){
				if(Integer.valueOf(sets.get(i).toString().substring(1, sets.get(i).toString().indexOf(",")))>Integer.valueOf(sets.get(j).toString().substring(1, sets.get(j).toString().indexOf(","))))
				{
					//System.out.println(Integer.valueOf(sets.get(i).toString().substring(1, sets.get(i).toString().indexOf(",")))+">"+Integer.valueOf(sets.get(j).toString().substring(1, sets.get(j).toString().indexOf(","))));
					
				}else{
					System.out.println(Integer.valueOf(sets.get(i).toString().substring(1, sets.get(i).toString().indexOf(",")))+"<"+Integer.valueOf(sets.get(j).toString().substring(1, sets.get(j).toString().indexOf(","))));
					Vector aa=(Vector) sets.get(i);
					Vector bb=(Vector) sets.get(j);
					sets.setElementAt(bb, i);
					sets.setElementAt(aa, j);
//					System.out.println(sets);
				}
			}
//			
		}
		

		System.out.println(sets);
		System.out.println(sets.get(0).toString().substring(1, sets.get(0).toString().indexOf(","))+""+sets.get(0).toString().substring(sets.get(0).toString().indexOf(", ")+1,sets.get(0).toString().length()-1));
	}

}
