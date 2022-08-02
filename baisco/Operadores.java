package cursoJava.baisco;

/*
 * Classe de explicação e demonstração dos operadores
 * */


public class Operadores {

	public static void main(String[] args) {
		
		
		// Operadoeres aritméticos + - * / %
		
		
		System.out.println("Raiz Quadrada: "+Math.sqrt(25));
		System.out.println("Raiz Cúbica: "+Math.cbrt(27));
		System.out.println("Potência: "+Math.pow(2,10));
		
		System.out.println("============================");
		
			
		 
		int numero1=10, numero2=8;
	
		/*
		int resultado1 = numero1 + numero2;
		
		int resultado2 = numero1 - numero2;
		
		int resultado3 = numero1 * numero2;
		
		double resultado4 = (double)numero1 / numero2;
		
		int resultado5 = numero1 % numero2;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(resultado3);
		System.out.println(resultado4);
		System.out.println(resultado5);
		
		
		//numero1 = numero1 + 1
		 
		
		System.out.println(numero1++);
		System.out.println(++numero1);
		System.out.println(numero1+=10);
		System.out.println(numero1*=3);
		System.out.println(numero1/=4);
		
		
		
		System.out.println(numero1==numero2);
		System.out.println(numero1!=numero2);
		
		System.out.println("======================");
		
		System.out.println(numero1 > numero2);
		System.out.println(numero1 >= numero2);
		System.out.println(numero1 < numero2);
		System.out.println(numero1 <= numero2);
		
		*/
		
		// Operadores líogicos && || 
		System.out.println("falso E falso: "+(false&&false));
		System.out.println("falso E verdadeiro: "+(false&&true));
		System.out.println("verdadeiro E falso: "+ (true&&false));
		System.out.println("verdadeiro E verdadeiro: "+(true&&true));
		
		System.out.println("=========================");
		
		System.out.println("falso OU falso: "+(false||false));
		System.out.println("falso OU verdadeiro: "+(false||true));
		System.out.println("verdadeiro OU falso: "+ (true||false));
		System.out.println("verdadeiro OU verdadeiro: "+(true||true));
		
	}
}
