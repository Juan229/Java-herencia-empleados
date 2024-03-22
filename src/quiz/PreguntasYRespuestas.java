package quiz;

	import java.util.Scanner;

	public class PreguntasYRespuestas {
	      
	public static void main(String[] args) {       
	            System.out.println("Por favor, responde las siguientes preguntas:");
	           
	            System.out.println("1. ¿Cuál es la diferencia entre una clase `Persona` y una clase `Empleado` en términos de atributos y métodos?");
	            System.out.println("   La principal diferencia radica en que la clase `Empleado` hereda de la clase `Persona`, lo que significa que tiene todos los atributos y métodos de la clase `Persona` más sus propios atributos y métodos adicionales. En términos de atributos, `Empleado` tiene atributos como salario y cargo, que `Persona` no tiene. En términos de métodos, `Empleado` puede tener métodos específicos relacionados con su trabajo, además de los métodos que comparte con `Persona`.");
	            
	            System.out.println("2. ¿Cómo se establece la relación de herencia entre `Empleado` y `Persona` en Java?");
	            System.out.println("   La relación de herencia entre `Empleado` y `Persona` se establece mediante la palabra clave `extends` en la definición de clase. Específicamente, la declaración de clase para `Empleado` sería: `class Empleado extends Persona {...}`. Esto indica que `Empleado` hereda todos los atributos y métodos de la clase `Persona`.");
	            
	            System.out.println("3. ¿Qué es un constructor en Java y cuál es su propósito?");
	            System.out.println("   Un constructor en Java es un método especial que se llama automáticamente cuando se crea un objeto de una clase. Su propósito principal es inicializar los atributos de un objeto a ciertos valores iniciales. En otras palabras, se utiliza para configurar el estado inicial de un objeto.");
	            
	            System.out.println("4. ¿Por qué es útil utilizar la herencia en la programación orientada a objetos?");
	            System.out.println("   La herencia es útil en la programación orientada a objetos por varias razones. Primero, permite la reutilización de código al heredar atributos y métodos de una clase base. Segundo, facilita la organización y la estructura del código al establecer relaciones jerárquicas entre clases. Tercero, promueve la extensibilidad, ya que nuevas clases pueden extender las funcionalidades de las clases existentes.");
	          
	            System.out.println("5. ¿Cómo se llama el proceso de crear un objeto a partir de una clase en Java?");
	            System.out.println("   El proceso de crear un objeto a partir de una clase en Java se llama instanciación.");
	            

	           
	            Scanner scanner = new Scanner(System.in);

	        
	            System.out.println("\nPor favor, ingresa tus respuestas:");

	          
	            System.out.print("Respuesta a la pregunta 1: ");
	            String respuesta1 = scanner.nextLine();

	            System.out.print("Respuesta a la pregunta 2: ");
	            String respuesta2 = scanner.nextLine();

	   
	            System.out.print("Respuesta a la pregunta 3: ");
	            String respuesta3 = scanner.nextLine();

	   
	            System.out.print("Respuesta a la pregunta 4: ");
	            String respuesta4 = scanner.nextLine();

	         
	            System.out.print("Respuesta a la pregunta 5: ");
	            String respuesta5 = scanner.nextLine();

	     
	            System.out.println("\nTus respuestas:");
	            System.out.println("1. " + respuesta1);
	            System.out.println("2. " + respuesta2);
	            System.out.println("3. " + respuesta3);
	            System.out.println("4. " + respuesta4);
	            System.out.println("5. " + respuesta5);


	            scanner.close();
	        }
	    

	    }
	


	
	


