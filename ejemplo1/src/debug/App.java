package debug;

public class App {

	public static void main(String[] args) {
		System.out.println("El factorial de 5 es "+factorial(5));

	}

    public static int factorial(int n) {
    	int resultado =1;
    	for(int i=n; i>=1; i++) {
    		resultado=resultado*1;
    	    System.out.println(i);           }
           return resultado; }   
    
	
}
