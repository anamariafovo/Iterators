package iterators;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;



public class Main {

	public static void main(String[] args) {
		
		
				/* ====================== Fail-Fast ====================== */
	
	
  		// FOR ARRAY LISTS
 
		List<String> arr_list = new ArrayList<>();
		arr_list.add("one");
		arr_list.add("two");
		arr_list.add("three");
		arr_list.add("four");
		arr_list.add("five");
		
		Iterator<String> it1 = arr_list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			//arr_list.add("six"); 	   //error
			//arr_list.remove("two");  //error
			//arr_list.set(2, "3");    //no error (no structural change)
			//it1.remove();  		   //no error
		}
	
/*
  		// FOR VECTORS
 
		List<String> v_list = new Vector<>();
		v_list.add("one");
		v_list.add("two");
		v_list.add("three");
		v_list.add("four");
		v_list.add("five");
		
		Iterator<String> it2 = v_list.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
			//v_list.add("six");  	  //error
			//v_list.remove("two");   //error
			//it2.remove();       	  //no error
		}
*/
/*		
 		// FOR MAPS
 
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		
		Iterator<Map.Entry<Integer, String>> it3 = map.entrySet().iterator();
		while(it3.hasNext())
		{
			Map.Entry<Integer, String> entry = it3.next();
			System.out.println(entry.getKey() + "->" + entry.getValue());
			//map.remove(2); 	  //error
			//map.put(6, "six");  //error
			//it3.remove(); 	  //no error
		}
*/	
	
	
				/* ====================== Fail-Safe ====================== */
	
/*		
		List<String> arr_list = new CopyOnWriteArrayList<>();
		arr_list.add("one");
		arr_list.add("two");
		arr_list.add("three");
		arr_list.add("four");
		arr_list.add("five");
		
		Iterator<String> it1 = arr_list.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			//arr_list.add("six");  //no error
			//arr_list.remove(2);   //no error
			//it1.remove();         //error
		}
*/
/*
		Vector<String> v = new Vector<>();
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		v.add("five");
		
		Enumeration<String> v_enum = v.elements();
		while(v_enum.hasMoreElements())
		{
			String s = v_enum.nextElement();
			System.out.println(s);
			if(s == "five")
				v.add("six");  //no error
		}
*/
/*
		Set<String> set = new ConcurrentSkipListSet<>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		Iterator<String> it4 = set.iterator();
		while(it4.hasNext())
		{
			String s = it4.next();
			System.out.println(s);
			if(s == "five")
				set.add("six");
		}
*/
	}
}
	

