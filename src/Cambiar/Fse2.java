
/*FASE2
Canvia la taula per una llista (List<Character>)
Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’.
Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!’.*/


package Cambiar;

import java.util.ArrayList;

public class Fse2 {

	
	
	public static void main(String[] args) {
		
		
		ArrayList <Character> name=new ArrayList<Character>();
		
      name.add('l');
      name.add('i');
      name.add('s');
      name.add('e');
      name.add('t');
      name.add('h');
    		  
    System.out.println(name);
      
		
		char [] vocal = {'a','e','i','o','u'};
		
		char []  numero = {'1','2','3','4','5','6','7','8','9','0'};
		
		boolean vocal0= false;
		
		boolean numero0=false;
		
		
		
		for( int i=0; i<name.size(); i++) {
		
			System.out.println(name.get(i));
		
      for(int h=0; h< numero.length; h++) {
		
         
		if(numero[h]==name.get(i)){
		
			
			System.out.println("Nombre sin numeros" );
			numero0=true;
		}
	}
	
 if(numero0==false) { 
	 for(int p=0; p<vocal.length; p++) {  //bucle en la array//
		 
		if(vocal[p]== Character.toLowerCase(name.get(i))) {
			
			 System.out.println("Es vocal");
			 vocal0=true;
	 }
 }
	
	if (vocal0==false) {
		
		System.out.println("Es consonante");
	}
 }

 vocal0=false;
 numero0=false;
}
	}
}
  
