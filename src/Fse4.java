/*FASE4
Crea otra lista con tu apellido donde cada posici�n corresponda a una letra.
Combinar las dos listas en una sola. Adem�s, a�ade una posici�n con un espacio vac�o entre la primera y la segunda. Es decir, partimos de la lista name y surname y al terminar la ejecuci�n s�lo tendremos una que se llamar� fullname
 */

import java.util.ArrayList;
import java.util.List;

public class Fse4 {

	public static void main(String[] args) {
	
		char [] Name={'l','i','s','e','t','h'};
		char[] Lastname= {'a','r','i','a','s'};
		
		
     List<Character> name=new ArrayList<Character>();
    
    name.add('l');
    name.add('i');
    name.add('s');
    name.add('e');
    name.add('t');
    name.add('h');
    
    
    List<Character> lastname=new ArrayList<Character>();
    
    lastname.add('a');
    lastname.add('r');
    lastname.add('i');
    lastname.add('a');
    lastname.add('s');
    
    List<Character> fullname=new ArrayList<Character>();
    
    fullname.addAll(name);
    fullname.add(' ');
    fullname.addAll(lastname);
    
    System.out.println(fullname);
    
	}
}	