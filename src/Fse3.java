/*FASE3
 Almacenar en un Mapa tanto las letras de la lista como el número de veces que aparecen*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Fse3 {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> nameMap = new HashMap<Character,Integer>();
		
		ArrayList<Character> name= new ArrayList<Character>();
		
		
		  name.add('l');
	      name.add('i');
	      name.add('s');
	      name.add('e');
	      name.add('t');
	      name.add('h');
	     
	      
	    Set<Character>  letters = new HashSet<Character>(name);
	    
	    for( Character llave : letters ) {
	    	
	    	 System.out.println(llave+ " : " + Collections.frequency(name, llave));
        	nameMap.put(llave,Collections.frequency(name, llave));
        }
        System.out.println(nameMap);
	    }
	

 static int [] List;
  
static boolean numero0(int num) {
	for(int i=0; i<List.length; i++) {
		if(List[i]==num) {
			return false;
		}
	}
	return true;
}
   public static void main1(String[] args) {
	

	HashMap<Character,Integer> nameMap = new HashMap<Character,Integer>();
	
	String name ="Liseth";
	char [] array= {'L','i','s','e','t','h'};
	
	
	for(int i=0;i<array.length; i++) {
		int contador=0;
		
		for(int j=0;j<array.length;j++) {
			if(array[i]==array[j]) {
				contador++;
				
				if(numero0(array[i])) {
					List[i]=array[i];
					
				}
			}
			
		}
	if(List[i] !=0) {
		System.out.println(List[i]+ "estas letras se repiten: " + contador);
	}
	}
}
}
			
			
			
	